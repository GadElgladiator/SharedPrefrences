package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView name;
TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences s=getApplicationContext().getSharedPreferences("credentials", Context.MODE_PRIVATE);
        name=findViewById(R.id.n);
        email=findViewById(R.id.e);
        name.setText(s.getString("name",""));
        email.setText(s.getString("email",""));

    }
}