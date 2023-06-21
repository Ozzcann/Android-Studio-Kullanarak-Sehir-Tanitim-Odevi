package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Kevser_Camii extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kevser_camii);

        oo_textview=findViewById(R.id.oo_kevsercamii_textview2);
        oo_textview.setText("   Havza Kevser Camii, Samsun şehir merkezinden aşağı yukarı 80 km uzaklıkta bulunmaktadır. Ulaşım açısından oldukça rahat bir konumda bulunan Kevser Camii, ilçe merkezinin aşağı yukarı 150 m uzağında yer almaktadır. Özel araçlar aracılığı ile ya da ilçeye kalkan otobüsler ile ulaşımın sağlanabileceği yerlerden bir tanesidir. Ziyaretçiler ilçe merkezinden ortalama olarak 2 dakikalık bir süre içerisinde Kevser Camii’ye ulaşımlarını gerçekleştirebilirler.\n" +
                "\n"+
                "   Büyüklüğünün yanı sıra köklü geçmişi sayesinde dikkatleri üzerine çeken Kevser Camii, Havza’yı ziyaret eden ziyaretçilerin mutlaka görmesi gereken tarihi yapılardan bir tanesidir. Geniş ibadet alanlarının yanı sıra oldukça büyük bir avluya da ev sahipliği yapmaktadır. İbadetlerini ya da tarihi gezilerini tamamlayan ziyaretçilerin, Kevser Camii önünde oturup bir yandan temiz havanın keyfini çıkarıp etraftaki insanlarla sosyalleşirken bir yandan da çaylarını yudumlayabileceği küçük bir parkı bulunmaktadır. Geniş iç mekan tasarımı ile özellikle bayram ayları boyunca çok sayıda ziyaretçi çeken Kevser Camii, geniş kitlelerin de  ibadetlerini bir arada yerine getirmesine olanak sağlamaktadır.\n" +
                "\n"+
                "   Kevser Camii, yılın her günü ve günün her saati ziyarete ve de ibadete açık bulunmaktadır. Kevser Camii için herhangi bir giriş ücreti bulunmamaktadır.\n");

    }
}