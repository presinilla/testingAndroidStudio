package com.example.presi.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView mtempatmakan;
    TextView mnamamenu;
    TextView mporsi;
    TextView mharga;
    private  final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mtempatmakan = findViewById(R.id.namatempat);
        mnamamenu = findViewById(R.id.namamakanan);
        mporsi = findViewById(R.id.totalporsi);
        mharga = findViewById(R.id.totalharga);

        Intent x = getIntent();

        String tempatmakan = x.getStringExtra("tempatmakan");
        String namamenu = x.getStringExtra("namamenu");
        String porsi = x.getStringExtra("jumlahporsi");
        String harga = x.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(mharga) * Integer.valueOf(mporsi);

        mtempatmakan.setText(tempatmakan);
        mnamamenu.setText(namamenu);
        mporsi.setText(porsi);
        mharga.setText(String.valueOf(harga));

        if (totalHarga <= uang){
            Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this,"Jangan disini makan malamnua, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
