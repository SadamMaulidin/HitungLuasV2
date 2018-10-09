package com.paradox.sae.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {
    EditText edtAlas;
    EditText edtTinggi;
    TextView txtHasil;
    Button btnHitung;
    Float alas,tinggi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlas = findViewById(R.id.edtAlas);
        edtTinggi = findViewById(R.id.edtTinggi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alas = Float.valueOf(edtAlas.getText().toString());
                tinggi = Float.valueOf(edtTinggi.getText().toString());

                hitungLuasLingkaran(alas,tinggi);
            }
        });
    }

    private void hitungLuasLingkaran(Float alas, Float tinggi) {
        hasil = 1/2 * alas * tinggi;

        txtHasil.setText(String.valueOf(hasil));
    }
}
