package com.example.zerothree.appliactionfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Tentang extends AppCompatActivity {

    RecyclerView MenuTentang;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        MenuTentang = (RecyclerView)findViewById(R.id.menuTentang);
        MenuTentang.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        MenuTentang.setAdapter(adapter);
    }

    String [] tentang = {
            "Pendahuluan", "Latar Belakang"
    };
    int [] logoTentang = {
            R.drawable.open,
            R.drawable.backpack
    };
    String [] detailTentang = {
            "Sesungguhnya segala puji bagi Allah, hanya kepada-Nya kami memuji, mohon pertolongan dan ampunan-Nya. Kami berlindung kepada-Nya dari keburukan diri kami dan kesalahan perbuatan kami. Barangsiapa yang diberi petunjuk Allah, maka tidak ada yang menyesatkannya. Dan barangsiapa disesatkan, maka tidak ada yang dapat memberi petunjuk kepadanya. Aku bersaksi bahwa tiada yang berhak diibadahi dengan benar selain Allah saja, tiada sekutu bagi-Nya. Dan aku bersaksi bahwa Muhammad Shollallahu ‘Alaihi Wasallam adalah hamba dan utusan-Nya", "Yayasan Islam Al Kahfi Batam merupakan yayasan yang berkhidmat dalam bidang pendidikan, sosial, ekonomi serta kaderisasi. Didirikan sebagai sarana untuk mengelola dan mengembangkan da’wah Islam berdasarkan Al Qur’an dan Assunnah dengan pemahaman Salaful Ummah di Kota Batam khususnya dan propinsi Kepulaun Riau umumnya Untuk merealisasikan maksud dan tujuan diatas, maka dibutuhkan suatu wadah yang diharapkan mampu menampung kegiatan-kegiatan da’wah melalui jalur pendidikan, sosial, ekonomi, kaderisasi atau kegiatan lainnya. Yayasan ini didirikan pada tanggal 23 Juni 2001 dengan nomor 263 yang Tercatat pada kantor notaris Yondri Darto SH, berkedudukan di Batam Wilayah Jabatan Propinsi Kepulauan Riau."
    };

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pilihanlist, null);
            return new CustomAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomAdapter.MyViewHolder holder, final int position) {
            holder.judul.setText(tentang[position]);
            holder.img.setImageResource(logoTentang[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a2 = new Intent(getApplicationContext(), DetailTentang.class);
                    a2.putExtra("Tentang", tentang[position]);
                    a2.putExtra("LogoTentang", logoTentang[position]);
                    a2.putExtra("DetailTentang", detailTentang[position]);
                    startActivity(a2);
                }
            });
        }

        @Override
        public int getItemCount() {
            return tentang.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView judul;
            ImageView img;
            public MyViewHolder(View itemView) {
                super(itemView);

                judul = itemView.findViewById(R.id.judul);
                img = itemView.findViewById(R.id.img);

            }
        }
    }
}
