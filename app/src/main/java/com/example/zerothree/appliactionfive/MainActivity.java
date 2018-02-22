package com.example.zerothree.appliactionfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView GridMenu;

    String [] Menu = {
            "Visi dan Misi", "Tentang Kami", "Keberadaan Kami"
    };
    int [] Logo = {
            R.drawable.quotation,
            R.drawable.light,
            R.drawable.place
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridMenu = (GridView)findViewById(R.id.gridMenu);

        GridAdapter gridAdapter = new GridAdapter();
        GridMenu.setAdapter(gridAdapter);
        GridMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int menuu, long l) {
                if (menuu == 0) {
                    Intent a1 = new Intent(getApplicationContext(), VM.class);
                    startActivity(a1);
                } else if (menuu == 1) {
                    Intent a2 = new Intent(getApplicationContext(), Tentang.class);
                    startActivity(a2);
                } else if (menuu == 2) {
                    Intent a3 = new Intent(getApplicationContext(), Keberadaan.class);
                    startActivity(a3);
                }
            }
        });
    }


    private class GridAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Logo.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.gridlist, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview);
            TextView mTextView = (TextView) view.findViewById(R.id.textview);

            mImageView.setImageResource(Logo[position]);
            mTextView.setText(Menu[position]);
            return view;
        }
    }
}
