package com.example.hackaton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class Activity_classification extends AppCompatActivity {

    private ImageView imageView;
    private int numeroImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        numeroImage=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classification);

        this.imageView=this.findViewById(R.id.imageView);
        Button validButton =this.findViewById(R.id.validButton);
        Button invalidButton=this.findViewById(R.id.invalidButton);

        invalidButton.setOnClickListener(view-> onClick());


    }

    private void onClick() {
        String chemin=""; //mettre le chemin des photos ...../yaourt_
        chemin+=numeroImage;
        File imgFile= new File(chemin);
        numeroImage++;
        Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
        this.imageView.setImageBitmap(myBitmap);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        MenuItem toolbarCalculer = menu.findItem(R.id.choice_button);

        //toolbarCalculer.setOnMenuItemClickListener(menuItem -> calculResultat() );
        //toolbarVider.setOnMenuItemClickListener(menuItem -> videTextView() );

        return true;
    }

    //Boutons de la toolbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.choice_button:
                Intent intent = new Intent(this, Activity_choix_produit.class);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}