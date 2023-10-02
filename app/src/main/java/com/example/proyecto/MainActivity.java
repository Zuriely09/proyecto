package com.example.proyecto;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
    }
    public void datos(View v){
        Intent intento1=new Intent(this, pantalla2.class);
        startActivityForResult(intento1,100);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==100)
        {
            if (resultCode== Activity.RESULT_OK){
                Bundle datos=data.getExtras();
                tv1.setText(datos.getString("nombre"));
            }
            if (resultCode== Activity.RESULT_OK){
                Bundle datos=data.getExtras();
                tv2.setText(datos.getString("edad"));
            }
            if (resultCode== Activity.RESULT_OK){
                Bundle datos=data.getExtras();
                tv3.setText(datos.getString("email"));
            }
           if(resultCode==Activity.RESULT_CANCELED){
               Toast.makeText(this,"Cancelado",Toast.LENGTH_SHORT).show();
           }
        }
    }
}