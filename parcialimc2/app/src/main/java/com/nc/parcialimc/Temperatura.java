package com.nc.parcialimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity implements View.OnClickListener{
    public TextView textViewNTemp;
    public RadioButton radioButtonC;
    public RadioButton radioButtonF;
    public RadioButton radioButtonK;
    public TextView Cels;
    public TextView faren;
    public TextView kelvin;
    public Button btnCalTemp;
    public TextView CalC;
    public TextView CalcF;
    public Button btnInicioTem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        btnCalTemp.setOnClickListener(this);
        Toast.makeText(this, "Bienvenido al conversor: " + textViewNTemp, Toast.LENGTH_SHORT).show();

    }

    private void setContentViewEvents() {
        btnInicioTem.setOnClickListener(this);
    }

    private void setContentAttributes() {
        textViewNTemp = findViewById(R.id.textViewNTemp);
        radioButtonC = findViewById(R.id.radioButtonC);
        radioButtonF = findViewById(R.id.radioButtonF);
        radioButtonK = findViewById(R.id.radioButtonK);
        Cels = findViewById(R.id.Cels);
        faren = findViewById(R.id.faren);
        kelvin = findViewById(R.id.kelvin);
        btnCalTemp = findViewById(R.id.btnCalTemp);
        CalC = findViewById(R.id.CalC);
        CalcF= findViewById(R.id.CalcF);
        btnInicioTem= findViewById(R.id.btnInicioTem);

    }

    public Double Temperatura (double valor, String temp1, String temp2){
        double resultado = 0.0;
        switch (temp1){
            case "Celsius":
                switch (temp2){
                    case "Celsius":{
                        resultado = valor;
                        break;
                    }
                    case "Fahrenheit":{
                        resultado = (valor * 1.8) +32;
                        break;
                    }
                    case "Kelvin":{
                        resultado = valor + 273.15;
                        break;
                    }
                    case "Rankine":{
                        resultado = valor * 493.47;
                        break;
                    }
                }
                break;
            case "Fahrenheit":
                switch (temp2){
                    case "Celsius":{
                        resultado = 0.55 * (valor - 32);
                        break;
                    }
                    case "Fahrenheit":{
                        resultado = valor;
                        break;
                    }
                    case "Kelvin":{
                        resultado = (valor - 32) * 0.55 + 273.15;
                        break;
                    }
                    case "Rankine":{
                        resultado = valor * 459.67;
                        break;
                    }
                }
                break;
            case "Kelvin":
                switch (temp2){
                    case "Celsius":{
                        resultado = valor - 213.15;
                        break;
                    }
                    case "Fahrenheit":{
                        resultado = (valor - 273.15) * 14 + 32;
                        break;
                    }
                    case "Kelvin":{
                        resultado = valor;
                        break;
                    }
                    case "Rankine":{
                        resultado = valor * 0.6;
                        break;
                    }
                }
                break;
            case "Rankine":
                switch (temp2){
                    case "Celsius":{
                        resultado = (valor - 491.67) * 0.55;
                        break;
                    }
                    case "Fahrenheit":{
                        resultado = valor - 459.67;
                        break;
                    }
                    case "Kelvin":{
                        resultado = valor * 0.55;
                        break;
                    }
                    case "Rankine":{
                        resultado = valor;
                        break;
                    }
                }
                break;
        }

        return resultado;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalTemp: {
                Double valorIng = Double.parseDouble(btnCalTemp.getText().toString());
                String temperatura1 = CalC.getText().toString();
                String temperatura2 = CalcF.getText().toString();
                Double CalcT = Temperatura(valorIng, temperatura1, temperatura2);
                //Toast.makeText(this, "El valor es: " + temperatura1, Toast.LENGTH_LONG).show();
                Toast.makeText(this, "El valor es: " + CalcT, Toast.LENGTH_LONG).show();
            }
        }
    }
}