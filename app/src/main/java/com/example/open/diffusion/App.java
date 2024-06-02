package com.example.open.diffusion;

import android.app.Application;

import ai.onnxruntime.OrtEnvironment;

public class App extends Application {
    public static final OrtEnvironment ENVIRONMENT = OrtEnvironment.getEnvironment();
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtils.init(this);
    }
}
