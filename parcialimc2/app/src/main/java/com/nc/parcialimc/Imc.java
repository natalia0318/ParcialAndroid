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
    public EditText peso;
    public EditText altura;
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
        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnInicio = findViewById(R.id.btnInicio);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalcular:
                CalcularAction();


        }
    }

    private void CalcularAction() {
        //Toast.makeText(this,"Formulario", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Imc.this, Resultado.class);
        startActivity(intent);
    }
}