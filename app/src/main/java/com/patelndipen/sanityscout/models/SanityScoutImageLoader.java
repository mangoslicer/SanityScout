package com.patelndipen.sanityscout.models;

import android.support.annotation.NonNull;
import android.widget.ImageView;

public interface SanityScoutImageLoader {
    void downloadInto(@NonNull String url, @NonNull ImageView imageView);
}
