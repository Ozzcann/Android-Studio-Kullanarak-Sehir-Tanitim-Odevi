package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TarihiYerler extends AppCompatActivity {
    private ListView oo_listview2;
    private ArrayAdapter<String> oo_adapter2;
    private String[] oo_tarihi_yerler={"Asarkale & Kaya Mezarları","Bafra Müzesi","Gazi Müzesi",
                                       "Çetinkaya Köprüsü","Batık Minare","Çarşamba Tarihi Köprü",
                                       "Çarşamba Bedesteni","Tarihi Çarşamba Evi",
                                       "Havza Atatürk Evi Müzesi (Mustafa Kemal Paşa’nın Havza Karargahı)",
                                       "Kevser Camii","Bandırma Vapuru"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);
        oo_listview2=(ListView) findViewById(R.id.oo_activity_tarihi_yerler_listview);
        oo_adapter2=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,oo_tarihi_yerler);
        oo_listview2.setAdapter(oo_adapter2);
        oo_listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(TarihiYerler.this,Asarkale_Kaya_Mezarlari.class));
                } else if (i==1) {
                    startActivity(new Intent(TarihiYerler.this,Bafra_Muzesi.class));
                } else if (i==2) {
                    startActivity(new Intent(TarihiYerler.this,Gazi_Muzesi.class));
                } else if (i==3) {
                    startActivity(new Intent(TarihiYerler.this,Cetinkaya_Koprusu.class));
                } else if (i==4) {
                    startActivity(new Intent(TarihiYerler.this,Batik_Minare.class));
                } else if (i==5) {
                    startActivity(new Intent(TarihiYerler.this,Carsamba_Tarihi_Kopru.class));
                } else if (i==6) {
                    startActivity(new Intent(TarihiYerler.this,Carsamba_Bedesteni.class));
                } else if (i==7) {
                    startActivity(new Intent(TarihiYerler.this,Tarihi_Carsamba_Evi.class));
                } else if (i==8) {
                    startActivity(new Intent(TarihiYerler.this,Havza_Ataturk_Evi_Muzesi.class));
                } else if (i==9) {
                    startActivity(new Intent(TarihiYerler.this,Kevser_Camii.class));
                }else {
                    startActivity(new Intent(TarihiYerler.this,BandirmaVapuru.class));
                }
            }
        });
    }
}