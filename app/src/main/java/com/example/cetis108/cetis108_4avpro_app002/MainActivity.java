package com.example.cetis108.cetis108_4avpro_app002;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;
    Button sum, res, div, mult;
    View resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sum = (Button) findViewById(R.id.sum);
        res = (Button) findViewById(R.id.res);
        div = (Button) findViewById(R.id.div);
        mult = (Button) findViewById(R.id.mult);

        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        div.setOnClickListener(this);
        mult.setOnClickListener(this);

        resul=findViewById(R.id.resul);


    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         String  n1 = num1.getText().toString();
         String  n2 = num2.getText().toString();

         int entero1= Integer.parseInt(n1);
         int entero2= Integer.parseInt(n2);
         int rta=0;

         case R.id.sum;
             rta=entero1+entero2;
             break;
         case R.id.res;
             rta=entero1-entero2;
             break;
         case R.id.div;
             rta=entero1/entero2;
             break;
         case R.id.mult;
             rta=entero1*entero2;
             break;

     }

        resul.setTextAlignment(""rta);
    }

}
