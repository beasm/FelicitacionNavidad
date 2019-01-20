package com.practica.bea_s.felicitacionnavidad;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        //Crear un objeto de tipo MediaPlayer
        MediaPlayer mp = MediaPlayer.create(this,R.raw.last_christmas);
        mp.start();
    }
}
