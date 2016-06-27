package com.patelndipen.sanityscout;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.patelndipen.sanityscout.api.ApiModule;
import com.patelndipen.sanityscout.api.ChangeableBaseUrl;
import com.patelndipen.sanityscout.api.SanityScoutRestApi;
import com.patelndipen.sanityscout.network.NetworkModule;
import com.patelndipen.sanityscout.ui.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
        ApiModule.class,
})
public interface ApplicationComponent {

    @NonNull
    SanityScoutRestApi sanityScoutRestApi();

    @NonNull
    ChangeableBaseUrl changeableBaseUrl();

    @NonNull
    ObjectMapper objectMapper();

    void inject(@NonNull MainActivity mainActivity);

}