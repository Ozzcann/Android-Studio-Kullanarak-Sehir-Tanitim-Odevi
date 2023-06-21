package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MandaKaymakliLokum extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manda_kaymakli_lokum);

        oo_textview=findViewById(R.id.oo_lokum_textview2);
        oo_textview.setText("Memleketine döndükten sonra lokum üretimini bakır kazanlarda odun ateşinde yaparak sürdüren Şükrü Efendi'nin oğlu Faris Yüksel, 1936 yılında mesleği babasından devralarak, lokum ile Bafra'nın manda sütünden elde edilen kaymağını buluşturarak bugünkü geleneksel \"Tarihi Bafra Kaymaklı Lokumu\"nu üretti.");
    }
}