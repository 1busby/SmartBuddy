package com.teamx.smartbuddy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.teamx.smartbuddy.event.EventContent;

public class MainActivity extends AppCompatActivity implements EventFragment.OnListFragmentInteractionListener {

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setTitle("Saturday, March 25");
        } catch (NullPointerException e) {
            Log.v(LOG_TAG, e.toString());
        }

        //MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound_file_1);
        //mediaPlayer.start(); // no need to call prepare(); create() does that for you

    }

    @Override
    public void onListFragmentInteraction(EventContent.EventItem item) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Close Database

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_tasks:
                startTaskListActivity();
                return true;

            case R.id.action_alarm:
                startDestinationActivity();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    private void startTaskListActivity() {
        Intent intent = new Intent(this, TaskListActivity.class);
        startActivity(intent);

    }

    private void startDestinationActivity() {
        Intent intent = new Intent(this, DestinationActivity.class);
        startActivity(intent);

    }

}
