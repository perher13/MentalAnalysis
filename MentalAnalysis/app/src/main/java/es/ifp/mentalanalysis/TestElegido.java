package es.ifp.mentalanalysis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class TestElegido extends AppCompatActivity {
    protected BBDDSQL db;
    protected Intent pasarPantalla;
    protected Button bRespuesta1;
    protected Button bRespuesta2;
    protected Button bRespuesta3;
    protected Button bRespuesta4;
    protected TextView label_numTest;
    protected Button bvolver;
    protected TextView tPregunta;
    protected MediaPlayer mp;
    protected Bundle extras;
    protected String paquete;
    protected String pregunta;
    protected String respuesta1;
    protected String respuesta2;
    protected String respuesta3;
    protected String respuesta4;
    protected int testId;
    protected ProgressBar barra;
    protected int contador = 0;
    protected int puntuaje = 0;  //DAR PUNTUAJE A LAS RESPUESTAS PARA EL RESULTADO


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_test_elegido);

        bRespuesta1 = (Button) findViewById(R.id.boton_respuesta1);
        bRespuesta2 = (Button) findViewById(R.id.boton_respuesta2);
        bRespuesta3 = (Button) findViewById(R.id.boton_respuesta3);
        bRespuesta4 = (Button) findViewById(R.id.boton_respuesta4);
        bvolver = (Button) findViewById(R.id.boton_volver2);
        tPregunta = (TextView) findViewById(R.id.label_pregunta_test);
        label_numTest = (TextView) findViewById(R.id.textView2);
        db = new BBDDSQL(this);
        barra = (ProgressBar) findViewById(R.id.progressBar);


        //Botono volver a elegirActivity con un POP UP de aviso
        bvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                AlertDialog.Builder builder = new AlertDialog.Builder(TestElegido.this);
                builder.setTitle("¿Quires volver al menú?");
                builder.setMessage("Si vuelves perderás todo el progreso del Test");
                builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        pasarPantalla = new Intent(TestElegido.this, elegirActivity.class);
                        pasarPantalla.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(pasarPantalla);
                    }
                });

                builder.setNegativeButton("NO", null);
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });


        //Test elegido recibido por paquete
        extras = getIntent().getExtras();
        if (extras != null) {
            paquete = extras.getString("id");
            testId = Integer.parseInt(paquete);


            if (testId == 1) {
                //TEST 1
                //PREGUNTA
                label_numTest.setText("Test 1");
                mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                //Pasar pregunta
                contador = contador + 1;
                generarPreguntaT1(contador);

                //Darle puntuación a pregunta


                //RESPUESTA - BOTON 1
                bRespuesta1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT1(contador);

                        //Darle puntuación a respuesta


                    }
                });

                //RESPUESTA - BOTON 2
                bRespuesta2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT1(contador);

                        //Darle puntuación a respuesta
                    }
                });

                //RESPUESTA - BOTON 3
                bRespuesta3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT1(contador);

                        //Darle puntuación a respuesta

                    }
                });

                //RESPUESTA - BOTON 4
                bRespuesta4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT1(contador);

                        //Darle puntuación a respuesta

                    }
                });

            //TEST3
            } else if (testId == 2) {
                //TEST 2
                //Hacer lo mismo que en test1 pero crendo otra función(con distinto nombre ya vale)
                label_numTest.setText("Test 2");

                //PREGUNTA

                mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                //Pasar pregunta
                contador = contador + 1;
                generarPreguntaT2(contador);

                //Darle puntuación a pregunta


                //RESPUESTA - BOTON 1
                bRespuesta1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT2(contador);

                        //Darle puntuación a respuesta

                    }
                });

                //RESPUESTA - BOTON 2
                bRespuesta2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT2(contador);

                        //Darle puntuación a respuesta
                    }
                });

                //RESPUESTA - BOTON 3
                bRespuesta3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT2(contador);

                        //Darle puntuación a respuesta

                    }
                });

                //RESPUESTA - BOTON 4
                bRespuesta4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT2(contador);

                        //Darle puntuación a respuesta

                    }
                });


            } else if (testId == 3) {
                //TEST 3
                //Hacer lo mismo que en test1 pero crendo otra función(con distinto nombre ya vale)
                label_numTest.setText("Test 3");

                //PREGUNTA

                mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                    }
                });
                mp.start();

                //Pasar pregunta
                contador = contador + 1;
                generarPreguntaT3(contador);

                //Darle puntuación a pregunta


                //RESPUESTA - BOTON 1
                bRespuesta1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT3(contador);

                        //Darle puntuación a respuesta

                    }
                });

                //RESPUESTA - BOTON 2
                bRespuesta2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT3(contador);

                        //Darle puntuación a respuesta
                    }
                });

                //RESPUESTA - BOTON 3
                bRespuesta3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT3(contador);

                        //Darle puntuación a respuesta

                    }
                });

                //RESPUESTA - BOTON 4
                bRespuesta4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp = MediaPlayer.create(TestElegido.this, R.raw.sboton);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();

                        //Pasar pregunta
                        contador = contador + 1;
                        generarPreguntaT3(contador);

                        //Darle puntuación a respuesta

                    }
                });

            }


        } else {
            Toast.makeText(TestElegido.this, ("Error"), Toast.LENGTH_SHORT).show();
        }


    }

    //Fucnión para generar las preguntas y que vayan cambiando

    //FUNCION T1
    public void generarPreguntaT1(int contador) {


        if (contador > 25) {// 25 por que hay 25 preguntas

            Toast.makeText(this, "Test Terminado", Toast.LENGTH_SHORT).show();
            pasarPantalla = new Intent(TestElegido.this, pantallacarga.class);
            startActivity(pasarPantalla);
            finish();


        } else {

            progresoT1(contador);
            pregunta = (db.getPregunta("test_1", contador));
            tPregunta.setText(pregunta);
            respuesta1 = (db.getRespuesta1("test_1", contador));
            bRespuesta1.setText(respuesta1);
            respuesta2 = (db.getRespuesta2("test_1", contador));
            bRespuesta2.setText(respuesta2);
            respuesta3 = (db.getRespuesta3("test_1", contador));
            bRespuesta3.setText(respuesta3);
            respuesta4 = (db.getRespuesta4("test_1", contador));
            bRespuesta4.setText(respuesta4);
        }

    }

    //DUNCION T2

    public void generarPreguntaT2(int contador) {


        if (contador > 25) {// 25 por que hay 25 preguntas

            Toast.makeText(this, "Test Terminado", Toast.LENGTH_SHORT).show();
            pasarPantalla = new Intent(TestElegido.this, pantallacarga.class);
            startActivity(pasarPantalla);
            finish();


        } else {

            progresoT2(contador);
            pregunta = (db.getPregunta("test_2", contador));
            tPregunta.setText(pregunta);
            respuesta1 = (db.getRespuesta1("test_2", contador));
            bRespuesta1.setText(respuesta1);
            respuesta2 = (db.getRespuesta2("test_2", contador));
            bRespuesta2.setText(respuesta2);
            respuesta3 = (db.getRespuesta3("test_2", contador));
            bRespuesta3.setText(respuesta3);
            respuesta4 = (db.getRespuesta4("test_2", contador));
            bRespuesta4.setText(respuesta4);

        }


    }

    //FUNCION3

    public void generarPreguntaT3(int contador) {


        if (contador > 20) {// 25 por que hay 25 preguntas

            Toast.makeText(this, "Test Terminado", Toast.LENGTH_SHORT).show();
            pasarPantalla = new Intent(TestElegido.this, pantallacarga.class);
            startActivity(pasarPantalla);
            finish();


        } else {

            progresoT3(contador);
            pregunta = (db.getPregunta("test_3", contador));
            tPregunta.setText(pregunta);
            respuesta1 = (db.getRespuesta1("test_3", contador));
            bRespuesta1.setText(respuesta1);
            respuesta2 = (db.getRespuesta2("test_3", contador));
            bRespuesta2.setText(respuesta2);
            respuesta3 = (db.getRespuesta3("test_3", contador));
            bRespuesta3.setText(respuesta3);
            respuesta4 = (db.getRespuesta4("test_3", contador));
            bRespuesta4.setText(respuesta4);

        }


    }
//Métodos para que la barra vay auamentando
    public void progresoT1(int cont) {
        barra.setMax(25);

        for (int t = 0; t <= 100; t = t + 20) {

            for (int y = 0; y <= 4; y = y + 1) {

                barra.setProgress(cont);

            }


        }


    }
    public void progresoT2(int cont) {

        for (int t = 0; t <= 100; t = t + 20) {

            for (int y = 0; y <= 4; y = y + 1) {

                barra.setProgress(cont);

            }


        }


    }
    public void progresoT3(int cont) {
    barra.setMax(20);
        for (int t = 0; t <= 100; t = t + 20) {

            for (int y = 0; y <= 4; y = y + 1) {

                if(cont <= 20){
                    barra.setProgress(cont);
                }
            }
        }

    }




}

