package com.example.hemapriyakumr.projectsplitwise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button addApartmentButton,addGroupButton,skipButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addApartmentButton = (Button) findViewById(R.id.addApartmentButton);
        addGroupButton = (Button) findViewById(R.id.addGroupButton);
        skipButton = (Button) findViewById(R.id.skipButton);

        addApartmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CreateGroup_Activity.class);
                startActivity(i);
            }
        });

        addGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CreateGroup_Activity.class);
                startActivity(i);
            }
        });

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Splitwise_Activity.class);
                startActivity(i);
            }
        });


    }
}
