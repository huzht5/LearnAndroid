package com.example.learnandroid.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    private static final String TAG = "FileUtils";

    public static boolean createFile(String filePath) {
        if (filePath == null) {
            DebugLog.e(TAG, "[createFile] filePath is null, return false!");
            return false;
        }
        File file = new File(filePath);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            DebugLog.e(TAG, "[createFile] parentFile is null, return false!");
            return false;
        }
        parentFile.mkdirs();
        try {
            return file.createNewFile();
        } catch (IOException e) {
            DebugLog.e(TAG, "[createFile] " + e);
        }
        return false;
    }
}
