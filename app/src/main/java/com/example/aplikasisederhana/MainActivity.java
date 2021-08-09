package com.example.aplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasisederhana.activity.KalkulatorActivity;
import com.example.aplikasisederhana.activity.ListViewNegaraActivity;
import com.example.aplikasisederhana.activity.TampilNamaActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgTampilNama, imgKalkulator, imgLvNegara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Home");

        imgTampilNama = findViewById(R.id.img_tampil_nama);
        imgKalkulator = findViewById(R.id.img_kalkulator);
        imgLvNegara = findViewById(R.id.img_lv_negara);

        imgTampilNama.setOnClickListener(this);
        imgKalkulator.setOnClickListener(this);
        imgLvNegara.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.img_tampil_nama:
                startActivity(new Intent(this, TampilNamaActivity.class));
                break;
            case R.id.img_kalkulator:
                startActivity(new Intent(this, KalkulatorActivity.class));
                break;
            case R.id.img_lv_negara:
                startActivity(new Intent(this, ListViewNegaraActivity.class));
                break;
        }
    }
}