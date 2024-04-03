package com.raghava.instasleb;

import android.content.Context;
import android.util.DisplayMetrics;

public class textUtils {

    public static float getRelativeTextSize(Context context, float baseTextSize) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float scaledDensity = displayMetrics.scaledDensity;
        return baseTextSize * scaledDensity;
    }
}
