package com.example.myapplication1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    // tao service
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Sucess", "Service da duoc khoi tao");
    }

    // ham huy service
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Sucess", "Service da duoc huy");
    }
}
