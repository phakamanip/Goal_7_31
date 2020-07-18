package com.example.dailys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    private Button SAVE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_settings );


        SAVE = (Button) findViewById( R.id.saveXML );


        SAVE.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent save = new Intent( Settings.this, Tasks.class );

                startActivity( save );
            }
        } );
    }
}