package com.example.silihatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] itemname={"image1","image2","image3","image4","image5"};
    Integer[] imgid={
             R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this,itemname,imgid);
        listView=(ListView)findViewById(R.id.li1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String seletedit=itemname[+i];
                Toast.makeText(MainActivity.this,seletedit,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
