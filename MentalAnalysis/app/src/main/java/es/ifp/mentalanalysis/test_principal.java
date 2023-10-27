package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class test_principal extends AppCompatActivity {

    protected Intent pasarPantalla;
    protected Button bvolver;
    protected Button botonEmpezar;
    protected MediaPlayer mp;
    protected Bundle extras;
    protected String paquete;
    protected int testId;
    protected TextView descripcion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_test_principal);

        bvolver = (Button) findViewById(R.id.boton_volver);
        botonEmpezar = (Button) findViewById(R.id.boton_empezar_test);
        descripcion = (TextView) findViewById(R.id.descripcionTest);


        //Recibe los paquetes llamados "id" de la pantalla elegirActivity para mostrar la descripcion del test selccionado
        extras = getIntent().getExtras();
        if (extras != null) {
            paquete = extras.getString("id");
            testId = Integer.parseInt(paquete);

            //Añadir las descripciones de los tests
            if (testId==1) {
                descripcion.setText("Este test tiene como objetivo evaluar de manera orientativa" +
                        "tu estado emocional. ");
            } else if (testId==2) {
                descripcion.setText("Este test te va a servir para evaluar de manera orientaiva" +
                        "si tienes niveles de estres y ansiedad.");
            } else if (testId==3) {
                descripcion.setText("Este test tiene como objetivo evaluar de manera orientativa si " +
                        "necesitas ayuda con el control del consumo de sustancias como drogas y alcohol ademas del impacto que puede ocasionarte a ti y " +
                        "a los que te rodean.");
            }

        } else {
            Toast.makeText(test_principal.this, ("Error"), Toast.LENGTH_SHORT).show();
        }


        //Boton volver
        bvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(test_principal.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla = new Intent(test_principal.this, elegirActivity.class);
                startActivity(pasarPantalla);
                finish();

            }
        });


        //Boton empezar test seleccionado, y envia un paquete a la pantalla TestElegido con una "id" que es el numero del test
        botonEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(test_principal.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

               if (testId==1) {

                   pasarPantalla = new Intent(test_principal.this, TestElegido.class);
                   paquete = "1";
                   pasarPantalla.putExtra("id", paquete);
                   startActivity(pasarPantalla);
                   finish();
               } else if (testId==2) {

                   pasarPantalla = new Intent(test_principal.this, TestElegido.class);
                   paquete = "2";
                   pasarPantalla.putExtra("id", paquete);
                   startActivity(pasarPantalla);
                   finish();

               }  else if (testId==3) {

                pasarPantalla = new Intent(test_principal.this, TestElegido.class);
                paquete = "3";
                pasarPantalla.putExtra("id", paquete);
                startActivity(pasarPantalla);
                finish();

            }




            }
        });


    }
}