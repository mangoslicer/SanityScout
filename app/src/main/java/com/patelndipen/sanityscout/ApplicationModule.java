package com.patelndipen.sanityscout;

import android.app.Application;
import android.support.annotation.NonNull;

import dagger.Module;

@Module
public class ApplicationModule {

    @NonNull
    private final Application application;

    public ApplicationModule(@NonNull Application application) {
        this.application = application;
    }


}
