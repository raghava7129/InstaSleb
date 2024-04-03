package com.raghava.instasleb;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class textUtils {

    public static float getRelativeTextSize(Context context, float baseTextSize) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float scaledDensity = displayMetrics.scaledDensity;
        return baseTextSize * scaledDensity;
    }

    public static void resetDisplayMetrics() {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        metrics.density = DisplayMetrics.DENSITY_DEFAULT;
        metrics.scaledDensity = DisplayMetrics.DENSITY_DEFAULT;
        metrics.densityDpi = DisplayMetrics.DENSITY_DEFAULT;
    }
}
