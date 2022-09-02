package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView number1;
    private TextView number2;
    private TextView ansView;

    private EditText editnum1;
    private EditText editnum2;
    private Button addButton;
    private Button subButton;
    private Button mulButton;
    private Button divButton;
    private Button resetButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons set

        editnum1=findViewById(R.id.editnum1);
        editnum2=findViewById(R.id.editnum2);
        addButton=findViewById(R.id.addButton);
        subButton=findViewById(R.id.subButton);
        mulButton=findViewById(R.id.mulButton);
        divButton=findViewById(R.id.divButton);
        resetButton=findViewById(R.id.resetButton);
        ansView=findViewById(R.id.ansView);

    }
    public void calculator(View view){


        String tag=view.getTag().toString();
        ansView.setText(tag);


        double ans=0;
        int num1=Integer.parseInt(editnum1.getText().toString());
        int num2=Integer.parseInt(editnum2.getText().toString());

       switch (tag){
           case "add":
               ans=num1+num2;
               break;
           case "sub":
               ans=num1-num2;
                break;
           case "mul":
               ans=num1*num2;
               break;
           case "div":
               ans=num1/num2;
               break;

       }


        ansView.setText(String.valueOf(ans));

    }
//    public void addNum(View view){
//    int num1=Integer.parseInt(editnum1.getText().toString());
//    int num2=Integer.parseInt(editnum2.getText().toString());
//    ansView.setText(String.valueOf(num1+num2));
//
//    }
//
//    public void subButton(View view){
//        int num1=Integer.parseInt(editnum1.getText().toString());
//        int num2=Integer.parseInt(editnum2.getText().toString());
//        ansView.setText(String.valueOf(num1-num2));
//
//    }
//
//    public void mulButton(View view){
//        int num1=Integer.parseInt(editnum1.getText().toString());
//        int num2=Integer.parseInt(editnum2.getText().toString());
//        ansView.setText(String.valueOf(num1*num2));
//    }
//
//    public void divButton(View view){
//        double num1=Double.parseDouble(editnum1.getText().toString());
//        double num2=Double.parseDouble(editnum2.getText().toString());
//        ansView.setText(String.valueOf(num1/num2));
//    }
//
//    public void resetBtn(View view){
//
//    }

}
