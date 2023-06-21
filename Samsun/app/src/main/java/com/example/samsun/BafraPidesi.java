package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BafraPidesi extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bafra_pidesi);

        oo_textview=findViewById(R.id.oo_pide_textview2);
        oo_textview.setText("   Bafra pidesi 70-75 cm uzunluğunda ve 3-4 cm eninde olup, üstü kapalıdır. Pişen ve tereyağı ile yağlanan Bafra Pidesi 6 eşit parçaya kesilmesiyle (yaklaşık 12-13 cm uzunluğunda) servis edilir, yerken hamurunun özelliğinden dolayı baklava gibi ağızda dağılır.\n"+
                            "\n"+
                "   Bafra pidesinin yapımında Bafra yöresine has olan tereyağı kullanılmaktadır. Bu tereyağı Bafra' da yetiştirilen hayvanlardan elde edilmekte olup pidemize ayrı bir lezzet katmaktadır. Diğer pidelerde, eritilmiş margarin hamurun üstüne fırça ile sürülmektedir. Bafra pidesinde ise yöremize has olan tereyağı parça halinde hamurun içine konularak eritilmektedir.");

    }
}