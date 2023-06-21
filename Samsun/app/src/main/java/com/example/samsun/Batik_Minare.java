package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Batik_Minare extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batik_minare);

        oo_textview=findViewById(R.id.oo_batikminare_textview2);
        oo_textview.setText("   Samsun şehir merkezinden aşağı yukarı 70 km uzaklıkta bulunan Batık Minare, Samsun’un Bafra ilçesinde bulunan önemli bir tarihi yapı ve turizm noktasıdır. Batık Minare’yi ziyaret etmek isteyen misafirler, özel araçları ya da Bafra ilçesine kalkan otobüsler aracılığı ile ulaşım gerçekleştirebilir.\n" +
                "\n"+
                "   1984 ile 1990 yılları arasında Devlet Su İşleri tarafından Kızılırmak üzerine kurulan Derbent Barajı nedeniyle su altında kalan iki yüz adet yapıdan bir tanesi olan Batık Minare, manzarası, marjinal oluşu ve doğa ile iç içe bir konumda bulunması nedeni ile oldukça ilgi çekiyor.\n" +
                "\n"+
                "   Batık Minare’yi ziyaret eden ziyaretçiler, minare etrafında balık tutabilir, doğa turu düzenleyebilir, fotoğraflar çekilebilirler.\n" +
                "\n"+
                "   Batık Minare, yılın her günü ve günün her saati ücretsiz olarak ziyarete açıktır.\n");


    }
}