package com.shakil.pecticealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view, view2;
    EditText edbuy;
    EditText edsell;
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=findViewById(R.id.view);
        mybutton=findViewById(R.id.mybutton);
        edbuy=findViewById(R.id.edbuy);
        edsell=findViewById(R.id.edsell);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float byprice, sellprice, profit, profitPercent;

                String sBuy = edbuy.getText().toString();
                byprice= Float.parseFloat(sBuy);

                 String sSell = edsell.getText().toString();
                 sellprice = Float.parseFloat(sSell);

                profit = sellprice - byprice;
                profitPercent = profit/byprice*100;

                 view.setText("মোট লাভ:"+profit+"\nকত % লাভ:"+profitPercent+"%");

            }
        });

    }
}