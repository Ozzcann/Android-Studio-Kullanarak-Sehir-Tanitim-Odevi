package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tatlilar extends AppCompatActivity {
    private ListView oo_listview4;
    private ArrayAdapter<String> oo_adapter4;
    private String[] oo_tatlilar={"Nokul","Kocakarı Gerdanı Tatlısı",
                                  "Palüze","Manda Kaymaklı Lokum"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatlilar);
        oo_listview4=(ListView) findViewById(R.id.oo_activity_tatlilar_listview);
        oo_adapter4=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,oo_tatlilar);
        oo_listview4.setAdapter(oo_adapter4);
        oo_listview4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Tatlilar.this, Nokul.class));
                } else if (i == 1) {
                    startActivity(new Intent(Tatlilar.this, KocakariGerdaniTatlisi.class));
                } else if (i == 2) {
                    startActivity(new Intent(Tatlilar.this, Paluze.class));
                } else {
                    startActivity(new Intent(Tatlilar.this, MandaKaymakliLokum.class));
                }

            }
        });
    }
}