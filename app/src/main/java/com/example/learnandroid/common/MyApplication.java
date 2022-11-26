package com.example.learnandroid.common;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.example.learnandroid.utils.DebugLog;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    @SuppressLint("StaticFieldLeak")
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        DebugLog.d(TAG, "[onCreate]");
        sContext = getApplicationContext();
    }
}
