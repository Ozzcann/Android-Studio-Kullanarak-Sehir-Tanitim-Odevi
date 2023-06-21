package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MantarliPilav extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantarli_pilav);

        oo_textview=findViewById(R.id.oo_pilav_textview2);
        oo_textview.setText("Samsun’un zengin mutfağının yemeklerinden biri olan mantarlı pilav mantarın pilava kattığı farklı ve lezzetli aroma ile deneyen herkesin beğenisini kazanmaktadır. Özellikle Samsun Vezirköprü ilçesi ile özdeşleşen bu pilav Samsun ilinin her köşesine yayılmış ve geleneksel lezzetlerin arasında yerini almıştır.\n" +
                "\n" +
                "Düğün, bayram gibi özel günlerde Samsun’da kalabalık sofralardan eksik olmayan mantarlı pilav Samsun’un dağlık alanlarında toplanan tazecik kültür mantarlarının mis gibi tereyağlı pilava eklenmesiyle hazırlanır. Samsun’a giden herkesin mutlaka denemesi gereken bu lezzet Samsun’da ev yemekleri yapan tüm restoranlarda misafirlere sunulur.\n" +
                "\n" +
                "Samsun’a gittiğinizde mutlaka bu lezzeti denemenizi öneririz. Mantarlı pilavı denedikten sonra emin olun sade pirinç pilavının tadını unutacaksınız.");

    }
}