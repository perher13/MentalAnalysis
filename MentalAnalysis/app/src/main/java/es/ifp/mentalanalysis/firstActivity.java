package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


// PRIMERA INTERACCION DE USUARIO

public class firstActivity extends AppCompatActivity {

    protected ImageView logo1;
    protected TextView label1;
    protected Intent pasarPantalla;

    protected MediaPlayer mp;
    protected Button b;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_first);

        logo1 = (ImageView) findViewById(R.id.logo1_first);


        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sonido al pulsar boton
                mp = MediaPlayer.create(firstActivity.this, R.raw.sinicio);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla= new Intent(firstActivity.this, elegirActivity.class);
                startActivity(pasarPantalla);
                finish();
            }
        });



    }
}