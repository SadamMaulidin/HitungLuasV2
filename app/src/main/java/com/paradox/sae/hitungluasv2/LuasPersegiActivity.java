package com.paradox.sae.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiActivity extends AppCompatActivity {

    //TODO 1 luas persegi membuat variable global dengan tipe data widget
    EditText edtSisi;
    TextView txtHasil;
    Button btnHitung;
    Integer sisi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        //TODO 2 menginisiasikan object widget
        edtSisi = findViewById(R.id.edtSisi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        //TODO 3 membuat onClick method untuk mendeteksi click dari user
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 4 memasukkan input editText dari user dan convert string ke int
                sisi = Integer.valueOf(edtSisi.getText().toString());

                //TODO 5 memanggil function hitungLuasPersegi
                hitungLuasPersegi(sisi);
            }
        });
    }

    //TODO 6 membuat method hitungLuasPersegi
    private void hitungLuasPersegi(Integer sisi) {
        //TODO 7 menghitung luas persegi
        hasil = sisi * sisi;

        //TODO 8 Cetak hasil
        txtHasil.setText(String.valueOf(hasil));

    }
}
