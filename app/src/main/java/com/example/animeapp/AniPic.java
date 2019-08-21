package com.example.animeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AniPic extends AppCompatActivity {

    ListView AniGallery;
    String[] items;
    String[] pries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani_pic);


        Resources res = getResources();
        AniGallery = (ListView) findViewById(R.id.AniGallery);
        items = res.getStringArray(R.array.Charters);
        pries = res.getStringArray(R.array.price);

        itemAdapter itemAdapter = new itemAdapter(this, items, pries);
        AniGallery.setAdapter(itemAdapter);






    }
}
