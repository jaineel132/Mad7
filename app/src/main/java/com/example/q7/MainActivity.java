package com.example.q7;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.ch1);
        c2=findViewById(R.id.ch2);
        c3=findViewById(R.id.ch3);
        c4=findViewById(R.id.ch4);
        c5=findViewById(R.id.ch5);
        b=findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked()){
                    Toast.makeText(MainActivity.this,"Chechbox 1 is checked",Toast.LENGTH_SHORT).show();
                }
                if(c2.isChecked()){
                    Toast.makeText(MainActivity.this,"Chechbox 2 is checked",Toast.LENGTH_SHORT).show();
                }
                if(c3.isChecked()){
                    Toast.makeText(MainActivity.this,"Chechbox 3 is checked",Toast.LENGTH_SHORT).show();
                }
                if(c4.isChecked()){
                    Toast.makeText(MainActivity.this,"Chechbox 4 is checked",Toast.LENGTH_SHORT).show();
                }
                if(c5.isChecked()){
                    Toast.makeText(MainActivity.this,"Chechbox 5 is checked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        }
    }
