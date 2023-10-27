package es.ifp.mentalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class VerPreguntasTests extends AppCompatActivity {

    protected BBDDSQL db;


    protected Intent pasarPantalla;

    protected ListView lista1;
    protected ArrayAdapter adaptador;
    protected ArrayList<String> filas = new ArrayList<String>();

    protected String contenidoItem = "";
    protected String[] partes;
    protected String paquete = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_preguntas_tests);
        db = new BBDDSQL(this);


        lista1 = (ListView) findViewById(R.id.lista);
        filas = db.getTodosTests();
        adaptador = new ArrayAdapter<String>(VerPreguntasTests.this, android.R.layout.simple_list_item_1, filas);
        lista1.setAdapter(adaptador);




    }
}