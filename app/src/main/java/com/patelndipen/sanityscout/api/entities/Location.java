package com.patelndipen.sanityscout.api.entities;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.sql.Time;

/**
 * The Location class contains attributes common to all location (e.g. study, dining, and rec locations)
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Location.Builder.class)
public abstract class Location {

    private static final String JSON_PROPERTY_ID = "id";
    private static final String JSON_PROPERTY_LOCATIONNAME = "location_name";
    private static final String JSON_PROPERTY_OPENINGTIME = "opening_time";
    private static final String JSON_PROPERTY_CLOSINGTIME = "closing_time";
    private static final String JSON_PROPERTY_ADDRESS = "address";

    @NonNull
    @JsonProperty(JSON_PROPERTY_ID)
    public abstract String id();

    @NonNull
    @JsonProperty(JSON_PROPERTY_LOCATIONNAME)
    public abstract String locationName();

    @NonNull
    @JsonProperty(JSON_PROPERTY_OPENINGTIME)
    public abstract Time openingTime();

    @NonNull
    @JsonProperty(JSON_PROPERTY_CLOSINGTIME)
    public abstract Time closingTime();

    @NonNull
    @JsonProperty(JSON_PROPERTY_ADDRESS)
    public abstract String address();

    @AutoValue.Builder
    public static abstract class Builder {

        @NonNull
        @JsonProperty(JSON_PROPERTY_ID)
        public abstract Builder id(@NonNull String id);

        @NonNull
        @JsonProperty(JSON_PROPERTY_LOCATIONNAME)
        public abstract Builder locationName(@NonNull String locationName);

        @NonNull
        @JsonProperty(JSON_PROPERTY_OPENINGTIME)
        public abstract Builder openingTime(@NonNull Time openingTime);

        @NonNull
        @JsonProperty(JSON_PROPERTY_CLOSINGTIME)
        public abstract Builder closingTime(@NonNull Time closingTime);

        @NonNull
        @JsonProperty(JSON_PROPERTY_ADDRESS)
        public abstract Builder address(@NonNull String address);

        @NonNull
        public abstract Location build();

    }


}
