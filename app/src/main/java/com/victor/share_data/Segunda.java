package com.victor.share_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {
    Intent inGetData;
    TextView txtData;
    String recivedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        inGetData = getIntent();
        txtData = (TextView)findViewById(R.id.txtData);

       // /*
        Bundle myBundle = inGetData.getExtras();
        recivedData = myBundle.getString("DATA_TEXT");
        txtData.setText(recivedData);
//*/

        /*

        recivedData = inGetData.getStringExtra("DATA_TEXT");
        txtData.setText(recivedData);
       */
    }
    public void cerrarActividad(View v){
        finish();
    }
}
