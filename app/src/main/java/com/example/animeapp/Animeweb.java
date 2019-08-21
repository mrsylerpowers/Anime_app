package com.example.animeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animeweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animeweb);
        Button kissAnime = findViewById(R.id.KissAni);
        kissAnime.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
              String kissAnime = "https://www.Kissanime.ru";
                Uri webaddress = Uri.parse(kissAnime);
                Intent gotokiss =new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotokiss.resolveActivity(getPackageManager()) != null);
                startActivity(gotokiss);
            }
        });
        Button AnimeFreak = findViewById(R.id.AniFreak);
        AnimeFreak.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
              String AnimeFreak = "https://www.netflix.com";
              Uri webaddress = Uri.parse(AnimeFreak);
              Intent gotofreak = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotofreak.resolveActivity(getPackageManager()) != null);
                startActivity(gotofreak);
            }
        });

    }
}
