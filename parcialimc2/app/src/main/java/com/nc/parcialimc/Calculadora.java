package com.nc.parcialimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "NA");
        Toast.makeText(getApplicationContext(), " " + name, Toast.LENGTH_LONG).show();
        setContentAttributes();
        setContentViewEvents();
        SharedPreferences sp = getSharedPreferences("nombreUsuario",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", "Natalia");
        editor.commit();
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
      public class Calcular {

          public void addition_isCorrect() {
              assertEquals(4, 2 + 2);
          }
      }

      private void assertEquals(int i, int i1) {
      }



      @Override
      public void onClick(View v) {
          switch (v.getId()){
              case R.id.btnInicioCalc:
                  InicioCalcAction();


          }
      }

      private void InicioCalcAction() {
          Toast.makeText(this,"Formulario", Toast.LENGTH_LONG).show();
          Intent intent = new Intent(Calculadora.this,MainActivity.class);
          startActivity(intent);
      }
  }







