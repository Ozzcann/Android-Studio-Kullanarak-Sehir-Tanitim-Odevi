package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Cetinkaya_Koprusu extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetinkaya_koprusu);

        oo_textview=findViewById(R.id.oo_cetinkaya_textview2);
        oo_textview.setText("   Çetinkaya Köprüsü, Samsun şehir merkezinden ortalama olarak 50 km uzaklıkta bulunmaktadır. Çetinkaya Köprüsü’nü gezip görmek isteyen gezginler; özel araç kullanarak ya da Bafra ilçesine kalkan otobüslere binerek ulaşım gerçekleştirebilir.\n" +
                "\n"+
                "   Çetinkaya Köprüsü, Bafra ilçesinin en önemli sembolik yapılarındandır. Cumhuriyet döneminden kalma yapılardan bir tanesi olan Çetinkaya Köprüsü, toplamda 250 metre uzunluğundadır ve toplamda 7 bölümden oluşmaktadır. Her bir bölümü kemer görünümünde olan köprüde zemin, beton parke taşları ile oluşturulmuştur.\n" +
                "\n"+
                "   Çetinkaya Köprüsü, yılın her günü ve günün her saati ziyaret edilebilir ve kullanılabilir.\n" +
                "\n"+
                "   Çetinkaya Köprüsü’ne giriş yapmak tamamen ücretsizdir.\n");

    }
}