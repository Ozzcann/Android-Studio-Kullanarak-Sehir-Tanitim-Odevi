package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Buryan extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buryan);

        oo_textview=findViewById(R.id.oo_buryan_textview2);
        oo_textview.setText("Samsun’da gastronomi turizmin gelişmesine katkı sağlayan yöresel yemeklerin başında Büryan gelmektedir. Samsun’da kuyu kebabı olarak da bilinen Büryan 2-3 metre derinlikteki bir kuyuda odun ateşinde pişen kuzu etinden hazırlanmaktadır.\n" +
                "\n" +
                "Yapım aşaması çok zor lezzeti ise bir o kadar mükemmel olan Büryan, Samsun’u ziyaret eden turistler tarafından en çok tercih edilen yemeklerdendir. Evde yapılması imkânsız olan bu lezzet Samsun’da birçok restoranda yapılmaktadır. Özel kuyuya sabahın ilk saatlerinde bırakılan kuzu eti öğleden sonra yemek saatlerine yetişmektedir.\n" +
                "\n" +
                "Samsun’da düğün yemeklerinde, bayram sofralarında ve kalabalık yemeklerde en çok tercih edilen bu yemeğin lezzeti parmak ısırtan cinsten. Samsun’un en lezzetli yöresel yemeklerinden biri olan bu lezzeti mutlaka denemelisiniz.");

    }
}