package com.example.learnandroid;

import android.Manifest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.learnandroid.common.MyApplication;
import com.example.learnandroid.utils.DebugLog;
import com.example.learnandroid.utils.FileUtils;
import com.example.learnandroid.utils.PermissionUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionUtils.requestPermissions(this, new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);

        FileUtils.createFile(MyApplication.sContext.getExternalFilesDir(null).getAbsolutePath()
                + File.separator + "test" + File.separator + "1" + File.separator + "1.txt");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) {
            for (String permission : permissions) {
                DebugLog.d(TAG, "[onRequestPermissionsResult] permission = " + permission);
            }
        }
    }
}