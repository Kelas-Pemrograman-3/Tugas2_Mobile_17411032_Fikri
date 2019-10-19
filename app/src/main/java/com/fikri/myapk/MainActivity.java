package com.fikri.myapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama,npm;
//    TextView txtnpm,txtnama;
    Button btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        npm = (EditText) findViewById(R.id.npm);
        nama = (EditText) findViewById(R.id.nama);
//        txtnpm = (TextView) findViewById(R.id.txtnpm);
//        txtnama = (TextView) findViewById(R.id.txtnama);
        btnshow = (Button) findViewById(R.id.btnshow);

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String strnpm = npm.getText().toString();
            String strnama = nama.getText().toString();

                Intent next = new Intent(MainActivity.this,Halaman2.class);

                next.putExtra("npm",strnpm);
                next.putExtra("nama", strnama);

                startActivity(next);
                finish();

}
});
}
}
