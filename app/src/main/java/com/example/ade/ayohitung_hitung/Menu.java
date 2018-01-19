package com.example.ade.ayohitung_hitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button btnPersegi,btnPersegiPanjang,btnLayang,btnBelahKetupat,btnLingkaran,btnSegitiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPersegi = (Button) findViewById(R.id.btnPersegi);
        btnPersegiPanjang = (Button) findViewById(R.id.btnPersegiPanjang);
        btnLingkaran = (Button) findViewById(R.id.btnLingkaran);
        btnSegitiga = (Button) findViewById(R.id.btnSegitiga);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Persegi.class);
                startActivity(intent);
            }
        });
        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,PersegiPanjang.class);
                startActivity(intent);
            }
        });
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Lingkaran.class);
                startActivity(intent);
            }
        });
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Segitiga.class);
                startActivity(intent);
            }
        });
    }
}
