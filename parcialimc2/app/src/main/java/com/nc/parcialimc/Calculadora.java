package com.nc.parcialimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

  public class Calculadora extends AppCompatActivity implements View.OnClickListener {
      public TextView textViewN;
      public TextView textViewRe;
      public Button btnSiete;
      public Button btnOcho;
      public Button btnNueve;
      public Button btnCuatro;
      public Button btnCinco;
      public Button btnSeis;
      public Button btnUno;
      public Button btnDos;
      public Button btnTres;
      public Button btnCero;
      public Button btnIgual;
      public Button btnSuma;
      public Button btnResta;
      public Button btnMultiplicacion;
      public Button btnDivision;
      public Button btnInicioCalc;
      

      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_calculadora);
          btnIgual.setOnClickListener(this);
          Toast.makeText(this, "Bienvenido: " + textViewN, Toast.LENGTH_SHORT).show();
      }

      private void setContentViewEvents() {
          btnSiete.setOnClickListener(this);
          btnOcho.setOnClickListener(this);
          btnNueve.setOnClickListener(this);
          btnCuatro.setOnClickListener(this);
          btnCinco.setOnClickListener(this);
          btnSeis.setOnClickListener(this);
          btnUno.setOnClickListener(this);
          btnDos.setOnClickListener(this);
          btnTres.setOnClickListener(this);
          btnIgual.setOnClickListener(this);
          btnSuma.setOnClickListener(this);
          btnResta.setOnClickListener(this);
          btnMultiplicacion.setOnClickListener(this);
          btnDivision.setOnClickListener(this);
          btnInicioCalc.setOnClickListener(this);


      }

      private void setContentAttributes() {

          textViewN = findViewById(R.id.textViewN);
          textViewRe = findViewById(R.id.textViewRe);
          btnSiete = findViewById(R.id.btnSiete);
          btnOcho = findViewById(R.id.btnOcho);
          btnNueve = findViewById(R.id.btnNueve);
          btnCuatro = findViewById(R.id.btnCuatro);
          btnCinco = findViewById(R.id.btnCinco);
          btnSeis = findViewById(R.id.btnSeis);
          btnUno = findViewById(R.id.btnUno);
          btnDos = findViewById(R.id.btnDos);
          btnCero = findViewById(R.id.btnCero);
          btnSuma = findViewById(R.id.btnSuma);
          btnResta = findViewById(R.id.btnResta);
          btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
          btnDivision = findViewById(R.id.btnDivision);
          btnInicioCalc = findViewById(R.id.btnInicioCalc);
          

      }


      public Double Calculadora(double valor1, double valor2, String operacion){
          double resultado = 0.0;
          switch (operacion){
              case "Suma":{
                  resultado = valor1 + valor2;
                  break;
              }
              case "Resta":{
                  resultado = valor1 - valor2;
                  break;
              }
              case "Division":
                  resultado = valor1 / valor2;
                  break;

              case "Multiplicacion":{
                  resultado = valor1 * valor2;
                  break;
              }

          }
          return resultado;
      }

      @Override
      public void onClick(View v) {
          switch (v.getId()) {
              case R.id.btnCalc: {
                  Double valor1 = Double.parseDouble(btnUno.getText().toString());
                  Double valor2 = Double.parseDouble(btnCinco.getText().toString());

                  String operador = btnSuma.getText().toString();
                  Double Calculo = Calculadora(valor1, valor2, operador);
                  Toast.makeText(this, "El resultado  es: " + Calculo, Toast.LENGTH_LONG).show();
              }


          }

      }
  }