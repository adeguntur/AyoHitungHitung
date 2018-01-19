package com.example.ade.ayohitung_hitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {
    private EditText edtPanjang,edtLebar;
    private Button btnOk;
    private TextView txtPanjang,txtLebar, txtluas, txtkeliling, edithasil, editkeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        initUI();
        initEvent();
    }
    private void initUI() {
        txtPanjang = (TextView)findViewById(R.id.txtPanjang);
        txtLebar = (TextView)findViewById(R.id.txtLebar);
        txtluas = (TextView)findViewById(R.id.txtluas);
        txtkeliling = (TextView)findViewById(R.id.txtKeliling);
        edtPanjang = (EditText)findViewById(R.id.edtPanjang);
        edtLebar = (EditText)findViewById(R.id.edtLebar);
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
        int panjang = Integer.parseInt(edtPanjang.getText().toString());
        int lebar= Integer.parseInt(edtLebar.getText().toString());
        int keliling = 2*panjang + 2*lebar;
        editkeliling.setText(keliling+"");
    }

    private void hitungLuas() {
        int panjang = Integer.parseInt(edtPanjang.getText().toString());
        int lebar = Integer.parseInt(edtLebar.getText().toString());
        int luas = panjang*lebar;
        edithasil.setText(luas+"");
    }
}
