package com.practica.bea_s.felicitacionnavidad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear un objeto de tipo MediaPlayer
        MediaPlayer MP = MediaPlayer.create(this,R.raw.last_christmas);
        MP.start();
    }
}
