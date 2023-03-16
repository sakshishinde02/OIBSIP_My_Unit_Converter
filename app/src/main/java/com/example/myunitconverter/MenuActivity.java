package com.example.myunitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class MenuActivity extends AppCompatActivity {

    CardView cv_length;
    CardView cv_weight;
    CardView cv_temp;
    CardView cv_speed;
    CardView cv_time;
    CardView  cv_force;
    CardView cv_power;
    CardView cv_pressure;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cv_length = findViewById(R.id.cv_length);
        cv_weight = findViewById(R.id.cv_weight);
        cv_temp = findViewById(R.id.cv_temp);
        cv_speed = findViewById(R.id.cv_speed);
        cv_time = findViewById(R.id.cv_time);
        cv_force = findViewById(R.id.cv_force);
        cv_power = findViewById(R.id.cv_power);
        cv_pressure = findViewById(R.id.cv_pressure);

        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LengthActivity.class));
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, WeightActivity.class));
            }
        });
        cv_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MenuActivity.class));
            }
        });

        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, SpeedActivity.class));
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, TimeActivity.class));
            }
        });
        cv_force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ForceActivity.class));
            }
        });
        cv_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MenuActivity.class));
            }
        });
        cv_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MenuActivity.class));
            }
        });

    }
}