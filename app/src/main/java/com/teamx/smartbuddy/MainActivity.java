package com.teamx.smartbuddy;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.teamx.smartbuddy.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements EventFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle("");

        //getActionBar().setTitle("Wednesday, March 24");
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
