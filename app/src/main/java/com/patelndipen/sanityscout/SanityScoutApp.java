package com.patelndipen.sanityscout;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

public class SanityScoutApp extends Application {

    private ApplicationComponent applicationComponent;

    @NonNull
    public static SanityScoutApp get(Context context) {

        //Casted to SanityScoutApp for the purposes of limiting the behavior of the returned Application Context
        return (SanityScoutApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = prepareApplicationComponent().build();
    }

    @NonNull
    protected DaggerApplicationComponent.Builder prepareApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this));
                //.apiModule(new ApiModule("http://newapi.com"));
    }

    @NonNull
    public ApplicationComponent applicationComponent() {
        return applicationComponent;
    }

}
