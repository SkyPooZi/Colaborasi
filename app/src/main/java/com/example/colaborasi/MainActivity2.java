package com.example.colaborasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText edtJumlahBarangEsTeh, edtJumlahBarangKopi, edtJumlahBarangEsJeruk, edtJumlahBarangJusJambu, edtJumlahBarangWedangJahe;
    Button btnBeli, btnListMenuMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtJumlahBarangEsTeh = (EditText) findViewById(R.id.edtJumlahBarangEsTeh);
        edtJumlahBarangKopi = (EditText) findViewById(R.id.edtJumlahBarangKopi);
        edtJumlahBarangEsJeruk = (EditText) findViewById(R.id.edtJumlahBarangEsJeruk);
        edtJumlahBarangJusJambu = (EditText) findViewById(R.id.edtJumlahBarangJusJambu);
        edtJumlahBarangWedangJahe = (EditText) findViewById(R.id.edtJumlahBarangWedangJahe);
        btnBeli = (Button) findViewById(R.id.btnBeli);
        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtJumlahBarangEsTeh.getText().length()>0) || (edtJumlahBarangKopi.getText().length()>0) || (edtJumlahBarangEsJeruk.getText().length()>0) || (edtJumlahBarangJusJambu.getText().length()>0) || (edtJumlahBarangWedangJahe.getText().length()>0)) {
                    Toast.makeText(getApplicationContext(), "Pesananmu segera disiapkan :)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon mengisi list menu", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnListMenuMakanan = (Button) findViewById(R.id.btnListMenuMakanan);
        btnListMenuMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }
}