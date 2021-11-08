package com.example.lab6;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

public interface onRequestPermissionsResult extends ActivityCompat.OnRequestPermissionsResultCallback {
    void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);
}
