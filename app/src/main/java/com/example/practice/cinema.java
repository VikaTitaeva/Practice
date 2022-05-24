package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class cinema extends AppCompatActivity {
TextView tvInfo;
EditText tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cinema );
        tvInfo=(TextView) findViewById( R.id.tvInfo );
        tvName=(EditText) findViewById( R.id.editTextTextPersonName );
    }
}