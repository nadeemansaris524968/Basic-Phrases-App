package com.example.nadee.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int id = view.getId();
        String ourID = view.getResources().getResourceEntryName(id);
        int resourceID = getResources().getIdentifier(ourID, "raw","com.example.nadee.basicphrasesapp");
        Log.i("Resource ID: ",Integer.toString(resourceID));
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceID);
        mediaPlayer.start();
        Log.i("BTN: "+ourID, "Tapped");
    }
}
