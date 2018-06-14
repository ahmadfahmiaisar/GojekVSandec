package com.bismillah.gojekvsandec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView gocar, gosend, gomart, goride;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gocar = findViewById(R.id.iv_gocar);
        gosend = findViewById(R.id.iv_gosend);
        gomart = findViewById(R.id.iv_gomart);
        goride = findViewById(R.id.ivgoride);

    }

    public void gocar(View view) {
        Toast.makeText(MainActivity.this, "Ini Gocar", Toast.LENGTH_SHORT).show();
    }

    public void gosend(View view) {

        Intent pindah = new Intent(MainActivity.this, Gosend.class);
        startActivity(pindah);
    }

    public void gomart(View view) {
        Toast.makeText(MainActivity.this, "Ini Gomart", Toast.LENGTH_SHORT).show();
    }

    public void goride(View view) {
        Toast.makeText(MainActivity.this, "Ini Goride", Toast.LENGTH_SHORT).show();
    }

}
