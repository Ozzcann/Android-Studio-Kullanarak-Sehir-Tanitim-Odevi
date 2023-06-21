package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Yemekler extends AppCompatActivity {

    private ListView oo_listview3;
    private ArrayAdapter<String> oo_adapter3;
    private String[] oo_yemekler={"Bafra Pidesi","Kaz Tiridi", "Büryan Kebabı",
                                  "Mantarlı Pilav", "Çerkez Tavuğu"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekler);

        oo_listview3=(ListView) findViewById(R.id.oo_activity_yemekler_listview);
        oo_adapter3=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,oo_yemekler);
        oo_listview3.setAdapter(oo_adapter3);

        oo_listview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Yemekler.this, BafraPidesi.class));
                } else if (i == 1) {
                    startActivity(new Intent(Yemekler.this, KazTiridi.class));
                } else if (i == 2) {
                    startActivity(new Intent(Yemekler.this, Buryan.class));
                } else if (i == 3) {
                    startActivity(new Intent(Yemekler.this, MantarliPilav.class));
                } else {
                    startActivity(new Intent(Yemekler.this, CerkezTavugu.class));
                }
            }
        });
    }
}