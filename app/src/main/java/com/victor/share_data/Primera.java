package com.victor.share_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Primera extends AppCompatActivity {
    Intent inLanzarSegunda;
    String data;
    EditText edtxtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
        edtxtData = (EditText)findViewById(R.id.edtxtData);
        //crear intento
        inLanzarSegunda = new Intent(this,Segunda.class);
    }
    public void enviarDatos (View v){
        data = edtxtData.getText().toString();
        //meter datos directo al intento
        inLanzarSegunda.putExtra("DATA_TEXT",data);

        startActivity(inLanzarSegunda);
    }
    public void enviarDatosBundle (View v){
        data = edtxtData.getText().toString();
        //Creacion de un bundle
        Bundle myBundle = new Bundle();
        //meter data en Bundle
        myBundle.putString("DATA_TEXT", data);
        //meter bundle en intento
        inLanzarSegunda.putExtras(myBundle);
        //lanzar intento
        startActivity(inLanzarSegunda);
    }
}
