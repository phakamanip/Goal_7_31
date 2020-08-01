package com.example.dailys;

import android.widget.TextView;

public class logoftasks {

    private String theTask =" hey buddy";

    private int doneImage, editImage;

    public logoftasks(String tsk, int dnImg, int edtImg){

        this.theTask = tsk;
        this.doneImage = dnImg;
        this.editImage = edtImg;
    }

    public String getTheTask() {
        return theTask;
    }

    public int getDoneImage() {
        return doneImage;
    }

    public int getEditImage() {
        return editImage;
    }


}
