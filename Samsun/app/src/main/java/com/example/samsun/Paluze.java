package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Paluze extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paluze);

        oo_textview=findViewById(R.id.oo_paluze_textview2);
        oo_textview.setText("Her ne kadar çok fazla bilinmese de Samsun mutfağına ait olan bu tatlı Osmanlı Döneminden günümüze kadar popülerliğini koruyarak gelmiştir. Osmanlı jölesi olarak bilinen palüze hem lezzetli hem de hafif bir tatlı olması nedeniyle bilenler tarafından çok fazla tercih ediliyor.\n" +
                "\n" +
                "Herkesin evinde bulunan malzemelerle mutfağınızı dağıtmadan yapabileceğiniz bu tatlı tarihte yapılan en basit tatlılardan biridir. Şekeriniz düştüğünde 5 dakikada yapabilirsiniz. Samsunda genel olarak nişasta, şekerle yapılan üzerine ceviz serilerek servis edilen palüze, tercihe göre süt yerine meyve suyu ile de hazırlanabilir. Her ne şekilde hazırlanırsa hazırlansın çok seveceğiniz bu hafif tatlıyı mutlaka denemelisiniz.");
    }
}