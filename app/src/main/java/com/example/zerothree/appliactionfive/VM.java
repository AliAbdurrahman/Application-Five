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

public class VM extends AppCompatActivity {

    RecyclerView menuVM;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vm);

        menuVM = (RecyclerView)findViewById(R.id.menuVM);
        menuVM.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        menuVM.setAdapter(adapter);
    }

    String [] vm = {
            "Visi", "Misi"
    };
    int [] logoVm = {
            R.drawable.lamp,
            R.drawable.target
    };
    String [] detailVM = {
            "Meniti Jejak Generasi Islam Pertama", "Berdakwah Menuju Akidah Yang Benar, Mencetak Generasi Muslim, Memiliki Kepedulian Sosial Yang Tinggi, Membangun Ekonomi Islam"
    };

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pilihanlist, null);
            return new CustomAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomAdapter.MyViewHolder holder, final int position) {
            holder.judul.setText(vm[position]);
            holder.img.setImageResource(logoVm[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a1 = new Intent(getApplicationContext(), DetailVM.class);
                    a1.putExtra("Vm", vm[position]);
                    a1.putExtra("LogoVM", logoVm[position]);
                    a1.putExtra("DetailVm", detailVM[position]);
                    startActivity(a1);
                }
            });
        }

        @Override
        public int getItemCount() {
            return vm.length;
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
