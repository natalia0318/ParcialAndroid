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
    public TextView kelsi;
    public Button btnCalTemp;
    public TextView CalC;
    public TextView CalcF;
    public Button btnInicioTem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
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
        btnInicioTem.setOnClickListener(this);
    }

    private void setContentAttributes() {
        textViewNTemp = findViewById(R.id.textViewNTemp);
        radioButtonC = findViewById(R.id.radioButtonC);
        radioButtonF = findViewById(R.id.radioButtonF);
        radioButtonK = findViewById(R.id.radioButtonK);
        Cels = findViewById(R.id.Cels);
        faren = findViewById(R.id.faren);
        kelsi = findViewById(R.id.kelsi);
        btnCalTemp = findViewById(R.id.btnCalTemp);
        CalC = findViewById(R.id.CalC);
        CalcF= findViewById(R.id.CalcF);
        btnInicioTem= findViewById(R.id.btnInicioTem);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnInicioTem:
                InicioTemAction();

        }
}

    private void InicioTemAction() {
        Toast.makeText(this,"Formulario", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Temperatura.this,MainActivity.class);
        startActivity(intent);
    }
}