package com.example.samsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BandirmaVapuru extends AppCompatActivity {

    TextView oo_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandirma_vapuru);

        oo_textview=findViewById(R.id.oo_bandirma_textview2);
        oo_textview.setText("   1878 yılında Trocadero ismiyle İskoçya’da inşa edilen ve 1910 yılında Bandırma ismini alan, Mustafa Kemal Paşa’nın 16 Mayıs tarihinde başlayan Anadolu yolculuğunda kendisi ve karargâhını taşıması nedeniyle tarihe mal olmuş gemidir.\n" +
                "\n"+
                "   İskoçya’nın Glasgow şehri yakınlarında bulunan Paisley kasabasındaki Phoenix Works tersanesinde, Hugh MacIntyre&Co şirketi tarafından inşa edilmiştir. Buhar motoruyla çalışan ve 192 ton ağırlığındaki geminin uzunluğu (tûlu) 47.97 metre (157.4 kadem), genişliği (arzı) 9.11 metre (29.9 kadem) ve derinliği (umku) ise 6.46 metre (21.2 kadem) ölçülerindeydi. Birinci mevki kamarasında 20, ikinci mevki kamarasında ise 16 yatak mevcuttu.\n" +
                "\n"+
                "   Yunan bandırasına geçen geminin ismi Yunanca ‘dalga’ demek olan Kymi’ye çevrildi. 1894 yılında Osmanlı idaresine geçti ve önce Panderma, sonrasında ise Bandırma ismini aldı. Bu esnada posta hizmeti için kullanıldı. 1923 yılında yeni Türk devletinin kurulmasıyla birlikte Türk Seyrisefain İdaresi tarafından devralındı. 1925 yılına dek posta hizmetinde kullanılan gemi, bu tarihte motorunun ciddi bir arıza yapması nedeniyle Seyrisefain İdare Meclisi’nin 5 Kasım 1925 tarihli ve 355 sayılı kararı uyarınca enkaz halinde Balat’ta faaliyet gösteren gemi sökümcüsü İlhami Bey’e satıldı ve parçalandı.\n");

    }
}