package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
}