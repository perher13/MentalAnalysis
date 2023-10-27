package es.ifp.mentalanalysis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

//La base de datos se llama TESTS y está compuesta por 3 tablas, cada una un test


public class BBDDSQL extends SQLiteOpenHelper {

    protected SQLiteDatabase db;


    public BBDDSQL(Context context) {
        super(context, "TESTS", null, 5);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        //TABLA TEST 1
        db.execSQL("CREATE TABLE test_1 (id integer primary key autoincrement, pregunta VARCHAR, respuesta1 VARCHAR, respuesta2 VARCHAR, respuesta3 VARCHAR, respuesta4 VARCHAR)");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Cúal de estas opciones se relaciona con mi calidad de sueño en las últimas semanas?','Duermo como un bebé','No tengo la misma calidad de sueño que antes pero aún no es algo que me preocupa','Me cuesta dormirme y tengo interrupciones frecuentes del sueño','No duermo practicamente'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Ahora mismo, mi forma de ver la vida es: ','Me quiero comer el mundo','Nada es perfecto, pero no es algo que me desanime','Sin más voy haciendo cosas pero sin demasiado interés','No es bueno'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me cuesta disfrutar de las actividades que normalmente me gusta realizar','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Del 1 al 10, mi nivel de energia es: ','9 - 10','7 - 8','4 - 6','0 - 3')");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('En los últimos días he comido en exceso','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me veo a mí mismo y pienso que soy: ','Un ser que se equivoca y aprende de sus errores','No pienso en como soy','Una persona a la que todo se le hace difícil','Un fracaso'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando estoy realizando alguna actividad que amerite concentración yo: ','Me concentro fácilmente','Tengo períodos en los que me concentro y luego me descocentro','Me desconcentro bastante','No puedo hacer actividades que requieran mi atención por mucho tiempo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si pienso en mi familia, una de mis ideas recurrente es: ','Intento entenderlos y expresarme para que ellos me entiendan','Me preocupo por ellos','He hecho lo que he podido','Los decepciono en cada momento'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Durante las últimas semanas mis movimientos son:','Ágiles','Con menor energía de la acostumbrada','Lentos, al punto que otros lo notan','No soy capaz de salir demasiado de mi cama'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('La frecuencia con la que tengo pensamientos suicidas es: ','Nula','Baja','Media','Alta'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Actualmente mi apetito es: ','El acostumbrado','Un poco menor de lo normal','Notablemente menor que de costumbre','Prácticamente nulo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando despierto me cuesta mucho levantarme','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('En la últimas semanas la velocidad con la que tomo una decisión es: ','Rápida','Normal, como siempre','Más lenta que de costumbre','Es notoriamente lenta'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando pienso en mí, las palabras con las que me asocio son:','Inteligente y capaz','No destaco demasiado','Incapaz','Inútil'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('En las últimas semanas, cuando logro algo importante, yo: ','Celebro mis triunfos','Creo que fue suerte','No me va ni me viene','No siento que haya sido gracias a mi'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Uno de mis sentimientos cuotidianos es: ','Felicidad','Esperanza','Culpa','Hastío'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('A pesar de que haya momentos en los que descanso lo suficiente, aun así siento cansancio','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('El tipo de películas que elijo últimamente son: ','Alegres','Acción','Romance','Tristes'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me esfuerzo por ponerle buena cara a la vida, pero la sensación de pesimiesmo que siento es superior','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('A pesar de que haya hechos que no pueda dominar porque escapan a mis capacidades, creo que lo que sucede en mi vida es totalmente mi culpa','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Soy compasivo conmigo mismo(a) cuando no logro algo que me haya propuesto','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Pienso demasiado en las relaciones que tengo con mi familia y encuentro problemas que no existen','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo','Totalmente de acuerdo'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Con que frecuencia siento ganas de llorar?','Nunca','A veces ','Mas veces de las que desearía','Siempre'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('En los últimos meses ¿Con qué frecuencia estoy de mal humor?','Nunca','A veces ','Mas veces de las que desearía','Siempre'  )");
        db.execSQL("INSERT INTO test_1 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si me veo al espejo me siento:','Guapo(a), atractivo(a)','Contento con lo que veo','No me importa lo que veo','Feo(a), desagradable'  )");




        //TABLA TEST 2
        db.execSQL("CREATE TABLE test_2 (id integer primary key autoincrement, pregunta VARCHAR, respuesta1 VARCHAR, respuesta2 VARCHAR, respuesta3 VARCHAR, respuesta4 VARCHAR)");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Constantemente tengo pensamientos en los que me critico, me invalido, me ataco con insultos, etc.','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Frecuentemente me cuesta relajarme','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Siento la necesidad de comer varias veces al día, aun cuando no tenga hambre','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Siento opresión en el pecho cuando tengo alguna preocupación','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me preocupan asuntos que difícilmente puedan suceder, pero que yo insisto en ver como posibles. Por ejemplo: creo que no tendré dinero para comprar alimentos cuando en realidad no hay motivo real para pensar en ello','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando tengo alguna preocupación me falta el aire','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Realizo acciones involuntarias como mover el pie de forma repetitivo, me muerdo las uñas, etc. ','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me cuesta conciliar el sueño','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me cuesta tomar la iniciativa porque me dan miedo los resultados','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Mis reacciones son muchas veces exageradas y no se corresponden con la importancia del los hechos','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Noto que frecuentemente me cuesta pensar con claridad','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Frecuentemente siento dolores en la espalda y hombros, aun cuando no tengo una lesión ni me dado ningún golpe','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me preocupan aquellas situaciones en las que siento que puedo hacer el ridículo','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Frecuentemente me siento a punto de estallar','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Es muy difícil que me concentre en algo porque estoy pensado en lo que me preocupa','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Me cuesta mucho permanecer tranquilo(a). Siento que debo hacer algo aun cuando en realidad no sea así','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Es común que se me seque la boca','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Como no duermo bien durante la noche, entonces siento cansancio durante el día','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Constantemente me siento amenazado(a)','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Es común que esté irritable','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si el futuro tuviera un color, ¿de qué tipo sería?','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('A veces siento que estoy al borde del pánico','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si tengo un examen o una prueba...','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Tengo constantes sensaciones de bloqueo, esto significa que, aunque muchas veces quiero hacer algo, no puedo','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");
        db.execSQL("INSERT INTO test_2 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Evado situaciones por temor a lo que puedan decir de mí cuando estoy nervioso(a)','En total desacuerdo','A veces en desacuerdo','A veces de acuerdo', 'Totalmente de acuerdo')");




        //TABLA TEST 3
        db.execSQL("CREATE TABLE test_3 (id integer primary key autoincrement, pregunta VARCHAR, respuesta1 VARCHAR, respuesta2 VARCHAR, respuesta3 VARCHAR, respuesta4 VARCHAR)");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Con qué frecuencia consumes algún tipo de sustancia?','No consumo','1 vez a la semana','1 a 3 veces a la semana','Mas de tres veces a la semana'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿En qué instancias consumes algún tipo de sustancia?','No consumo','En instancias sociales','Estando solo','Cuanod tengo que enfrentarme a alguna situación estresante'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si consumes algún tipo de sustancia, ¿Cuál es el uso que le das?','No consumo ningún tipo de sustancia','Paso un rato agradable','Estabilizo el ánimo','Me relajo o evado problemas'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando has consumido, ¿Has tenido alguno de las siguientes consecuencias?','No he tenido ninguno de estos problemas','Descontrol de impulsos','No recordar lo que hiciste','Problemas legales'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Has tenido consecuencias familiares a propósito del consumo?','No ','Algunas veces','Si','He tenido problemas importantes'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Has perdido un trabajo por consumir alguna sustancia?','No','1 trabajo','Mas de 2 trabajos','No duro más de un par de semanas en algún trabajo'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Has perdido amistades, familiares o relaciones de pareja por consumir sustancias?','No','1 amistad','Mas de 2 amistades','He tenido problemas con mis amistades'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Si al ingresar a un nuevo trabajo te aplicaran un examen de drogas, ¿Qué harías?','No me complica ya que no consumo','Esperaría un tiempo y dejaría de consumir','Lo haría arriesgandome a que me pillen','Rechazaría el trabajo'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Has desarrollado algún problema físico por consumo de sustancias?','No','No lo sé ','No lo sé pero mi cuerpo está con menos energia','Si'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Estarías dispuesto a entrar a un tratamiento de rehabilitación?','No lo necesito porque no consumo','Si, estaría dispuesto','Ya lo he hecho pero no me ha resultado','No me interesa dejar de consumir'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Qué intentos has hecho por dejar de consumir?','No consumo','Buscar ayuda profesional','Volcarme al deporte ','Ninguno'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Qué cantidad de tu sueldo gastas en comprar sustancias?','No gasto una cantidad significativa','1/3 de mi sueldo','2/3 de mi sueldo','La mitad de mi sueldo'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Cuál de las siguientes conductas has realizado al estar bajo los efectos de una sustancia?','Ninguna de las anteriores','He gastado mucho dinero','Conductas sexuales de riesgo','He puesto en riesgo mi vida'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Te han dicho que tienes un consumo problemático que tú no hayas notado?','No ','Algunas veces','Si','He tenido problemas importantes'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Dentro de tu entorno, ¿Hay personas que se vean afectadas por tu consumo?','No ','Algunas veces se dan cuenta','Si','Si, siento que les he hecho daño'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Cuando has tenido períodos de abstinencia, ¿Cómo los has enfrentado?','No consumo','No me ha complicado mayormente','Tranquilo pero he vuelto a consumir con facilidad','Con ansiedad y muchos deseos de volver a consumir'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Cuáles son las situaciones en las que te dan más ganas de consumir?','No me dan ganas','Cuando estoy realajado','Cuando me preocupo','Cuando enfrento una situación estresante'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Sientes que consumes más de lo que tenías planeado?','No ','Algunas veces','si','Frecuentemente'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('¿Te has informado respecto de los efectos que tiene en tu salud el uso de sustancias?','Si','Algo','Poco','No'  )");
        db.execSQL("INSERT INTO test_3 (pregunta, respuesta1, respuesta2, respuesta3, respuesta4) VALUES ('Dada la frecuencia con que consumes, ¿Cómo ves tu futuro?','No consumo','No creo que siga en esto','Igual que como estoy ahora','Puede que aumente mi consumo'  )");

    }




    @SuppressLint("Range")
    public ArrayList<String> getTodosTests() {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT * FROM test_1", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getInt(res.getColumnIndex("id"))+". - " + res.getString(res.getColumnIndex("pregunta"));
            filas.add(contenido);
            res.moveToNext();

        }
        return filas;

    }


    //Método para obetener la pregunta
    @SuppressLint("Range")
    public String getPregunta(String nombreTabla, int id) {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT pregunta FROM '" + nombreTabla + "'  WHERE id ="+id, null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getString(res.getColumnIndex("pregunta"));
            res.moveToNext();

        }
        return contenido;

    }


    //Método para obetener la respuesta 1
    @SuppressLint("Range")
    public String getRespuesta1(String nombreTabla, int id) {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT respuesta1 FROM '" + nombreTabla + "' WHERE id = " + id, null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getString(res.getColumnIndex("respuesta1"));
            res.moveToNext();

        }
        return contenido;

    }


    //Método para obetener la respuesta 2
    @SuppressLint("Range")
    public String getRespuesta2(String nombreTabla, int id) {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT respuesta2 FROM '" + nombreTabla + "' WHERE id = " + id, null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getString(res.getColumnIndex("respuesta2"));
            res.moveToNext();

        }
        return contenido;

    }


    //Método para obetener la respuesta 3
    @SuppressLint("Range")
    public String getRespuesta3(String nombreTabla, int id) {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT respuesta3 FROM '" + nombreTabla + "' WHERE id = " + id, null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getString(res.getColumnIndex("respuesta3"));
            res.moveToNext();

        }
        return contenido;

    }


    //Método para obetener la respuesta 4
    @SuppressLint("Range")
    public String getRespuesta4(String nombreTabla, int id) {

        ArrayList<String> filas = new ArrayList<String>();
        Cursor res = null;
        String contenido = "";
        db = this.getReadableDatabase();
        res = db.rawQuery("SELECT respuesta4 FROM '" + nombreTabla + "' WHERE id = " + id, null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {

            contenido = res.getString(res.getColumnIndex("respuesta4"));
            res.moveToNext();

        }
        return contenido;

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS test_1");
        db.execSQL("DROP TABLE IF EXISTS test_2");
        db.execSQL("DROP TABLE IF EXISTS test_3");
        onCreate(db);

    }

}
