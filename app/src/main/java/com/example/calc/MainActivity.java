package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double firstNumber = 0;
    private String currentOp = null;

    private String performOperation(Double secondNumber) {
        String result = "0";
        switch(currentOp) {
            case "/":
                result =  Double.toString(firstNumber/secondNumber);
                break;
            case "*":
                result =   Double.toString(firstNumber*secondNumber);
                break;
            case "-":
                result =   Double.toString(firstNumber-secondNumber);
                break;
            case "+":
                result =   Double.toString(firstNumber+secondNumber);
                break;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//        OUTPUT TEXT VIEW
        final TextView resultScreen = findViewById(R.id.resultView);


//        NUMBER BUTTONS
        final Button n0 = findViewById(R.id.numBtn_0);
        final Button n1 = findViewById(R.id.numBtn_1);
        final Button n2 = findViewById(R.id.numBtn_2);
        final Button n3 = findViewById(R.id.numBtn_3);
        final Button n4 = findViewById(R.id.numBtn_4);
        final Button n5 = findViewById(R.id.numBtn_5);
        final Button n6 = findViewById(R.id.numBtn_6);
        final Button n7 = findViewById(R.id.numBtn_7);
        final Button n8 = findViewById(R.id.numBtn_8);
        final Button n9 = findViewById(R.id.numBtn_9);


//        OPERATION BUTTONS
        final Button opDiv = findViewById(R.id.op_divide);
        final Button opMul = findViewById(R.id.op_multiply);
        final Button opSub = findViewById(R.id.op_subtract);
        final Button opAdd = findViewById(R.id.op_add);
        final Button opEqls = findViewById(R.id.op_equals);

//        FUNCTION BUTTONS
        final Button fnAc = findViewById(R.id.op_ac);
        final Button fnSignSwitcher = findViewById(R.id.op_signSwitcher);
        final Button fnPer = findViewById(R.id.op_percentage);

        final View.OnClickListener calculatorListner = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int id = v.getId();

                switch(id){
                    case R.id.numBtn_0:
                        resultScreen.setText((resultScreen.getText().toString()+"0").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_1:

                        resultScreen.setText((resultScreen.getText().toString()+"1").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_2:
                        resultScreen.setText((resultScreen.getText().toString()+"2").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_3:
                        resultScreen.setText((resultScreen.getText().toString()+"3").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_4:
                        resultScreen.setText((resultScreen.getText().toString()+"4").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_5:
                        resultScreen.setText((resultScreen.getText().toString()+"5").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_6:
                        resultScreen.setText((resultScreen.getText().toString()+"6").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_7:
                        resultScreen.setText((resultScreen.getText().toString()+"7").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_8:
                        resultScreen.setText((resultScreen.getText().toString()+"8").replaceFirst ("^0*", ""));
                        break;
                    case R.id.numBtn_9:
                        resultScreen.setText((resultScreen.getText().toString()+"9").replaceFirst ("^0*", ""));
                        break;
                    case R.id.op_divide:
                        if(currentOp != null) {
                            String res = performOperation(Double.parseDouble(resultScreen.getText().toString()));
                            firstNumber = Double.parseDouble(res);
                            resultScreen.setText("0");
                        } else {
                            firstNumber = Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText("0");
                        }
                        currentOp = "/";
                        break;
                    case R.id.op_multiply:
                        if(currentOp != null) {
                            String res = performOperation(Double.parseDouble(resultScreen.getText().toString()));
                            firstNumber = Double.parseDouble(res);
                            resultScreen.setText("0");
                        } else {
                            firstNumber = Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText("0");
                        }
                        currentOp = "*";
                        break;
                    case R.id.op_subtract:
                        if(currentOp != null) {
                            String res = performOperation(Double.parseDouble(resultScreen.getText().toString()));
                            firstNumber = Double.parseDouble(res);
                            resultScreen.setText("0");
                        } else {
                            firstNumber = Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText("0");
                        }
                        currentOp = "-";
                        break;
                    case R.id.op_add:
                        if(currentOp != null) {
                            String res = performOperation(Double.parseDouble(resultScreen.getText().toString()));
                            firstNumber = Double.parseDouble(res);
                            resultScreen.setText("0");
                        } else {
                            firstNumber = Double.parseDouble(resultScreen.getText().toString());
                            resultScreen.setText("0");
                        }
                        currentOp = "+";
                        break;
                    case R.id.op_equals:
                        if(currentOp != null) {
                            String res = performOperation(Double.parseDouble(resultScreen.getText().toString()));
                            firstNumber = 0;
                            resultScreen.setText(res);
                            currentOp = null;
                        }
                        break;
                    case R.id.op_ac:
                        firstNumber = 0;
                        currentOp = null;
                        resultScreen.setText("0");
                        break;
                    case R.id.op_signSwitcher:

                        break;
                    case R.id.op_percentage:

                        break;
                }
            }
        };
        n0.setOnClickListener(calculatorListner);
        n1.setOnClickListener(calculatorListner);
        n2.setOnClickListener(calculatorListner);
        n3.setOnClickListener(calculatorListner);
        n4.setOnClickListener(calculatorListner);
        n5.setOnClickListener(calculatorListner);
        n6.setOnClickListener(calculatorListner);
        n7.setOnClickListener(calculatorListner);
        n8.setOnClickListener(calculatorListner);
        n9.setOnClickListener(calculatorListner);
        opDiv.setOnClickListener(calculatorListner);
        opMul.setOnClickListener(calculatorListner);
        opSub.setOnClickListener(calculatorListner);
        opAdd.setOnClickListener(calculatorListner);
        opEqls.setOnClickListener(calculatorListner);
        fnAc.setOnClickListener(calculatorListner);
        fnSignSwitcher.setOnClickListener(calculatorListner);
        fnPer.setOnClickListener(calculatorListner);
    }
}
