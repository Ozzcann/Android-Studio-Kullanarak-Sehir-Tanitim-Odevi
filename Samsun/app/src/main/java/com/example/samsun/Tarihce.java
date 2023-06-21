package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tarihce extends AppCompatActivity {



    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihce);

        oo_textview=findViewById(R.id.oo_activity_tarihce_textview2);
        oo_textview.setText("Türkiye'nin en güzel şehirlerinden birisi olan Samsun Karadeniz'de bulunan bir liman kentidir. Şehir bir liman bölgesi olmanın yanı sıra tarımda da büyük söz sahibidir. Sahip olduğu Çarşamba ve Bafra ovalarında tütün, buğday, pirinç, mısır, meyve, sebze gibi pek çok tarım ürünü yetiştirilmektedir. Bunun yanında Samsun'un tarihi de oldukça eskilere dayanmaktadır. Bölgede yapılan arkeolojik kazılarda Eski Taş Çağı'na ait olan eşyalar bulunmuştur. Ayrıca M.Ö 60.000 ile M.Ö 15.000 yılları arasında olduğu tahmin edilen Tekkeköy mağaraları keşfedilen en eski yerleşim yeridir.\n" +
                "\n" +
                "Tarihi kaynaklarda geçen bilgilere göre şehrin ilk ismi Amisos olarak geçmektedir. Antik Yunan kaynaklarına göre Amazon adı verilen bir halkında bu bölgede yaşadığı belirtilmiştir. Amazonların hangi tarihte Samsun'a yerleştikleri bilinmemekle beraber, sadece kadınlardan oluştuğu ve savaş sanatını çok iyi bildikleri ifade edilmiştir. Öte yandan bölgeye ilk olarak Gaska medeniyetinin yerleştiği belirlenmiştir. Daha sonra kent Hitit, Frigya, Pers, Makedonya, Pontus, Roma, Bizans, Selçuklu ve Osmanlı gibi birçok milletin egemenliği altına girdi.");

    }
}