package com.bismillah.gojekvsandec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Bundle b = getIntent().getExtras();
        String nama = b.getString("nama");
        String alamat = b.getString("alamat");
        String pesan = b.getString("pesan");

        TextView tvnama = findViewById(R.id.tv_nama);
        TextView tvalamat = findViewById(R.id.tv_alamat);
        TextView tvpesan = findViewById(R.id.tv_pesan);

        tvnama.setText(nama);
        tvalamat.setText(alamat);
        tvpesan.setText(pesan);

        Button btncancel = findViewById(R.id.btn_cancel);
    }

    public void cancel(View view) {
        Intent pindah = new Intent(Order.this, Gosend.class);
        startActivity(pindah);
    }
}
