package com.osvaldovillalobosperez.misserviciosp77b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MiServicioEnlazado miServicioEnlazado;
    boolean mBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnStartIS(View view) {
        Intent miIS = new Intent(this, MiIntentService.class);

        startService(miIS);

        Toast.makeText(this, "Iniciado IS", Toast.LENGTH_LONG);
    }

    public void btnSerInic(View view) {
        Intent miS = new Intent(this, MiServicio.class);

        startService(miS);

        Toast.makeText(this, "Iniciado S", Toast.LENGTH_LONG);
    }

    public void btnSS_clic(View view) {
        Intent miIS = new Intent(this, MiServicio.class);
        stopService(miIS);
        Log.d("XXXs", "Servicio destruido");
    }

    public void onButtonClick(View v) {
        if (mBound) {
            int num = miServicioEnlazado.getRandomNumber();
            Toast.makeText(this, "number: " + num, Toast.LENGTH_SHORT).show();
        }
    }

    ServiceConnection sconect = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MiServicioEnlazado.MiBinder miB = (MiServicioEnlazado.MiBinder) iBinder;

            miServicioEnlazado = miB.getService();

            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mBound = false;
        }
    };
}
