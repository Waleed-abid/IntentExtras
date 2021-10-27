package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtView = (TextView)findViewById(R.id.txtView);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        txtView.setText(str);
    }
}