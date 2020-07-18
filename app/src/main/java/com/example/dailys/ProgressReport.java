package com.example.dailys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressReport extends AppCompatActivity {

    private Button HOMEPAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_progress_report );


        HOMEPAGE = (Button) findViewById( R.id.homeXML );


        HOMEPAGE.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHome = new Intent ( ProgressReport.this, Tasks.class );
                startActivity( goHome );
            }
        } );
    }
}