package com.patelndipen.sanityscout.network;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class NetworkModule {

    @Provides @NonNull @Singleton
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

}
