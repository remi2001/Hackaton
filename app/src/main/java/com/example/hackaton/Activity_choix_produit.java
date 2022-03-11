package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_choix_produit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_produit);

        //Ajout des boutons
        Button yaourtButton = findViewById(R.id.button_yaourt);
        Button bouteilleButton = findViewById(R.id.button_bouteille);
        Button accueilButton = findViewById(R.id.button_accueil);

        accueilButton.setOnClickListener(view -> openhomeActivity());
        yaourtButton.setOnClickListener(view -> openclassificationActivity());
        bouteilleButton.setOnClickListener(view -> openclassificationActivity());
    }

    //ouvre la page home
    private void openhomeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //ouvre la page de classification
    private void openclassificationActivity(){
        Intent intent = new Intent(this, Activity_classification.class);
        startActivity(intent);
    }
}