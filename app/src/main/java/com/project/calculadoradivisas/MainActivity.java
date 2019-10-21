
// Developed by Gerard Royo i Plà
// Twitter: @RoshsKipo

package com.project.calculadoradivisas;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private Button buttonLliures;
    private Button buttonDollar;
    private Button buttonYen;
    private Button buttonYuan;

    private TextView textViewNumEuro;
    private TextView textViewNumDivisa;

    private Button button;
    private boolean MonedaSeleccionada = false;
    private double numConvercio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNumEuro = findViewById(R.id.textViewNumEuro);
        textViewNumDivisa = findViewById(R.id.textViewNumDivisa);

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
<<<<<<< HEAD
        button = findViewById(R.id.buttonComa);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Delete();
=======

        button = findViewById(R.id.buttonIgual);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrarConvercio();
            }
        });

        button = findViewById(R.id.buttonSup);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BorrarUn();
            }
        });

        button = findViewById(R.id.buttonCE);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BorrarTot();
            }
        });

        buttonLliures =  findViewById(R.id.buttonLliures);
        buttonLliures.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (MonedaSeleccionada == false) {
                    conversioMoneda("LLIURE");
                }
            }
        });

        buttonDollar =  findViewById(R.id.buttonDollar);
        buttonDollar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (MonedaSeleccionada == false) {
                    conversioMoneda("DOLLAR");
                }
            }
        });

        buttonYen =  findViewById(R.id.buttonYen);
        buttonYen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (MonedaSeleccionada == false) {
                    conversioMoneda("YEN");
                }
            }
        });

        buttonYuan =  findViewById(R.id.buttonYuan);
        buttonYuan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (MonedaSeleccionada == false) {
                    conversioMoneda("YUAN");
                }
>>>>>>> e0fd24bed18c4ab60e5cb1e1c3b417cfe93da3bf
            }
        });
    }

    private void IntroduirValorEuro(String valor) {

        String numTextEuro = textViewNumEuro.getText().toString();

<<<<<<< HEAD
        if (numTextEuro.equals("0") && valor != (",")) {
            numTextEuro = "";
            textViewNumEuro.setText(numTextEuro + valor);
        } else {

            if (numTextEuro.indexOf(",") >= 0) {
                if (numTextEuro.substring(numTextEuro.indexOf(",")).length() <= 2) {
                    if (numTextEuro.equals("0")) {
                        numTextEuro = "";
                    }
                }

                textViewNumEuro.setText(numTextEuro + valor);
            }


        }

    }

    private void Delete() {
=======
        if (valor == ",") {
            if (numTextEuro.indexOf(',') <= 0) {
                textViewNumEuro.setText(numTextEuro + valor);
            }
        } else if (numTextEuro.indexOf(',') >= 0) { // Comprova si existeix una coma
            if (numTextEuro.substring(numTextEuro.indexOf(",")).length() <= 2) { // Si existeix, conta quants caràcters hi han a partir de la coma. Si hi han 2, deixa d'introduir números.
                if (numTextEuro.equals("0")) {
                    numTextEuro = "";
                }

                textViewNumEuro.setText(numTextEuro + valor);
            }
        }
        else {
            if (numTextEuro.equals("0")) {
                numTextEuro = "";
            }

            textViewNumEuro.setText(numTextEuro + valor);
        }
    }

    private void BorrarTot() {
        textViewNumEuro.setText("0");
        textViewNumDivisa.setText("0");
    }

    private void BorrarUn() {

        String numTextEuro = textViewNumEuro.getText().toString();
        int posicioUltim = 0;

        if (numTextEuro != "0" && numTextEuro != null) {
            if (numTextEuro.length() == 1) {
                numTextEuro = "0";
            } else {
                numTextEuro = numTextEuro.substring(0, numTextEuro.length() - 1);
            }

        }

        textViewNumEuro.setText(numTextEuro);
    }

    private void conversioMoneda(final String moneda) {
        AlertDialog ad;

        ad = new AlertDialog.Builder(this).create();
        ad.setTitle("A " + moneda);
        ad.setMessage("Quants EURO són 1 " + moneda + " ?");

        // Ahora forzamos que aparezca el editText
        final EditText edtValor = new EditText(this);
        ad.setView(edtValor);

        ad.setButton(AlertDialog.BUTTON_POSITIVE,"ACTUALITZAR", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                try {
                    String valorString = edtValor.getText().toString().replaceAll(",", ".");
                    numConvercio = Double.valueOf(valorString);

                    switch (moneda) {
                        case "LLIURE":
                            buttonLliures.setBackgroundColor(Color.parseColor("#00EDF6"));
                            buttonLliures.setTextColor(Color.parseColor("#030303"));
                            break;
                        case "DOLLAR":
                            buttonDollar.setBackgroundColor(Color.parseColor("#00EDF6"));
                            buttonDollar.setTextColor(Color.parseColor("#030303"));
                            break;
                        case "YEN":
                            buttonYen.setBackgroundColor(Color.parseColor("#00EDF6"));
                            buttonYen.setTextColor(Color.parseColor("#030303"));
                            break;
                        case "YUAN":
                            buttonYuan.setBackgroundColor(Color.parseColor("#00EDF6"));
                            buttonYuan.setTextColor(Color.parseColor("#030303"));
                            break;
                    }
                    MonedaSeleccionada = true;
                    Toast.makeText(getApplicationContext(), "S'ha pres el botó ACTUALITZAR, el valor escrit és " + edtValor.getText().toString(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "S'ha escrit un caracter que no corresponia ", Toast.LENGTH_LONG).show();
                }
            }
        });

        ad.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCELAR", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // no fem res.
                //MonedaSeleccionada = false;
            }
        });

        ad.show();
>>>>>>> e0fd24bed18c4ab60e5cb1e1c3b417cfe93da3bf

        // el Show es asíncrono.
    }

    private void mostrarConvercio() {
        DecimalFormat formatDecimal = new DecimalFormat("#.##");

        String textViewNumEuroConvert = textViewNumEuro.getText().toString().replaceAll(",",".");

        double textViewDouble = Double.valueOf(textViewNumEuroConvert);

        textViewNumDivisa.setText(formatDecimal.format(textViewDouble * numConvercio));

    }
}
