package com.alonbasin.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppsActivity extends AppCompatActivity {

    private Button spotifyStreamerButton,scoresAppButton, libraryAppButton, buildItBiggerButton, baconReaderButton, capstoneButoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamerButton = (Button) findViewById(R.id.media_streamer);
        scoresAppButton = (Button) findViewById(R.id.super_duo1);
        libraryAppButton = (Button) findViewById(R.id.super_duo2);
        buildItBiggerButton = (Button) findViewById(R.id.ant_terminator);
        baconReaderButton = (Button) findViewById(R.id.materialize);
        capstoneButoon = (Button) findViewById(R.id.capstone);

        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
            }
        });

        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Built It Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        baconReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Bacon Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_apps, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
