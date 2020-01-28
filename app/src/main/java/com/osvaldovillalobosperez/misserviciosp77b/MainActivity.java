package com.osvaldovillalobosperez.misserviciosp77b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnStartIS(View view) {
        Intent miIS = new Intent(this, MiIntentService.class);

        startService(miIS);

        Toast.makeText(this, "Iniciado", Toast.LENGTH_LONG);
    }

    public void btnSerInic(View view) {
        Intent miS = new Intent(this, MiServicio.class);

        startService(miS);

        Toast.makeText(this, "Iniciado", Toast.LENGTH_LONG);
    }
}
