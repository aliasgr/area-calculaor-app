package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bnm1,bnm2,bnm3,bnm4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void SQURE(View view){

        Intent intent=new Intent(this,squre_calculator.class);
        startActivity(intent);
    }
    public void RECTANGLE(View view){

        Intent intent=new Intent(this,rectangle_calculator.class);
        startActivity(intent);
    }
    public void CIRCLE(View view){

        Intent intent=new Intent(this,circle_calculator.class);
        startActivity(intent);
    }
    public void TRIANGLE(View view){

        Intent intent=new Intent(this,triangle_calculator.class);
        startActivity(intent);
    }



}