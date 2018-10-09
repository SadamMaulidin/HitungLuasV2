package com.paradox.sae.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjang extends AppCompatActivity {
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;
    Button btnHitung;
    Integer panjang,lebar,hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        edtLebar = findViewById(R.id.edtLebar);
        edtPanjang = findViewById(R.id.edtPanjang);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lebar = Integer.valueOf(edtLebar.getText().toString());
                panjang = Integer.valueOf(edtPanjang.getText().toString());

                hitungLuasPersegiPanjang(panjang,lebar);
            }
        });
    }

    private void hitungLuasPersegiPanjang(Integer panjang, Integer lebar) {
        hasil = panjang * lebar;

        txtHasil.setText(String.valueOf(hasil));
    }
}
