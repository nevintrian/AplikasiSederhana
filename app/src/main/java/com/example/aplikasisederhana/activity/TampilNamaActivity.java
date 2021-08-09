package com.example.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aplikasisederhana.R;

public class TampilNamaActivity extends AppCompatActivity {

    private EditText edtNama;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_nama);
        setTitle("Tampil Nama");

        edtNama = findViewById(R.id.edt_nama);
        txtOutput = findViewById(R.id.txt_output);
    }

    public void onClick(View view) {
        if(edtNama.getText().toString().isEmpty()){
            Toast.makeText(this,"Nama Kosong",Toast.LENGTH_SHORT).show();
        }else{
            txtOutput.setText(edtNama.getText().toString());
        }
    }
}