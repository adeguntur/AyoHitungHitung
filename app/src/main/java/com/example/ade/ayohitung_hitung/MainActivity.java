package com.example.ade.ayohitung_hitung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, edithasil, editkeliling; private Button btnOk; private TextView txtsisi, txtluas, txtkeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        txtsisi = (TextView)findViewById(R.id.txtsisi);
        txtluas = (TextView)findViewById(R.id.txtluas);
        txtkeliling = (TextView)findViewById(R.id.txtKeliling);
        editSisi = (EditText)findViewById(R.id.edtsisi);
        edithasil = (EditText)findViewById(R.id.edtHasil);
        editkeliling = (EditText)findViewById(R.id.edtKeliling);
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
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi; editkeliling.setText(keliling+"");
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi; edithasil.setText(luas+"");
    }


}
