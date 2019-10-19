package com.fikri.myapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    TextView showdata1,showdata2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        showdata1 = (TextView) findViewById(R.id.txtnpm);
        showdata2 = (TextView) findViewById(R.id.txtnama);

        Intent datatampil1 = getIntent();
        String vnpm = datatampil1.getStringExtra("npm");
        Intent datatampil2 = getIntent();
        String vnama = datatampil2.getStringExtra("nama");

        showdata1.setText(vnpm);
        showdata2.setText(vnama);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent back = new Intent(Halaman2.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
