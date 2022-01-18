package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class circle_calculator extends AppCompatActivity {
    Button bnc1;
    EditText numberc1,numberc2;
    TextView tVc1,tVc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_calculator);
        tVc1=findViewById(R.id.tVc1);
        tVc2=findViewById(R.id.tVc2);
        numberc1=findViewById(R.id.Numberc1);
        bnc1=findViewById(R.id.bnc1);
        bnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num;
                num=Integer.parseInt(numberc1.getText().toString());
                double cir=3.14*(num*num);
                tVc2.setText(String.valueOf(cir));

            }
        });
    }
}