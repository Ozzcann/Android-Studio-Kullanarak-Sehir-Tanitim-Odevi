package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Gazi_Muzesi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazi_muzesi);

        oo_textview=findViewById(R.id.oo_gazi_textview2);
        oo_textview.setText("   Samsun şehir merkezinin yaklaşık olarak 2 km uzağında bulunan Gazi Müzesi, ulaşımı bakımından oldukça rahattır. Gazi Müzesi’ni ziyaret etmek isteyen tarih severler, özel araçları ve de halk otobüsleri ile ulaşım sağlayabilecekleri gibi, taksileri de alternatif olarak kullanabilirler. Şehir merkezine yakın konumda bulunan ziyaretçiler; dilerler ise 20 dakikalık bir yürüyüş ile de ulaşımlarını rahatça gerçekleştirebilirler.\n" +
                "\n"+
                "   1920 senesinin sonlarına doğru bir hafta boyunca Mustafa Kemal Atatürk’ü ağırlamış olan Gazi Müzesi, yirminci yüzyıldan kalma eski bir binadır. 1940 yılında müze olarak hizmete açılan Gazi Müzesi, içerisinde Mustafa Kemal Atatürk’e ait eşyaların da bulunduğu tarihi bir koleksiyon müzesidir. Binanın giriş ve üst katlarında toplamda 191 adet çeşitli eser bulunduğu gibi aynı zamanda Gazi Müzesi’nin üst katında, ulu önder Mustafa Kemal Atatürk ile beraber Samsun’a çıkan 18 silah arkadaşının balmumu heykelleri de yer almaktadır.\n" +
                "\n"+
                "   Gazi Müzesi, Pazartesi günleri hariç haftanın her günü sabah saat 08:00 ile akşam 17:00 saatleri arasında hizmet vermektedir\n");

    }
}