package com.example.dailys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Tasks extends AppCompatActivity {
 
    private Button SETTINGPAGE, PROGRESS,TODAY;
    RecyclerView recyclerView;
    logoftasksAdapter tasksAdapter;

    List<logoftasks> logoftasksList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tasks );

        TODAY = (Button) findViewById( R.id.todayXML );
        SETTINGPAGE = (Button) findViewById( R.id.SettingsXML );
        PROGRESS = (Button) findViewById( R.id.progressXML );

        logoftasksList = new ArrayList<>(  );
        recyclerView = (RecyclerView) findViewById( R.id.Recyclerview_xml );
        recyclerView.setHasFixedSize( false );
                                        //play around to see vertical vs horizontal
        recyclerView.setLayoutManager(  new LinearLayoutManager( this) );
      tasksAdapter = new logoftasksAdapter(this, logoftasksList  );
      recyclerView.setAdapter( tasksAdapter );



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