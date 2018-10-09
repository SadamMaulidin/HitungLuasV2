package com.paradox.sae.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //TODO 1 luas persegi membuat method luas persegi
    public void luasPersegi(View view){

        //TODO 2 luas persegi membuat object intent
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);

        //TODO 3 menjalankan startactivity
        startActivity(pindah);

    }

    public void luasPersegiPanjang(View view){

        Intent pindah = new Intent(MenuActivity.this, LuasPersegiPanjang.class);

        startActivity(pindah);
    }

    public  void luasLingkaran(View view){

        Intent pindah = new Intent(MenuActivity.this, LuasLingkaranActivity.class);

        startActivity(pindah);
    }

    public void luasSegitiga(View view){

        Intent pindah = new Intent(this, LuasSegitigaActivity.class);

        startActivity(pindah);
    }
}
