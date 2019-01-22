package com.practica.bea_s.felicitacionnavidad;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements EventListener {

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
        final Animation animacionMensaje1 = AnimationUtils.loadAnimation(this,R.anim.animacion_mensaje1);
        final TextView tv_mensaje1 = (TextView) findViewById(R.id.mensaje1);
        tv_mensaje1.startAnimation(animacionMensaje1);
        final Animation animacionMensaje2 = AnimationUtils.loadAnimation(this,R.anim.animacion_mensaje2);
        final TextView tv_mensaje2 = (TextView) findViewById(R.id.mensaje2);
        tv_mensaje2.startAnimation(animacionMensaje2);
        final Animation animacionMensaje3 = AnimationUtils.loadAnimation(this,R.anim.animacion_mensaje3);
        final TextView tv_mensaje3 = (TextView) findViewById(R.id.mensaje3);
        tv_mensaje3.startAnimation(animacionMensaje3);

        final Animation animacionFrase1 = AnimationUtils.loadAnimation(this,R.anim.animacion_frase1);
        final TextView tv_frase1 = (TextView) findViewById(R.id.frase1);
        tv_frase1.startAnimation(animacionFrase1);
        final Animation animacionFrase2 = AnimationUtils.loadAnimation(this,R.anim.animacion_frase2);
        final TextView tv_frase2 = (TextView) findViewById(R.id.frase2);
        tv_frase2.startAnimation(animacionFrase2);
        final Animation animacionFrase3 = AnimationUtils.loadAnimation(this,R.anim.animacion_frase3);
        final TextView tv_frase3 = (TextView) findViewById(R.id.frase3);
        tv_frase3.startAnimation(animacionFrase3);

        Typeface tp_santa = Typeface.createFromAsset(getAssets(), "ChristmasSprouts.ttf");
        tv_mensaje1.setTypeface(tp_santa);
        tv_mensaje2.setTypeface(tp_santa);
        tv_mensaje3.setTypeface(tp_santa);


        //Crear un objeto de tipo MediaPlayer
        MediaPlayer mp = MediaPlayer.create(this,R.raw.last_christmas);
        mp.start();

        Animation animacionPapaNoel = AnimationUtils.loadAnimation(this,R.anim.papa_noel);
        View papanoel = findViewById(R.id.papanoel);
        papanoel.startAnimation(animacionPapaNoel);
        View papanoeltexto = findViewById(R.id.papanoeltexto);
        papanoeltexto.startAnimation(animacionPapaNoel);

        papanoel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv_mensaje1.startAnimation(animacionMensaje1);
                tv_mensaje2.startAnimation(animacionMensaje2);
                tv_mensaje3.startAnimation(animacionMensaje3);
                tv_frase1.startAnimation(animacionFrase1);
                tv_frase2.startAnimation(animacionFrase2);
                tv_frase3.startAnimation(animacionFrase3);
            }
        });
    }
}
