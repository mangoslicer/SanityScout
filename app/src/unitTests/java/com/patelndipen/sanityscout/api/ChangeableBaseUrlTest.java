package com.patelndipen.sanityscout.api;


import android.os.Build;

import com.patelndipen.sanityscout.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import okhttp3.HttpUrl;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class ChangeableBaseUrlTest {

    @Test
    public void constructor_shouldUsePassedBaseUrl() {
        ChangeableBaseUrl changeableBaseUrl = new ChangeableBaseUrl("http://sanityscoutapi.com");
        assertThat(changeableBaseUrl.url()).isEqualTo(HttpUrl.parse("http://sanityscoutapi.com"));
    }

    @Test
    public void setBaseUrl() {
        ChangeableBaseUrl changeableBaseUrl = new ChangeableBaseUrl("http://sanityscoutapi.com");
        changeableBaseUrl.setBaseUrl("http://newapi.com");
        assertThat(changeableBaseUrl.url()).isEqualTo(HttpUrl.parse("http://newapi.com"));
    }
}
