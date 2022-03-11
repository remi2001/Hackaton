package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_choix_produit extends AppCompatActivity {

    int produitChoisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_produit);

        //Ajout des boutons
        Button yaourtButton = findViewById(R.id.button_yaourt);
        Button bouteilleButton = findViewById(R.id.button_bouteille);
        Button accueilButton = findViewById(R.id.button_accueil);
        Button clickhereButton = findViewById(R.id.button_click_here);

        accueilButton.setOnClickListener(view -> openhomeActivity());
        yaourtButton.setOnClickListener(view -> openclassificationActivity("y"));
        bouteilleButton.setOnClickListener(view -> openclassificationActivity("b"));
        clickhereButton.setOnClickListener(view -> openfinalActivity());
    }

    //ouvre la page home
    private void openhomeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        finish();
    }

    //ouvre la page de classification
    private void openclassificationActivity(String choix){
        Intent intent = new Intent(this, Activity_classification.class);
        if(choix=="y")
            produitChoisi=1;
        else
            produitChoisi=0;
        startActivity(intent);
    }

    //ouvre la page finale
    private void openfinalActivity(){
        Intent intent = new Intent(this, Final_page.class);
        startActivity(intent);
    }

    public int GetProduit(){
        return produitChoisi;
    }
}