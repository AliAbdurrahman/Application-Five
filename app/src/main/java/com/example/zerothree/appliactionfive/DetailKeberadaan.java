package com.example.zerothree.appliactionfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKeberadaan extends AppCompatActivity {

    ImageView GambarKeberadaan;
    TextView JudulKeberedaan, DekskripsiKeberadaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_keberadaan);

        GambarKeberadaan = (ImageView)findViewById(R.id.imgKeberadaan);
        JudulKeberedaan = (TextView)findViewById(R.id.txtKeberadaan);
        DekskripsiKeberadaan = (TextView)findViewById(R.id.txtDetailKeberadaan);

        GambarKeberadaan.setImageResource(getIntent().getIntExtra("LogoKeberadaan",1));
        JudulKeberedaan.setText(getIntent().getStringExtra("Keberadaan"));
        DekskripsiKeberadaan.setText(getIntent().getStringExtra("DetailKeberadaan"));


    }
}
