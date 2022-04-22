package com.nc.parcialimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Imc extends AppCompatActivity implements View.OnClickListener {
    public EditText nombre2;
    public EditText txtPeso;
    public EditText txtAltura;
    public Button btnCalcular;
    public Button btnInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "NA");
        Toast.makeText(getApplicationContext(), "Hola Mundo " + name, Toast.LENGTH_LONG).show();
        setContentAttributes();
        setContentViewEvents();
        SharedPreferences sp = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", "Natalia");
        editor.commit();
    }

    private void setContentViewEvents() {
        btnCalcular.setOnClickListener(this);


    }

    private void setContentAttributes() {

        nombre2 = findViewById(R.id.nombre);
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnInicio = findViewById(R.id.btnInicio);
        txtPeso.setOnClickListener(this);
        txtAltura.setOnClickListener(this);


    }

    public Double Calcular (double peso, double altura){
        double Imc = 0;
        Imc = peso / (altura*altura);
        return Imc;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalcular:
                CalcularAction();

                Double peso = Double.parseDouble(txtPeso.getText().toString);
                Double altura = Double.parseDouble(txtAltura.getText().toString);
                Double Imc = Calcular(peso, altura);

                Toast.makeText(this, text:"Su Imc es:"+ Imc,Toast.LENGTH_LONG).Show();

        }
    }
    private void CalcularAction() {
        //Toast.makeText(this,"Formulario", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Imc.this, Resultado.class);
        startActivity(intent);
    }
}