package com.osvaldovillalobosperez.misserviciosp77b;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Random;

public class MiServicioEnlazado extends Service {

    private final IBinder binder = new MiBinder();

    private final Random mGenerator = new Random();

    public MiServicioEnlazado() {

    }

    public class MiBinder extends Binder {

        public MiServicioEnlazado getService() {
            return MiServicioEnlazado.this;
        }

    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }

}
