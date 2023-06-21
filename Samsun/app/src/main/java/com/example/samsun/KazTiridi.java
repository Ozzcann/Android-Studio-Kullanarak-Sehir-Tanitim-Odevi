package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KazTiridi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaz_tiridi);

        oo_textview=findViewById(R.id.oo_tirit_textview2);
        oo_textview.setText("Samsun'un Vezirköprü ilçesinde kış aylarında yağlanan kazlardan yapılan \"kaz tiridi\", yörede bir gelenek olarak soğuk gecelerde dost sohbetiyle yeniyor.\n" +
                "\n" +
                "Özel olarak beslenen ve kışın yağlandıktan sonra kesilen kazların odun ateşinin karşısında yavaş yavaş kızartılmasıyla yapılan \"kaz tiridi\" lezzeti kadar görüntüsüyle de iştah kabartıyor.\n" +
                "\n" +
                "Ateşin karşısında kızaran kazdan akan yağlarla yapılan bulgur pilavının üzerine kaz etinin konulmasıyla ikram edilen tirit, bulunduğu sofrayı ziyafete dönüştürüyor. Yemeğin ardından semaver çayıyla sohbet, geç saatlere kadar sürüyor.");

    }
}