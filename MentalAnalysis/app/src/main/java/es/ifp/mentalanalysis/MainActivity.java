package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

// PANTALLA QUE SE PASARA A LOS 3 SEGUNDOS
public class MainActivity extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;
    protected ImageView logo1;
    protected Intent pasarPantalla;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        label1 =(TextView) findViewById(R.id.label1_start);
        label2 =(TextView) findViewById(R.id.label2_start);






        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pasarPantalla= new Intent(MainActivity.this, firstActivity.class);
                startActivity(pasarPantalla);
                finish();

            }

        }, 1000); // SI QUEREIS PONERLO EN MENOS SEGUNDOS O MAS, CAMBIAR ESTE VALOR (LO ACABO DE PONER EN 1000 para que a la hora de pruebas vaya mas rápido, estaba en 3000)


    }



}