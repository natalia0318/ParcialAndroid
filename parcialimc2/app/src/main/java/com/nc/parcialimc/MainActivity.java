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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText nombre;
    public Button btnImc;
    public Button btnTem;
    public Button btnCalc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentAttributes();
        setContentViewEvents();
        SharedPreferences sp = getSharedPreferences("nombreUsuario",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", "Natalia");
        editor.commit();

    }
    private void setContentViewEvents() {
        btnImc.setOnClickListener(this);


    }
    private void setContentAttributes(){

        nombre = findViewById(R.id.nombre);
        btnImc = findViewById(R.id.btnImc);
        btnTem = findViewById(R.id.btnTem);
        btnCalc = findViewById(R.id.btnCalc);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnImc:
                ImcAction();


        }
    }
    private void ImcAction() {
        Toast.makeText(this,"Formulario", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Imc.class);
        startActivity(intent);

    }
}


