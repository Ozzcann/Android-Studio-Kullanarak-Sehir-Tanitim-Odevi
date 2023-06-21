package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Asarkale_Kaya_Mezarlari extends AppCompatActivity {

    TextView oo_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asarkale_kaya_mezarlari);

        oo_textview=findViewById(R.id.oo_asarkale_textview2);
        oo_textview.setText("   Samsun şehir merkezinin aşağı yukarı 85 km uzağında bulunan Asarkale & Kaya Mezarları, Bafra ilçesinin en önemli tarihi ve turistik mekanlarındandır. Asarkale & Kaya Mezarlarını ziyaret etmek isteyen tatilciler, özel araçları aracılığı ile ulaşımlarını kolayca gerçekleştirebilirler.\n" +
                "\n"+
                "   Helenistik çağdan itibaren varlığını sürdüren Asarkale & Kaya Mezarları, tarih boyunca birçok imparatorluğu hakimiyeti altında kalmıştır. Roma, Bizans ve Osmanlı İmparatorlukları, Bölgede hakimiyet sürdükleri süre boyunca farklı farklı tadilat çalışmaları yapmıştır.\n" +
                "\n"+
                "   Yapılış amaçları savunma olan Asarkale & Kaya Mezarları, ikisi kale yamaçlarında, bir tanesi de Kızılırmak’ın karşısında bulunmak üzere üç adet mezardan oluşmaktadır. Asarkale & Kaya Mezarları, daha önceleri savunma amacı ile kullanılmıştır. Ancak günümüzde önemli bir turizm merkezi haline gelmiştir. Her sene yerli ve yabancı on binlerce turistin uğrak noktası haline gelmiştir.\n" +
                "\n"+
                "   Asarkale & Kaya Mezarları’nı gezmek isteyen ziyaretçiler için hiçbir giriş ücreti ödeme zorunluluğu bulunmamaktadır. Asarkale & Kaya Mezarları, yılın her günü ve günün her saati ziyaret edilebilir.\n");



    }
}