package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// ELEGIR
public class elegirActivity extends AppCompatActivity {

    protected ImageView logo1;
    protected TextView label1;
    protected TextView label2;
    protected TextView label3;
    protected TextView label4;
    protected TextView label5;
    protected Button boton1;
    protected Button boton2;
    protected Button boton3;
    protected Button boton4;
    protected Intent pasarPantalla;
    protected MediaPlayer mp;


    protected String paquete = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_elegir);

        // hay que id los que haya, hasta aqui he llegado chavales
        logo1 = (ImageView) findViewById(R.id.logo1_elegir);
        boton1 = (Button) findViewById(R.id.boton1_elegir);
        boton2 = (Button) findViewById(R.id.boton2_elegir);
        boton3 = (Button) findViewById(R.id.boton3_elegir);
        boton4 = (Button) findViewById(R.id.boton4_elegir);


        //ENVIO DE PAQUETES A TEST_PRINCIPAL DEPENDIENDO EL BOTON PULSADO


        //Boton TEST - 1 para ir a la página de la desripcion del test
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(elegirActivity.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla = new Intent(elegirActivity.this, test_principal.class);
                paquete = "1";
                pasarPantalla.putExtra("id", paquete);
                startActivity(pasarPantalla);
                finish();


            }
        });

        //Boton TEST - 2 para ir a la página de la desripcion del test
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(elegirActivity.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla = new Intent(elegirActivity.this, test_principal.class);
                paquete = "2";
                pasarPantalla.putExtra("id", paquete);
                startActivity(pasarPantalla);
                finish();


            }
        });


        //Boton TEST - 3 para ir a la página de la desripcion del test
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(elegirActivity.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla = new Intent(elegirActivity.this, test_principal.class);
                paquete = "3";
                pasarPantalla.putExtra("id", paquete);
                startActivity(pasarPantalla);
                finish();

            }
        });


        //Pulsando el logo de Mental Analysis, te lleva a inicio
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarPantalla = new Intent(elegirActivity.this, firstActivity.class);
                startActivity(pasarPantalla);
                finish();
            }
        });


    }
}