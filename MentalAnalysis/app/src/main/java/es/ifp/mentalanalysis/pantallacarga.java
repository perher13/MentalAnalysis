package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class pantallacarga extends AppCompatActivity {


    protected ProgressBar barra;
    protected TextView label;
    protected Intent pasarPantalla;
    protected int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pantallacarga);

        barra = (ProgressBar) findViewById(R.id.progressBar3);
        label = (TextView) findViewById(R.id.label_generando);

        TimerTask tt1 = new TimerTask() {
            @Override
            public void run() {

                label.setText("Generando Resultado ..");

            }
        };
        Timer t = new Timer();
        t.schedule(tt1,1000);
        label.setText("Generando Resultado .");




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pasarPantalla= new Intent(pantallacarga.this, resultado.class);
                startActivity(pasarPantalla);
                finish();

            }

        }, 2000); // SI QUEREIS PONERLO EN MENOS SEGUNDOS O MAS, CAMBIAR ESTE VALOR (LO ACABO DE PONER EN 1000 para que a la hora de pruebas vaya mas rápido, estaba en 3000)




    }






}