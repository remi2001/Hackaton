package com.example.hackaton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

public class Activity_classification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classification);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        MenuItem toolbarCalculer = menu.findItem(R.id.choice_button);
        MenuItem toolbarVider = menu.findItem(R.id.home_button);

        //toolbarCalculer.setOnMenuItemClickListener(menuItem -> calculResultat() );
        //toolbarVider.setOnMenuItemClickListener(menuItem -> videTextView() );
        return true;
    }

    //Boutons de la toolbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.home_button:
                Intent intenth = new Intent(this, MainActivity.class);
                startActivity(intenth);
                break;
            case R.id.choice_button:
                Intent intent = new Intent(this, Activity_choix_produit.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}