package com.example.silihatapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
     private  final String[] itemname;
     // for image display in textview//
     private final Integer[] imgid;
     Button b1;


    public CustomListAdapter( Activity context, String[]  itemname, Integer[] imgid) {
        super(context, R.layout.listview_items,itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;

        //this will initialiazes all values declared
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        final View rowView=inflater.inflate(R.layout.listview_items,null,true);

        TextView textView=(TextView)rowView.findViewById(R.id.tv1);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.iv1);
        textView.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;
    }
}
