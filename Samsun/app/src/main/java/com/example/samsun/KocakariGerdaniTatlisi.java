package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KocakariGerdaniTatlisi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kocakari_gerdani_tatlisi);

        oo_textview=findViewById(R.id.oo_kocakari_textview2);
        oo_textview.setText("Karadeniz bölgesinin en çok tüketilen tatlılarından biri olan burma tatlısının samsun mutfağındaki adı kocakarı gerdanı. Samsun denilince akla gelen ilk tatlılardan olan kocakarı gerdanı bayramların ve özel günlerin vazgeçilmez tatlısı olarak sofralarda yerini alıyor.\n" +
                "\n" +
                "Görüntü olarak hem baklavaya hem de kıvratmaya benzeyen tatlının tadı baklava ile aynı. Yufkanın içerisine bol ceviz veya fındık konularak sarılır, üzerine bol tereyağı gezdirilerek fırında pişirilir. Fırından çıktıktan sonra da su ve şekerden oluşan şerbet üzerine dökülür ve ortaya ağızda dağılan damakları çatlatan cinsten bir lezzet çıkar.\n" +
                "\n" +
                "Yemeklerden sonra canınız tatlı çekerse Samsun’da yemeklerin ardından çayın yanında en çok tercih edilen kocakarı gerdanı tatlısını mutlaka denemelisiniz.");
    }
}