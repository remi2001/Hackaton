package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BouttonActivitéSuivante = findViewById(R.id.BoutonProchaineActivite);
        BouttonActivitéSuivante.setOnClickListener(view -> lancerProchaineActivite());
    }

    private void lancerProchaineActivite(){
        Intent i = new Intent(this, Activity_choix_produit.class);
        startActivity(i);
    }
}