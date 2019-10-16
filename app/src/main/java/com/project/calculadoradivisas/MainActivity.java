package com.project.calculadoradivisas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonComa;
    private Button buttonIgual;
    private Button buttonSup;
    private Button buttonCE;

    private Button buttonLliures;
    private Button buttonDollar;
    private Button buttonYen;
    private Button buttonYuan;

    private TextView textViewNumEuro;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonIgual = findViewById(R.id.buttonIgual);
        buttonSup = findViewById(R.id.buttonSup);
        buttonCE = findViewById(R.id.buttonCE);

        buttonLliures = findViewById(R.id.buttonLliures);
        buttonDollar = findViewById(R.id.buttonDollar);
        buttonYen = findViewById(R.id.buttonYen);
        buttonYuan = findViewById(R.id.buttonYuan);

        textViewNumEuro = findViewById(R.id.textViewNumEuro);

        button =  findViewById(R.id.button0);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("0");
            }
        });

        button =  findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("1");
            }
        });

        button =  findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               IntroduirValorEuro("2");
           }
       });

        button =  findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("3");
            }
        });

        button =  findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("4");
            }
        });

        button =  findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("5");
            }
        });

        button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("6");
            }
        });

        button = findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("7");
            }
        });

        button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("8");
            }
        });

        button = findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro("9");
            }
        });

        button = findViewById(R.id.buttonComa);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro(",");
            }
        });
    }

    private void IntroduirValorEuro(String valor) {

        String numTextEuro = textViewNumEuro.getText().toString();

        if (numTextEuro.equals("0") && valor != (",")) {
            numTextEuro = "";
            textViewNumEuro.setText(numTextEuro + valor);
        } else {

            if (numTextEuro.indexOf(",") >= 0) {
                if(numTextEuro.substring(numTextEuro.indexOf(",")).length() <= 2) {
                    if (numTextEuro.equals("0")) {
                        numTextEuro = "";
                }
            }

            textViewNumEuro.setText(numTextEuro + valor);
        }




    }

}
