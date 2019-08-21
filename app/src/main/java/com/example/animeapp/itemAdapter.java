package com.example.animeapp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] pries;

    public itemAdapter(Context c, String[] i, String[] p){
        items = i;
        pries = p;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_gallery, null);
        TextView nameText =(TextView)v.findViewById(R.id.nameText);
        TextView PriceText =(TextView)v.findViewById(R.id.PriceText);

        String name = items[i];
        String price = pries[i];

        nameText.setText(name);
        PriceText.setText(price);




        return v;
    }
}
