package com.patelndipen.sanityscout.models;

import android.support.annotation.NonNull;

import com.patelndipen.sanityscout.api.SanityScoutRestApi;
import com.patelndipen.sanityscout.api.entities.Location;

import java.util.List;

import rx.Single;

public class LocationModel {

    @NonNull
    private final SanityScoutRestApi sanityScoutRestApi;

    public LocationModel(@NonNull SanityScoutRestApi sanityScoutRestApi) {
        this.sanityScoutRestApi = sanityScoutRestApi;
    }

    @NonNull
    public Single<List<Location>> getLocations(@NonNull final String locationType) {
        return sanityScoutRestApi.locations(locationType);
    }
}
