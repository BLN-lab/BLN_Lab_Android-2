package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends  AppCompatActivity{
    private Button activator;
    private EditText name,address,phone;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activator=findViewById(R.id.button);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        phone=findViewById(R.id.phone);
        answer=findViewById(R.id.textView);

        activator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("Name:"+name.getText().toString()+"\nPhone:"+phone.getText().toString()+"\nAddress:"+address.getText().toString());
            }
        });
    }
}