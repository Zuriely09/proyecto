package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pantalla2 extends AppCompatActivity {

    EditText lb1,lb2,lb3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        lb1=findViewById(R.id.lb1);
        lb2=findViewById(R.id.lb2);
        lb3=findViewById(R.id.lb3);
    }
    public void autorizado(View v){
        Intent intento1=new Intent();
        intento1.putExtra("nombre",lb1.getText().toString());
        intento1.putExtra("edad",lb2.getText().toString());
        intento1.putExtra("email",lb3.getText().toString());
        setResult(Activity.RESULT_OK,intento1);
        finish();




    }
    public void cancelar(View v){
        Intent intento1=new Intent();
        setResult(Activity.RESULT_CANCELED);
        finish();
    }

}