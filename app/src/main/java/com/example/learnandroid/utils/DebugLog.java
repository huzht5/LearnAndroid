package com.example.learnandroid.utils;

import android.util.Log;

public class DebugLog {
    private static final String LOG_PREFIX = "HZT.";
    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static int sLevel = VERBOSE;

    public static void v(String tag, String msg) {
        if (sLevel <= VERBOSE) {
            Log.v(LOG_PREFIX + tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (sLevel <= DEBUG) {
            Log.d(LOG_PREFIX + tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (sLevel <= INFO) {
            Log.i(LOG_PREFIX + tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (sLevel <= WARN) {
            Log.w(LOG_PREFIX + tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (sLevel <= ERROR) {
            Log.e(LOG_PREFIX + tag, msg);
        }
    }
}
