package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangle_calculator extends AppCompatActivity {
    Button bnr1;
    EditText numberr1,numberr2;
    TextView tVr1,tVr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_calculator);
        tVr1=findViewById(R.id.tVr1);
        tVr2=findViewById(R.id.tVr2);
        numberr1=findViewById(R.id.Numberr1);
        numberr2=findViewById(R.id.Numberr2);
        bnr1=findViewById(R.id.bnr1);
        bnr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2;
                num1=Integer.parseInt(numberr1.getText().toString());
                num2=Integer.parseInt(numberr2.getText().toString());
                int rec=num1*num2;
                tVr2.setText(String.valueOf(rec));

            }
        });
    }
}