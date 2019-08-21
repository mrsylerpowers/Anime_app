package com.example.animeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Animeweb = (Button)findViewById(R.id.AniLink);
        Animeweb.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),Animeweb.class);
                startActivity(startIntent);

        }
    });
        Button Googlebutton = (Button)findViewById(R.id.Gogglebutton);
        Googlebutton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) ;
                startActivity(gotoGoogle);
            }

        });
        final Button Anipic =(Button)findViewById(R.id.Bnt);
        Anipic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),AniPic.class);
                startActivity(startIntent);
            }
        });




}
}
