package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bafra_Muzesi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bafra_muzesi);

        oo_textview=findViewById(R.id.oo_baframuzesi_textview2);
        oo_textview.setText("   Samsun il merkezinin ortalama olarak 50 km uzağında bulunan Bafra Müzesi, Bafra ilçesinde bulunan en önemli tarihi ve turistik yerlerin başında gelir. Bafra Müzesini ziyaret etmek isteyen ziyaretçiler, özel araçları ve otobüsleri kullanabilecekleri gibi aynı zamanda taksiler ile de ulaşımlarını kolayca gerçekleştirebilirler.\n" +
                "\n"+
                "   Bafra Müzesi’nin birinci katında etnografik eserler bulunmaktadır. Bu katta bulunan müze odaları içerisinde geleneksel Bafra evinin günlük yaşamına uygun olarak hazırlanan mutfak, yatak odası ve oturma odası bulunmaktadır. Sergilenen eserler on dokuzuncu yüzyıl ve yirminci yüzyıl eserlerdir.\n" +
                "\n"+
                "   Bafra Müzesi’nde toplamda 1.520 adet arkeolojik ve etnografik eser bulunmaktadır. Müzenin ikinci katında Pişmiş topraktan tanrıça figürleri, çanak ve çömlekler, bilezik, küpe ve kolye gibi takıların yanı sıra aynı zamanda baltalar, ağırşaklar, cam eserler ve amphoralar da yer almaktadır. Bafra Müzesi’nde  İlk Tunç Çağı’na dek uzanan geniş bir eser ağı müze içerisinde mevcuttur.\n" +
                "\n"+
                "   Bafra Müzesi’ni gezip görmek isteyen ziyaretçiler, pazartesi günleri hariç haftanın her günü sabah saat 08:00 ile akşam 17:00 saatleri arasında müzeyi ziyaret edebilirler.\n");

    }
}