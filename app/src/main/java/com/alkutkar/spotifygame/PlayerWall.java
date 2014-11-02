package com.alkutkar.spotifygame;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.spotify.sdk.android.Spotify;
import com.spotify.sdk.android.playback.Player;

import java.util.ArrayList;


public class PlayerWall extends Activity {

    ArrayList<Item> gridArray = new ArrayList<Item>();

    private Player mPlayer;
    CustomGridViewAdapter customGridAdapter;
    GridView gridView;
    //blah blah


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_wall);
        //Set Permissions
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        gridArray.add(new Item("The Beatles","http://upload.wikimedia.org/wikipedia/en/a/ac/Getback-1.jpg"));
        gridView = (GridView) findViewById(R.id.grid_view);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);

        this.populateSongList(savedInstanceState.getString("token"));
    }

    private void populateSongList(String accessToken) {
            Spotify spotify = new Spotify(accessToken);
        System.out.println("Hello");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.player_wall, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
