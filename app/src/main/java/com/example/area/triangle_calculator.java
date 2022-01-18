package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle_calculator extends AppCompatActivity {
    Button bnt1;
    EditText numbert1,numbert2;
    TextView tVt1,tVt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_calculator);
        tVt1=findViewById(R.id.tVt1);
        tVt2=findViewById(R.id.tVt2);
        numbert1=findViewById(R.id.Numbert1);
        numbert2=findViewById(R.id.Numbert2);
        bnt1=findViewById(R.id.bnt1);
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2;
                num1=Integer.parseInt(numbert1.getText().toString());
                num2=Integer.parseInt(numbert2.getText().toString());
                int tri=(num1*num2)/2;
                tVt2.setText(String.valueOf(tri));


            }
        });

    }
}