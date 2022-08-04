package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inNum1, inNum2;
    Button btPlus, btMin, btMtp, btDiv, btClear;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inNum1=(EditText) findViewById(R.id.inputnum1);
        inNum2=(EditText) findViewById(R.id.inputnum2);
        tvRes=(TextView) findViewById(R.id.ketRes);
        btPlus=(Button) findViewById(R.id.btPlus);
        btMin=(Button) findViewById(R.id.btMin);
        btMtp=(Button) findViewById(R.id.btMtp);
        btDiv=(Button) findViewById(R.id.btDiv);
        btClear=(Button) findViewById(R.id.btClear);

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                num1=Double.valueOf(inNum1.getText().toString().trim());
                num2=Double.valueOf(inNum2.getText().toString().trim());
                res=num1+num2;
                String resX=String.valueOf(res);
                tvRes.setText(resX);
            }
        });

        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                num1=Double.valueOf(inNum1.getText().toString().trim());
                num2=Double.valueOf(inNum2.getText().toString().trim());
                res=num1-num2;
                String resX=String.valueOf(res);
                tvRes.setText(resX);
            }
        });

        btMtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                num1=Double.valueOf(inNum1.getText().toString().trim());
                num2=Double.valueOf(inNum2.getText().toString().trim());
                res=num1*num2;
                String resX=String.valueOf(res);
                tvRes.setText(resX);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                num1=Double.valueOf(inNum1.getText().toString().trim());
                num2=Double.valueOf(inNum2.getText().toString().trim());
                res=num1/num2;
                String resX=String.valueOf(res);
                tvRes.setText(resX);
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inNum1.setText("");
                inNum2.setText("");
                tvRes.setText("0");
            }
        });
    }
}