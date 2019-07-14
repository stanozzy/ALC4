package com.example.alc4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ALC 4 Phase 1");

        Button abtBtn = (Button) findViewById(R.id.btnAbout);
        Button profBtn = (Button) findViewById(R.id.btnProfile);

        abtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadAbout = new Intent(getApplicationContext(), AboutAlc.class);
                startActivity(loadAbout);
            }
        });

        profBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadProf = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(loadProf);
            }
        });
    }
}
