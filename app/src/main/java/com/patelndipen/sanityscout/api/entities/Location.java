package com.patelndipen.sanityscout.api.entities;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_Location.Builder.class)
public abstract class Location {

    @NonNull
    public abstract String locationName();

    @NonNull
    public abstract String locationType();

    @NonNull
    public abstract String address();

    @NonNull
    public abstract String openingTime();

    @NonNull
    public abstract String closingTime();

    @NonNull
    public abstract String[] locationLuxuries();

    @NonNull
    public abstract String imagePath();

    @AutoValue.Builder
    public static abstract class Builder {

        @NonNull
        public abstract Builder locationName(@NonNull final String locationName);

        @NonNull
        public abstract Builder address(@NonNull final String address);

        @NonNull
        public abstract Builder openingTime(@NonNull final String openingTime);

        @NonNull
        public abstract Builder closingTime(@NonNull final String closingTime);

        @NonNull
        public abstract Builder locationLuxuries(@NonNull final String[] locationLuxuries);

        @NonNull
        public abstract Builder imagePath(@NonNull final String imagePath);

        @NonNull
        public abstract Location build();

    }


}
