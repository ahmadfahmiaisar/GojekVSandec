package com.bismillah.gojekvsandec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Gosend extends AppCompatActivity {

    private EditText et_nama, et_alamat, et_pesan;
    private Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosend);

        et_nama = findViewById(R.id.et_nama);
        et_alamat = findViewById(R.id.et_alamat);
        et_pesan = findViewById(R.id.et_pesan);
    }

    public void order(View view) {
        Intent pindah = new Intent(Gosend.this, Order.class);
        Bundle b = new Bundle();
        String nama = et_nama.getText().toString();
        String alamat = et_alamat.getText().toString();
        String pesan = et_pesan.getText().toString();

        b.putString("nama", nama);
        b.putString("alamat", alamat);
        b.putString("pesan", pesan);

        pindah.putExtras(b);
        startActivity(pindah);
    }
}
