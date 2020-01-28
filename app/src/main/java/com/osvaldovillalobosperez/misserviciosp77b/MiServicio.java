package com.osvaldovillalobosperez.misserviciosp77b;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MiServicio extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("XXXs", "Trabajando el service");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        Log.d("XXXs", "onCreate service");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d("XXXs", "onDestroy service");
        super.onDestroy();
    }
}
