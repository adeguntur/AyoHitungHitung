package com.example.ade.ayohitung_hitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    private EditText editSisi;
    private Button btnOk;
    private TextView txtsisi, txtluas, txtkeliling, edithasil, editkeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        initUI();
        initEvent();
    }
    private void initUI() {
        txtsisi = (TextView)findViewById(R.id.txtsisi);
        txtluas = (TextView)findViewById(R.id.txtluas);
        txtkeliling = (TextView)findViewById(R.id.txtKeliling);
        editSisi = (EditText)findViewById(R.id.edtsisi);
        edithasil = (TextView)findViewById(R.id.edtHasil);
        editkeliling = (TextView)findViewById(R.id.edtKeliling);
        btnOk = (Button)findViewById(R.id.btnOke);
    }
    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            { hitungLuas();
                hitungKeliling();

            } });
    }
    private void hitungKeliling() {
        int r = Integer.parseInt(editSisi.getText().toString());
        int keliling = 2*22*r/7;
        editkeliling.setText(keliling+"");
    }

    private void hitungLuas() {
        int r = Integer.parseInt(editSisi.getText().toString());
        int luas = 22*r*r/7;
        edithasil.setText(luas+"");
    }
}
