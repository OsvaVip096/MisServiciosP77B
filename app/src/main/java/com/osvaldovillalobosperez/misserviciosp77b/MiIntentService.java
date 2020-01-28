package com.osvaldovillalobosperez.misserviciosp77b;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MiIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MiIntentService(String name) {
        super(name);
    }

    /**
     * Constructor es requerido y debe ser llamada la clase super.
     */
    public MiIntentService() {
        super("MiIntentService");
    }

    /**
     * Llama el servicio
     *
     * @param intent
     */
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Toast.makeText(this, "Inicia subproceso", Toast.LENGTH_LONG);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Subproceso destruido", Toast.LENGTH_LONG);
        super.onDestroy();
    }
}
