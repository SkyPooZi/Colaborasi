package com.example.colaborasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtJumlahBarangMie, edtJumlahBarangNasi, edtJumlahBarangAyam, edtJumlahBarangTahuTempe, edtJumlahBarangMendoanBakwan;
    Button btnBeli, btnListMenuMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtJumlahBarangMie = (EditText) findViewById(R.id.edtJumlahBarangMie);
        edtJumlahBarangNasi = (EditText) findViewById(R.id.edtJumlahBarangNasi);
        edtJumlahBarangAyam = (EditText) findViewById(R.id.edtJumlahBarangAyam);
        edtJumlahBarangTahuTempe = (EditText) findViewById(R.id.edtJumlahBarangTahuTempe);
        edtJumlahBarangMendoanBakwan = (EditText) findViewById(R.id.edtJumlahBarangMendoanBakwan);
        btnBeli = (Button) findViewById(R.id.btnBeli);
        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtJumlahBarangMie.getText().length()>0) || (edtJumlahBarangNasi.getText().length()>0) || (edtJumlahBarangAyam.getText().length()>0) || (edtJumlahBarangTahuTempe.getText().length()>0) || (edtJumlahBarangMendoanBakwan.getText().length()>0)) {
                    Toast.makeText(getApplicationContext(), "Pesananmu segera disiapkan :)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon mengisi list menu", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnListMenuMinuman = (Button) findViewById(R.id.btnListMenuMinuman);
        btnListMenuMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}