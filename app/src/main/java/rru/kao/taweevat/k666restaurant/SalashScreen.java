package rru.kao.taweevat.k666restaurant;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SalashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SalashScreen.this, MainActivity.class));
                finish();
            }
        }, 6000);

        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bee);
        mediaPlayer.start();

    }//main method


}//main class
