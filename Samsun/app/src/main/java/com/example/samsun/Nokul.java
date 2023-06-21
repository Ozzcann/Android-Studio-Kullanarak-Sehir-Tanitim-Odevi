package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nokul extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nokul);

        oo_textview=findViewById(R.id.oo_nokul_textview2);
        oo_textview.setText("Tarihi oldukça eskilere dayanan Nokul, Sinop ve Isparta gibi birçok ilde yöresel yemekler listesine girmiştir. Özellikle Samsun’un Bafra ilçesinde çok fazla tercih edilen Nokul, Samsun’un da yöresel yemekleri arasında yerini almıştır. Bafra nokulunu diğer illerde yapılan nokullardan ayıran özelliği ise ceviz ile yapılması.\n" +
                "\n" +
                "Nokul uzun süre bayatlamayan besleyici bir tatlıdır. Bu yüzden de eski zamanlarda uzun yolculuklara çıkan insanlar yanlarına yolluk olarak nokul alırdı. O dönemlerden günümüze kadar gelen nokul halen Samsun’da en çok tercih edilen tatlılar arasındadır.\n" +
                "\n" +
                "İçerisinde çok az şeker kullanılması, tatlandırıcı olarak üzüm kullanılması nedeniyle tatlı yemeyenleri bile kendine hayran bırakır. Samsun’a yolunuz düşerse Bafra pastanelerinde sıklıkla bulabileceğiniz bu tatlıyı mutlaka deneyin.");

    }
}