package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ImageExempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_exemple);

        Button button=this.findViewById(R.id.buttonRetour);

        button.setOnClickListener(view-> onClick());
    }

    private void onClick() {
        finish();
    }
}