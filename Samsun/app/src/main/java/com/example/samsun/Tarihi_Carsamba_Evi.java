package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tarihi_Carsamba_Evi extends AppCompatActivity {

    TextView oo_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_carsamba_evi);

        oo_textview=findViewById(R.id.oo_carsambaevi_textview2);
        oo_textview.setText("   Samsun şehir merkezinin yaklaşık 35 km uzağında bulunan Tarihi Çarşamba Evi, aynı zamanda Çarşamba ilçe merkezinden 4 dakikalık uzaklıkta bulunmaktadır. Tarihi Çarşamba Evi’ne ulaşım merkeze yakınlığı sayesinde oldukça rahat bir şekilde sağlanabilmektedir. Ziyaretçiler dilerler ise kendi şahsi araçları ile ya da toplu taşıma araçları ile ulaşım gerçekleştirebilecekleri gibi aynı zamanda yaya olarak da ulaşımlarını gerçekleştirebilirler.\n" +
                "\n"+
                "   Tarihi Çarşamba Evi, ahşap ve iki katlı bir yapıdır. Yapı içerisinde ve etrafında cafe işletmeleri bulunmaktadır. Sessiz ve sakin oluşunun yanı sıra yaz akşamları boyunca yapılan açık hava etkinlikleri de turistlerin dikkatini ve ilgisini oldukça çekmektedir. Genellikle Yeşilçam filmleri yansıtılarak nostalji yaşatmak amaçlanmaktadır. Dilerseniz yapı içerisine girip tamamen ücretsiz bir şekilde fotoğraf çekilebilir ve Tarihi Çarşamba Evi’ni inceleyebilirsiniz.\n" +
                "\n"+
                "   Tarihi Çarşamba Evi’ne giriş yaparken hiçbir ücret gerekmemektedir. Yılın her günü ziyarete açıktır.\n");

    }
}