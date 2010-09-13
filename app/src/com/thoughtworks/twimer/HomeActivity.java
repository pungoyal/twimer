package com.thoughtworks.twimer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.thoughtworks.twimer.activities.ActivityActivity;
import com.thoughtworks.twimer.activities.TimeSheetsActivity;

public class HomeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button projectsButton = (Button) findViewById(R.id.activities);
        projectsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ActivityActivity.class);
                startActivity(intent);
            }
        });

        Button timeSheetsButton = (Button) findViewById(R.id.activities);
        timeSheetsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TimeSheetsActivity.class);
                startActivity(intent);
            }
        });
    }
}
