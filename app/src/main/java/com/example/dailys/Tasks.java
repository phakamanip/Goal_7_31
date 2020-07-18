package com.example.dailys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tasks extends AppCompatActivity {
 
    private Button SETTINGPAGE, PROGRESS,TODAY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tasks );

        TODAY = (Button) findViewById( R.id.todayXML );
        SETTINGPAGE = (Button) findViewById( R.id.SettingsXML );
        PROGRESS = (Button) findViewById( R.id.progressXML );
        

        TODAY.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToday = new Intent( Tasks.this, Today.class );
                startActivity( goToday );
            }
        } );

        SETTINGPAGE.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goSettings = new Intent(Tasks.this, Settings.class);
                startActivity( goSettings );
            }  
        } );

        PROGRESS.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goProgress = new Intent( Tasks.this, ProgressReport.class );
                startActivity( goProgress );
            }
        } );
        
    }
}