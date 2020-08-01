package com.example.dailys;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
For RecyclerView I need 2 things:
           1.RecyclerView Adapter
           2.RecyclerView ViewHolder
 */
public class logoftasksAdapter extends RecyclerView.Adapter<logoftasksAdapter.tasksViewHolder> {

    private Context mCtx;
    private List <logoftasks> logoftasksList;

    public logoftasksAdapter(Context mCtx, List<logoftasks> logoftasksList){
        this.mCtx = mCtx;
        this.logoftasksList = logoftasksList;
    }


    @NonNull
    @Override
    public tasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from( mCtx );
        View view = layoutInflater.inflate(R.layout.list_layout, null  );
        return new tasksViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull tasksViewHolder holder, int position) {

        logoftasks logoftasks = logoftasksList.get( position );
        holder.taskView.setText( logoftasks.getTheTask());

        holder.doneButton.setImageDrawable( mCtx.getResources().getDrawable( logoftasks.getDoneImage() ) );
        holder.editButton.setImageDrawable( mCtx.getResources().getDrawable( logoftasks.getEditImage() ) );
    }

    @Override
    public int getItemCount() {
        return logoftasksList.size();
    }

    class tasksViewHolder extends RecyclerView.ViewHolder{

        ImageButton doneButton, editButton;
        TextView taskView;
        public tasksViewHolder(@NonNull View itemView) {
            super( itemView );
          doneButton = itemView.findViewById( R.id.doneBtn_xml );
          editButton = itemView.findViewById( R.id.editBtn_xml );
          taskView = itemView.findViewById( R.id.tastTv_xml );

        }
    }
}
