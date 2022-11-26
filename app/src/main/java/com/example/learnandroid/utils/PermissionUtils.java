package com.example.learnandroid.utils;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.annotation.IntRange;
import androidx.core.app.ActivityCompat;

import com.example.learnandroid.common.MyApplication;

import java.util.ArrayList;
import java.util.List;

public class PermissionUtils {
    private static final String TAG = "PermissionUtils";

    public static void requestPermissions(Activity activity, String[] permissions, @IntRange(from = 0) int requestCode) {
        if (permissions == null) {
            DebugLog.e(TAG, "[requestPermissions] permissions is null, return!");
            return;
        }
        if (permissions.length == 0) {
            DebugLog.e(TAG, "[requestPermissions] permissions.length is 0, return!");
            return;
        }
        List<String> requestList = new ArrayList<>();
        for (String permission : permissions) {
            if (PackageManager.PERMISSION_GRANTED != ActivityCompat.checkSelfPermission(MyApplication.sContext, permission)) {
                requestList.add(permission);
            }
        }
        if (requestList.size() == 0) {
            DebugLog.d(TAG, "[requestPermissions] no need to request any permission");
        } else {
            ActivityCompat.requestPermissions(activity, requestList.toArray(new String[0]), requestCode);
        }
    }
}
