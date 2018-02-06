package com.example.agung.studycase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView resto = (TextView) findViewById(R.id.txt_resto);
        TextView porsi = (TextView) findViewById(R.id.txt_jumlah2);
        TextView harga = (TextView) findViewById(R.id.txt_harga2);
        //menset nilai dari widget textview
        resto.setText(b.getCharSequence("resto"));
        porsi.setText(b.getCharSequence("jumlah"));
        harga.setText(b.getCharSequence("harga"));
    }
}