package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Havza_Ataturk_Evi_Muzesi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_havza_ataturk_evi_muzesi);

        oo_textview=findViewById(R.id.oo_atatürkevi_textview2);
        oo_textview.setText("   Samsun şehir merkezinin ortalama 80 km uzağında bulunan Havza Atatürk Evi Müzesi, Havza ilçe merkezinin yaklaşık olarak 1 km uzaklığında, aşağı yukarı 10 dakikalık mesafede bulunmaktadır. Havza Atatürk Evi Müzesi’ni ziyaret etmek isteyen tarih meraklıları, varsa, özel araçları ile ulaşım sağlayabilecekleri gibi Havza ilçesine kalkan otobüsler ile de ulaşımlarını rahatça gerçekleştirebilirler. İlçe merkezine yakın konumda bulunan ziyaretçiler eğer isterler ise yaya olarak da Havza Atatürk Evi Müzesi’ne ulaşım gerçekleştirme şansına sahiptirler.\n" +
                "\n"+
                "   Havza Atatürk Evi Müzesi, şık ve gösterişli görünüşünün yanı sıra bünyesinde bulundurduğu balmumu heykeller ile de her sene yüzlerce turistin uğrak noktası haline gelmiştir. Geçmişten kalma kilimlerin bulunduğu müzede aynı zamanda eski silahlar ve nostaljik oturma odalar bulunmaktadır. Bunların yanı sıra çeşitli vazo ve çanakların, gardıropların, kıyafetlerin ve mobilyaların da bulunduğu Havza Atatürk Evi Müzesi, geçmişimizden izler taşıyor. Burayı ziyaret eden turist ve tarih severler, Mustafa Kemal Atatürk’ün çalışma odası, yatak odası ve havza odası canlandırmasının yanı sıra çeşitli boy ve türde heykellerini inceleyebilirler. Balmumundan Atatürk heykelleri ile fotoğraf çekilebilir, aynı zamanda savaş tarihi konusunda da bilgi edinebilirler.\n" +
                "\n"+
                "   Havza Atatürk Evi Müzesi’ne giriş tamamen ücretsizdir. Yılın her günü ziyarete açık olan müze, sabah saat 08:00’da açılmaktadır. Sonrasında ise mesai saat 17:00’a kadar devam etmektedir. Giriş yapmak için herhangi bir engel ya da koşul bulunmamaktadır.\n");

    }
}