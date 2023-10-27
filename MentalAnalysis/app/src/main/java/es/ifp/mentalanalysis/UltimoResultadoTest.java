package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class UltimoResultadoTest extends AppCompatActivity {

    protected Button bvolver;
    protected BBDDSQL db;
    protected MediaPlayer mp;
    protected Bundle extras;
    protected String paquete;
    protected int testId;
    protected TextView resultadoLabel,tituloPantalla;
    protected String res;


    protected Intent pasarPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ultimo_resultado_test);

        db = new BBDDSQL(this);
        bvolver = (Button) findViewById(R.id.boton_volver4);
        resultadoLabel = (TextView) findViewById(R.id.textView4);
        tituloPantalla = (TextView) findViewById(R.id.textView3);


        extras = getIntent().getExtras();
        if (extras != null) {
            paquete = extras.getString("ultTes");
            testId = Integer.parseInt(paquete);

            if (testId == 1) {
                tituloPantalla.setText("Historial Último Test 1");
                res = db.getUltimoResultado(1);
                resultadoLabel.setText(res);



            } else if (testId == 2) {

                tituloPantalla.setText("Historial Último Test 2");
                res = db.getUltimoResultado(2);
                resultadoLabel.setText(res);


            }
             else if (testId == 3) {
                tituloPantalla.setText("Historial Último Test 3");
                res = db.getUltimoResultado(3);
                resultadoLabel.setText(res);


            }

    }


        bvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(UltimoResultadoTest.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                pasarPantalla = new Intent(UltimoResultadoTest.this, elegirActivity.class);
                startActivity(pasarPantalla);
                finish();


            }
        });




    }


}