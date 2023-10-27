package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;
    protected Button boton1;
    protected Intent pasarPantalla;
    protected BBDDSQL db;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_resultado);

        label1= (TextView) findViewById(R.id.label1_resultado);
        label2= (TextView) findViewById(R.id.label2_resultado);
        boton1= (Button) findViewById(R.id.boton_resultado);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantalla = new Intent(resultado.this, firstActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

    }
}