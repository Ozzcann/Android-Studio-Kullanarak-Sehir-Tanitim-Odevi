package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView oo_ListView1;
    private ArrayAdapter<String> oo_adapter1;
    private String[] oo_hakkında= {"Samsun tarihçesi","Samsunda Bulunan Tarihi Yerler",
                                     "Samsun Yöresel Yemekleri","Samsun Yöresel Tatlıları"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oo_ListView1= (ListView) findViewById(R.id.main_activity_listView);
        oo_adapter1=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,oo_hakkında);
        oo_ListView1.setAdapter(oo_adapter1);

        oo_ListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pozisyon, long i) {
                if (pozisyon==0){
                    startActivity(new Intent(MainActivity.this,Tarihce.class));
                } else if (pozisyon==1){
                    startActivity(new Intent(MainActivity.this,TarihiYerler.class));
                } else if (pozisyon==2) {
                    startActivity(new Intent(MainActivity.this,Yemekler.class));
                }else {
                    startActivity(new Intent(MainActivity.this,Tatlilar.class));
                }
            }
        });
    }
}