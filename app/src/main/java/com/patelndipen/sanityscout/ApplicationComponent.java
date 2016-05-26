package com.patelndipen.sanityscout;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
    ApplicationModule.class
})

public interface ApplicationComponent {

    void inject(@NonNull SanityScoutApp sanityScoutApp);

    void inject(@NonNull MainActivity mainActivity);

}