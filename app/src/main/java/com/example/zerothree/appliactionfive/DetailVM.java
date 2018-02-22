package com.example.zerothree.appliactionfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailVM extends AppCompatActivity {

    ImageView GambarVM;
    TextView JudulVM, DekskripsiVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vm);

        GambarVM = (ImageView)findViewById(R.id.imgVM);
        JudulVM = (TextView)findViewById(R.id.txtWisata);
        DekskripsiVM = (TextView)findViewById(R.id.txtDetailVM);


        JudulVM.setText(getIntent().getStringExtra("Vm"));
        DekskripsiVM.setText(getIntent().getStringExtra("DetailVm"));
        GambarVM.setImageResource(getIntent().getIntExtra("LogoVM", 1));
    }
}
