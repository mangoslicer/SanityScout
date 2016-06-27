package com.patelndipen.sanityscout.models;

import com.patelndipen.sanityscout.api.SanityScoutRestApi;
import com.patelndipen.sanityscout.api.entities.Location;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import rx.Single;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LocationModelsTest {
    private SanityScoutRestApi sanityScoutRestApi;
    private LocationModel locationModel;

    @Before
    public void beforeEachTest() {
        sanityScoutRestApi = mock(SanityScoutRestApi.class);
        locationModel = new LocationModel(sanityScoutRestApi);
    }

    @Test
    public void getLocations_shouldReturnLocations() {
        List<Location> locations = asList(mock(Location.class), mock(Location.class));
        when(sanityScoutRestApi.locations("test")).thenReturn(Single.just(locations));

        assertThat(locationModel.getLocations("test").toBlocking().value()).containsExactlyElementsOf(locations);
    }

    @Test
    public void getItems_shouldReturnErrorFromQualityMattersRestApi() {
        Exception error = new RuntimeException();
        when(sanityScoutRestApi.locations("test")).thenReturn(Single.error(error));

        try {
            locationModel.getLocations("test").toBlocking().value();
            failBecauseExceptionWasNotThrown(RuntimeException.class);
        } catch (Exception expected) {
            assertThat(expected).isSameAs(error);
        }
    }
}
