package com.patelndipen.sanityscout;

import android.app.Application;
import android.support.annotation.NonNull;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    public static final String MAIN_THREAD_HANDLER = "main_thread_handler";

    @NonNull
    private final Application application;

    public ApplicationModule(@NonNull Application application) {
        this.application = application;
    }

    @Provides @NonNull @Singleton
    public Application provideSanityScoutApp() {
        return application;
    }

    @Provides @NonNull @Singleton
    public ObjectMapper providesObjectMapper() {
        return new ObjectMapper();
    }
}
