package com.example.roomreservationhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentCalculations extends AppCompatActivity {
    private static String day;
    Button clear, payment;
    EditText days;
    TextView result, tv2;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_calculations);

        clear= (Button) findViewById(R.id.clear);
        payment= (Button) findViewById(R.id.payment);
        days= (EditText) findViewById(R.id.days);
        result= (TextView) findViewById(R.id.result);
        tv2= (TextView) findViewById(R.id.tv2);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("");
                result.setText("");
                days.setText("");
                Toast.makeText(PaymentCalculations.this, "Cleared fields", Toast.LENGTH_SHORT).show();
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateInput()){
                    n= Integer.parseInt(day);
                    int cal= n * 10;
                    String s= String.valueOf(cal);
                    result.setText("Calculated cost for stay is:" +s+"  OMR");
                }
            }
        });
    }

    private Boolean validateInput(){
        boolean result= false;
        day= days.getText().toString();

        if(day.isEmpty()){
            Toast.makeText(this, "Enter no. of days to stay", Toast.LENGTH_SHORT).show();
        }else {
            result= true;
        }
        return result;
    }


    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed
        startActivity(new Intent(PaymentCalculations.this, MenuOptions.class));
        finish();
    }
}