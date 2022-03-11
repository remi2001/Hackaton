package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Final_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        Button Bouttonretouraccueil = findViewById(R.id.Button_final_page);
        Bouttonretouraccueil.setOnClickListener(view -> revenirAccueil());
    }

    private void revenirAccueil(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}