package com.patelndipen.sanityscout.api;

import android.support.annotation.NonNull;

import java.util.concurrent.atomic.AtomicReference;

import okhttp3.HttpUrl;
import retrofit2.BaseUrl;

/**
 *  Such class is shared by integration and functional tests for the purposes of swapping in mock Url's
 *  Idea for creating this class is courtesy of qualitymatters, an amazing Android-best-practices app released by Artem Zinnatullin
 */
public class ChangeableBaseUrl implements BaseUrl {

    @NonNull
    private final AtomicReference<HttpUrl> baseUrl;

    public ChangeableBaseUrl(@NonNull String baseUrl) {
        this.baseUrl = new AtomicReference<>(HttpUrl.parse(baseUrl));
    }

    public void setBaseUrl(@NonNull String baseUrl) {
        this.baseUrl.set(HttpUrl.parse(baseUrl));
    }

    @Override @NonNull
    public HttpUrl url() {
        return baseUrl.get();
    }

}
