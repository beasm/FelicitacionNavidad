package com.practica.bea_s.felicitacionnavidad;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear un objeto de tipo Typeface. Todas las fuentes que se quieran
        Typeface tp = Typeface.createFromAsset(getAssets(),"ChristmasSparkle_PERSONAL.ttf" );
        TextView tv_titulo = (TextView) findViewById(R.id.titulo);
        tv_titulo.setTypeface(tp);

        //Animacion crearle y asignarla a a etiqueta
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        tv_titulo.startAnimation(animacion);

        //Animacion mensajes
        Animation animacionMensaje = AnimationUtils.loadAnimation(this,R.anim.animacion_mensaje);
        TextView tv_mensaje1 = (TextView) findViewById(R.id.mensaje1);
        tv_mensaje1.startAnimation(animacionMensaje);
        TextView tv_mensaje2 = (TextView) findViewById(R.id.mensaje2);
        tv_mensaje2.startAnimation(animacionMensaje);
        TextView tv_mensaje3 = (TextView) findViewById(R.id.mensaje3);
        tv_mensaje3.startAnimation(animacionMensaje);


        //Crear un objeto de tipo MediaPlayer
        MediaPlayer mp = MediaPlayer.create(this,R.raw.last_christmas);
        mp.start();
    }
}
