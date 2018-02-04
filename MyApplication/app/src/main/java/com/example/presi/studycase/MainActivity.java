package com.example.presi.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mMenu, mPorsi;
    Button mButtonEatbus, mButtonAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = findViewById(R.id.menu);
        mPorsi = findViewById(R.id.porsi);
        mButtonEatbus = findViewById(R.id.button1);
        mButtonAbnormal = findViewById(R.id.button2);

        mButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent kemudian = new Intent(MainActivity.this, Main2Activity.class);
                kemudian.putExtra("namatempat", "EATBUS");
                kemudian.putExtra("namamenu", mMenu.getText().toString());
                kemudian.putExtra("jumlahporsi", mPorsi.getText().toString());
                kemudian.putExtra("totalharga", "50000");
                startActivity(kemudian);
            }
    });
        mButtonAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kemudian = new Intent(MainActivity.this,Main2Activity.class);
                kemudian.putExtra("namatempat", "ABNORMAL");
                kemudian.putExtra("namamenu", mMenu.getText().toString());
                kemudian.putExtra("jumlahporsi", mPorsi.getText().toString());
                kemudian.putExtra("totalharga", "30000");
                startActivity(kemudian);
            }
        });

        }
    }



