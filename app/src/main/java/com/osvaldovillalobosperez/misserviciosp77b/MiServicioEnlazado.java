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

    /**
     * 3ra parte de la nota final.
     */
    private final IBinder binder = new MiBinder();

    private final Random mGenerator = new Random();

    public MiServicioEnlazado() {

    }

    /**
     * Primera parte de la nota final.
     */
    public class MiBinder extends Binder {

        /**
         * Segunda parte de la nota final.
         * @return
         */
        public MiServicioEnlazado getService() {
            return MiServicioEnlazado.this;
        }

    }

    /**
     * Cuarto paso de la nota final.
     * @param intent
     * @return
     */
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }

    /* Binder es la conexión de la interface. */

    /* Bind sirve para consultar información del servicio, se enchufa para realizar una función u
    * obtener información. */

    /* 1.- Crear clase interna con extención de Binder.
    *  2.- Extender un metodo de clase getService - Devolver la instancia de ejecución.
    *  3.- Crear a nivel del servicio una instancia del Binder creado a nivel de la clase, crear
    * un objeto Binder.
    *  4.- En el onBind se retorna el objeto creado de la implementación del Binder. */
}
