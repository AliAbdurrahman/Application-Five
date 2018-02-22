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

public class Keberadaan extends AppCompatActivity {

    RecyclerView MenuKeberadaan;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keberadaan);

        MenuKeberadaan = (RecyclerView)findViewById(R.id.menuKeberadaan);
        MenuKeberadaan.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        MenuKeberadaan.setAdapter(adapter);
    }

    String [] keberadaan = {
            "Kontak Kami", "Alamat Email", "Lokasi Kami", "Jam Kerja"
    };
    int [] logoKeberadaan = {
            R.drawable.telephone,
            R.drawable.mail,
            R.drawable.sign,
            R.drawable.user
    };
    String [] detailKeberadaan = {
            "+6281364203159 , +6281372106439", "alkahfibatam@gmail.com", "JL. Mayjend RH.Soegandhi 2 No.1, MKGR, Batu Aji Batam, Kepulauan Riau, Indonesia", "Senin - Sabtu : 08.00 - 17.00"
    };

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pilihanlist, null);
            return new CustomAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomAdapter.MyViewHolder holder, final int position) {
            holder.judul.setText(keberadaan[position]);
            holder.img.setImageResource(logoKeberadaan[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a3 = new Intent(getApplicationContext(), DetailKeberadaan.class);
                    a3.putExtra("Keberadaan", keberadaan[position]);
                    a3.putExtra("LogoKeberadaan", logoKeberadaan[position]);
                    a3.putExtra("DetailKeberadaan", detailKeberadaan[position]);
                    startActivity(a3);
                }
            });
        }

        @Override
        public int getItemCount() {
            return keberadaan.length;
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
