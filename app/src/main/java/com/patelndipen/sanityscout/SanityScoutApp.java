package com.patelndipen.sanityscout;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

public class SanityScoutApp extends Application {
    private ApplicationComponent applicationComponent;

    @NonNull
    public static SanityScoutApp get(Context context) {
        return (SanityScoutApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = prepareApplicationComponent().build();
        applicationComponent.inject(this);
    }

    @NonNull
    protected DaggerApplicationComponent.Builder prepareApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this));
    }

    @NonNull
    public ApplicationComponent applicationComponent() {
        return applicationComponent;
    }

}
