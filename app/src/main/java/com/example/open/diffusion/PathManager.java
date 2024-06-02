package com.example.open.diffusion;

import android.content.Context;

public class PathManager {
    public static String getModelPath(Context context){
        return context.getFilesDir().getAbsolutePath()+"/model";
    }

    public static String getAsssetOutputPath(Context context){
        return context.getFilesDir().getAbsolutePath();
    }

    public static String getCustomPath(Context context){
        return context.getFilesDir().getAbsolutePath()+"/custom";
    }
}
