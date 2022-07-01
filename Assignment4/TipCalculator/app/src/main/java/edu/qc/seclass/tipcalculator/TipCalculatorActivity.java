package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class TipCalculatorActivity extends AppCompatActivity {

    double checkAmount;
    int partySize;

    EditText checkAmountValueInput;
    EditText partySizeValueInput;
    Button buttonComputeClick;
    EditText fifteenPercentTipValueInput;
    EditText twentyPercentTipValueInput;
    EditText twentyfivePercentTipValueInput;
    EditText fifteenPercentTotalValueInput;
    EditText twentyPercentTotalValueInput;
    EditText twentyfivePercentTotalValueInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        checkAmountValueInput = findViewById(R.id.checkAmountValue);
        partySizeValueInput = findViewById(R.id.partySizeValue);
        buttonComputeClick = findViewById(R.id.buttonCompute);
        fifteenPercentTipValueInput = findViewById(R.id.fifteenPercentTipValue);
        twentyPercentTipValueInput = findViewById(R.id.twentyPercentTipValue);
        twentyfivePercentTipValueInput = findViewById(R.id.twentyfivePercentTipValue);
        fifteenPercentTotalValueInput = findViewById(R.id.fifteenPercentTotalValue);
        twentyPercentTotalValueInput = findViewById(R.id.twentyPercentTotalValue);
        twentyfivePercentTotalValueInput = findViewById(R.id.twentyfivePercentTotalValue);

        buttonComputeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closekeyboard();

                if (checkAmountValueInput.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Negative or incorrect value(s)!", Toast.LENGTH_LONG).show();
                } else if (partySizeValueInput.getText().length() == 0) { //toast message for empty party size.
                    Toast.makeText(getApplicationContext(), "Please enter a number for size of people.", Toast.LENGTH_LONG).show();
                } else if (Integer.valueOf(checkAmountValueInput.getText().toString()) <= 0) {  //toast message for 0 amount or less.
                    Toast.makeText(getApplicationContext(), "Please enter a number for check amount", Toast.LENGTH_LONG).show();
                } else {
                    checkAmount = Double.valueOf(checkAmountValueInput.getText().toString());
                    partySize = Integer.valueOf(partySizeValueInput.getText().toString());
                    double Tip = checkAmount / partySize;


                    Integer Tip15PercentEach = (int) Math.ceil(Tip * 0.15);
                    Integer Tip20PercentEach = (int) Math.ceil(Tip * 0.20);
                    Integer Tip25PercentEach = (int) Math.ceil(Tip * 0.25);

                    fifteenPercentTipValueInput.setText(Tip25PercentEach.toString());
                    twentyPercentTipValueInput.setText(Tip20PercentEach.toString());
                    twentyfivePercentTipValueInput.setText(Tip25PercentEach.toString());

                    Integer Total15PercentEach = (int) Math.ceil(Tip + Tip15PercentEach);
                    Integer Total20PercentEach = (int) Math.ceil(Tip + Tip20PercentEach);
                    Integer Total25PercentEach = (int) Math.ceil(Tip + Tip25PercentEach);

                    fifteenPercentTotalValueInput.setText(Total15PercentEach.toString());
                    twentyPercentTotalValueInput.setText(Total20PercentEach.toString());
                    twentyfivePercentTotalValueInput.setText(Total25PercentEach.toString());
                }
            }
        });

    }

    public void closekeyboard(){
        View view = this.getCurrentFocus();
        if(view != null){
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }
}

