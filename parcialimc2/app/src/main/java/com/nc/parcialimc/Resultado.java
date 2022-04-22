package com.nc.parcialimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class Resultado extends AppCompatActivity implements View.OnClickListener{
    public TextView textViewNombre;
    public ImageView ImagenImc;
    public TextView textViewResultado;
    public Button btnInicioRe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        SharedPreferences spGet = getSharedPreferences("nombreUsuario", MODE_PRIVATE);
        String name = spGet.getString("Nombre", "NA");
        Toast.makeText(getApplicationContext(), "Hola Mundo " + name, Toast.LENGTH_LONG).show();
        setContentAttributes();
        setContentViewEvents();
        SharedPreferences sp = getSharedPreferences("nombreUsuario",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", "Natalia");
        editor.commit();
    }
    private void setContentViewEvents() {
        btnInicioRe.setOnClickListener(this);
    }

    private void setContentAttributes() {
        textViewNombre = findViewById(R.id.textViewNombre);
        ImagenImc = findViewById(R.id.ImagenImc);
        textViewResultado = findViewById(R.id.textViewResultado);
        btnInicioRe = findViewById(R.id.btnInicioRe);


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInicioRe:
                InicioAction();

        }

    }


    private void InicioAction() {
                Toast.makeText(this, "Formulario", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Resultado.this, MainActivity.class);
                startActivity(intent);
            }


        }




