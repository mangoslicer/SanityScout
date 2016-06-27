package com.patelndipen.sanityscout.api;


import org.junit.Test;

import okhttp3.HttpUrl;

import static org.assertj.core.api.Assertions.assertThat;

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
