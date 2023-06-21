package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Carsamba_Tarihi_Kopru extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carsamba_tarihi_kopru);

        oo_textview=findViewById(R.id.oo_tarihikopru_textview2);
        oo_textview.setText("   Çarşamba ilçe merkezinin sadece 3 dakika uzaklığında bulunan Çarşamba Tarihi Köprü, diğer adıyla Yeşilırmak Köprüsü; ulaşımı konusunda oldukça rahat bir konumdadır. Samsun şehir merkezinden yaklaşık olarak 35 km uzaklıkta bulunan Çarşamba Tarihi Köprü’ye dilerseniz kendi aracınızla ya da otobüsler ile ulaşım gerçekleştirme imkanınız bulunmaktadır. Aynı zamanda ilçe merkezine yürüyüş mesafesinde oluşu civardaki turistler için de ayrıca bir avantaj sağlamaktadır.\n" +
                "\n"+
                "   Çarşamba’nın en önemli sembollerinden biri olan Çarşamba Tarihi Köprü, Türkiye’nin en uzun köprüsü olarak da bilinmektedir. Kış aylarında yükselen suların karşıdan karşıya geçerken zorlayıcı bir engel olmasından dolayı 1890’lı yıllarda inşa edilmiş ve bu sayede ilçenin iki yakası da birleşmiştir. Daha önceleri trafiğe de açık olan Çarşamba Tarihi Köprü, son zamanlarda trafiğe kapatılmıştır.\n" +
                "\n"+
                "   Çarşamba Tarihi Köprü’nün üstünden geçerken altınızdan geçen Yeşilırmak’ı seyredebilir, manzaranın keyfini çıkarabilirsiniz.\n" +
                "\n"+
                "   Çarşamba Tarihi Köprü için herhangi bir giriş ücreti bulunmamaktadır. Yılın her günü ve saati kullanıma açıktır.\n");

    }
}