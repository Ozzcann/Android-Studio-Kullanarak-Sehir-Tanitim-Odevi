package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Carsamba_Bedesteni extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carsamba_bedesteni);

        oo_textview=findViewById(R.id.oo_bedesten_textview2);
        oo_textview.setText("   Samsun şehir merkezinden yaklaşık olarak 35 km uzaklıkta bulunan Çarşamba Bedesteni, Çarşamba ilçe merkezine 5 dakikalık mesafede bulunmaktadır. Konumundan ötürü ulaşımın kolayca sağlandığı yerlerden bir tanesi olan Çarşamba Bedesteni, ilçe merkezinden ulaşımın yaya olarak, şahsi araçlarla veya toplu taşıma araçları da kullanılarak gerçekleştirilebildiği tarihi mekanlardan bir tanesidir.\n" +
                "\n"+
                "   Tarihi Bedesten Çarşısı olarak da bilinen Çarşamba Bedesteni, bir Osmanlı yapısıdır. İki katlı dikdörtgen bir yapıya sahiptir. Kesme taş ve moloz taşlarla yapılmıştır ve üstü kırma çatı ile örtülüdür. İki tarafında da çeşitli dükkanlar bulunmaktadır. İlk yapıldığı zamanlarda kuyumcular çarşısı olarak hizmete açıldığı rivayet edilen Çarşamba Bedesteni, ziyaretçilerin ilgisini hala ilk günkü gibi çekmeye devam etmektedir.\n" +
                "\n"+
                "   Çarşamba Bedesteni için herhangi bir giriş ücreti veya saati bulunmamaktadır. Yılın her günü ve saati ziyaret edilebilir.\n");

    }
}