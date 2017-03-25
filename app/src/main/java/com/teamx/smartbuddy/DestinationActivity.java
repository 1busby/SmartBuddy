package com.teamx.smartbuddy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DestinationActivity extends AppCompatActivity {

    private final String LOG_TAG = DestinationActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setTitle("Arrival Time");
        } catch (NullPointerException e) {
            Log.v(LOG_TAG, e.toString());
        }

        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.map_view);
        mImageView.setImageResource(R.drawable.untitled);

        TextView mDestinationTimeText = (TextView) findViewById(R.id.dest_time_text);
        mDestinationTimeText.setText(Integer.toString(StaticFields.arrivalHour) + ":00");

        Button mButtonPlus = (Button) findViewById(R.id.btn_plus);
        Button mButtonMinus = (Button) findViewById(R.id.btn_minus);

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StaticFields.arrivalHour -= 1;
                TextView mDestinationTimeText = (TextView) findViewById(R.id.dest_time_text);
                mDestinationTimeText.setText(Integer.toString(StaticFields.arrivalHour) + ":00");
            }
        });

        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StaticFields.arrivalHour += 1;
                TextView mDestinationTimeText = (TextView) findViewById(R.id.dest_time_text);
                mDestinationTimeText.setText(Integer.toString(StaticFields.arrivalHour) + ":00");
            }
        });
    }

}
