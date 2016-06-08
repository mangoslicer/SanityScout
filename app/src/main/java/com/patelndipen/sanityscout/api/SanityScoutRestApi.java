package com.patelndipen.sanityscout.api;

import android.support.annotation.NonNull;

import com.patelndipen.sanityscout.api.entities.Location;

import java.util.List;

import retrofit2.http.GET;
import rx.Single;

public interface SanityScoutRestApi {

    @GET("locations") @NonNull
    Single<List<Location>> locations();

}
