package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CerkezTavugu extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerkez_tavugu);

        oo_textview=findViewById(R.id.oo_cerkez_textview2);
        oo_textview.setText("Kafkas mutfağından Türk mutfağına girmiş olan Çerkez tavuğu Samsun mutfağının sevilen yemekleri arasında gösterilmektedir. Yapımı kolay bu lezzetli meze pek çok kişi tarafından sevilerek tüketilir. Değişik yörelerde tercihe göre un veya havanda iyice dövülerek un haline getirilen ceviz ile yapılan Çerkez tavuğu, hem lezzetli hem de vitaminli olması nedeniyle çok fazla tercih ediliyor.\n" +
                "\n" +
                "Kalabalık davet sofralarında bir numaralı meze olarak yerini alan Çerkez tavuğu Samsun halkının sofralarını süslemektedir. Yapımı oldukça kolay olan bu yemek haşlanan tavuklarla, patates, yoğurt ve mayonez ile karıştırılmasıyla hazırlanır. Üzerine eritilmiş köy tereyağı gezdirilir ve bolca ceviz ile süslenir. Kokusu ile bile kendine hayran bırakan Çerkez tavuğunun tadı ise deneyenlerin damağında kalıyor.");

    }
}