package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class squre_calculator extends AppCompatActivity {
    Button bns1;
    EditText numbers1,numbers2;
    TextView  tVs1,tVs2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squre_calculator);
        tVs1=findViewById(R.id.tVs1);
        tVs2=findViewById(R.id.tVs2);
        numbers1=findViewById(R.id.Numbers1);
        bns1=findViewById(R.id.bns1);
        bns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1;
                num1=Integer.parseInt(numbers1.getText().toString());
                int sqr=num1*num1;
                tVs2.setText(String.valueOf(sqr));


            }
        });
    }
}