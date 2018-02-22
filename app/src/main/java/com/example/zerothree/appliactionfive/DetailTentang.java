package com.example.zerothree.appliactionfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTentang extends AppCompatActivity {


    ImageView GambarTentang;
    TextView JudulTentang, DekskripsiTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tentang);

        GambarTentang = (ImageView)findViewById(R.id.imgTentang);
        JudulTentang = (TextView)findViewById(R.id.txtTentang);
        DekskripsiTentang = (TextView)findViewById(R.id.txtDetailTentang);

        JudulTentang.setText(getIntent().getStringExtra("Tentang"));
        DekskripsiTentang.setText(getIntent().getStringExtra("DetailTentang"));
        GambarTentang.setImageResource(getIntent().getIntExtra("LogoTentang", 1));
    }
}
