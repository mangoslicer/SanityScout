package com.patelndipen.sanityscout.api.entities;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

/**
 * Attributes common to all study locations
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_StudyLocation.Builder.class)
public abstract class StudyLocation {

    private static final String JSON_PROPERTY_WHITEBOARDS = "whiteboards";
    private static final String JSON_PROPERTY_ROLLEYCHAIRS = "rolley_chairs";
    private static final String JSON_PROPERTY_PUBLICCOMPUTERS = "public_computers";

    @NonNull
    @JsonProperty(JSON_PROPERTY_WHITEBOARDS)
    public abstract Boolean whiteboards();

    @NonNull
    @JsonProperty(JSON_PROPERTY_ROLLEYCHAIRS)
    public abstract Boolean rolleyChairs();

    @NonNull
    @JsonProperty(JSON_PROPERTY_PUBLICCOMPUTERS)
    public abstract Boolean publicComputers();

    @AutoValue.Builder
    public static abstract class Builder {

        @NonNull
        @JsonProperty(JSON_PROPERTY_WHITEBOARDS)
        public abstract Builder whiteboards(Boolean isWhiteboards);

        @NonNull
        @JsonProperty(JSON_PROPERTY_ROLLEYCHAIRS)
        public abstract Builder rolleyChairs(Boolean isRolleyChairs);

        @NonNull
        @JsonProperty(JSON_PROPERTY_PUBLICCOMPUTERS)
        public abstract Builder publicComputers(Boolean isPublicComputers);

        @NonNull
        public abstract StudyLocation build();
    }
}
