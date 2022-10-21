package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button play_pause, btn_repeat;
    MediaPlayer mp;
    ImageView iv;
    int repeat = 2, position = 0;//variables para repetir y para ver el indice del vector del media player

    MediaPlayer mp_array[] = new MediaPlayer[3];
//    mp_array[].stop()
//    mp_array[].setLooping(true)
//    mp_array[].start()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play_pause = (Button) findViewById(R.id.btn_play);
        btn_repeat = (Button) findViewById(R.id.btn_repeat);
        iv = (ImageView) findViewById(R.id.imageView);
        assignPlaylist();
    }

    public void playPause(View view) {
        if (mp_array[position].isPlaying()) {
            mp_array[position].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {
            mp_array[position].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View view) {

    }

    public void repeat(View view) {

    }

    public void changeBackground() {
        if (position == 0) {
            iv.setImageResource(R.drawable.portada1);
        } else if (position == 1) {
            iv.setImageResource(R.drawable.portada2);
        } else if (position == 2) {
            iv.setImageResource(R.drawable.portada3);
        }
    }

    public void next(View view) {

    }

    public void previous(View view) {

    }

    public void assignPlaylist() {
        mp_array[0] = MediaPlayer.create(this, R.raw.race);
        mp_array[1] = MediaPlayer.create(this, R.raw.tea);
    }
}