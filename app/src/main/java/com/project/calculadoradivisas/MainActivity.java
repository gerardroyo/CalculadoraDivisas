package com.project.calculadoradivisas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private Button buttonComa;
    private Button buttonIgual;
    private Button buttonSup;
    private Button buttonCE;

    private Button buttonLliures;
    private Button buttonDollar;
    private Button buttonYen;
    private Button buttonYuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonComa = (Button) findViewById(R.id.buttonComa);
        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonSup = (Button) findViewById(R.id.buttonSup);
        buttonCE = (Button) findViewById(R.id.buttonCE);

        buttonLliures = (Button) findViewById(R.id.buttonLliures);
        buttonDollar = (Button) findViewById(R.id.buttonDollar);
        buttonYen = (Button) findViewById(R.id.buttonYen);
        buttonYuan = (Button) findViewById(R.id.buttonYuan);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IntroduirValorEuro();
            }
        });
    }

    private void IntroduirValorEuro() {
        /*int valor;
        valor = Integer.valueOf(edtNumero.getText().toString());
        valor++;
        edtNumero.setText(String.valueOf(valor));*/
    }

}
