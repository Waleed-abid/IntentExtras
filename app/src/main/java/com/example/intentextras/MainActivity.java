package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTxt;
    Button btnExtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxt = findViewById(R.id.edtTxt);
        btnExtras = findViewById(R.id.btnExtras);

        btnExtras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String str = edtTxt.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });



    }
}