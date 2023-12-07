package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
SharedPreferences s;
Button proceed = findViewById(R.id.proceed);
EditText name;
EditText email;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        s=getSharedPreferences("credentials",MODE_PRIVATE);
      String n=  name.getText().toString();
      String e=email.getText().toString();
       SharedPreferences.Editor editor=s.edit();
       editor.putString("name",n);
        editor.putString("email",e);
        editor.commit();
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });


    }
}