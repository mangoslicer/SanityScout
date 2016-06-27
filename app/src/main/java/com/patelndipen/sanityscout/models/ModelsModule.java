package com.patelndipen.sanityscout.models;

import android.support.annotation.NonNull;

import com.patelndipen.sanityscout.api.SanityScoutRestApi;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelsModule {

    @Provides @NonNull
    public LocationModel provideLocationsModel(@NonNull SanityScoutRestApi sanityScoutRestApi) {
        return new LocationModel(sanityScoutRestApi);
    }

}
