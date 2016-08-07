package com.hisunke.a08uicontrols;

import android.content.Context;
import android.content.Intent;

public class MainListCellData {

    private String controlName="";
    private Context context=null;
    private Intent relatedIntent =null;

    public MainListCellData(String controlName, Context context, Intent relatedIntent) {
        this.controlName = controlName;
        this.context = context;
        this.relatedIntent = relatedIntent;
    }

    public String getControlName() {
        return controlName;
    }

    public Context getContext() {
        return context;
    }

    public Intent getRelatedIntent() {
        return relatedIntent;
    }

    public String toString(){
        return controlName;
    }

    public void startActivity(){
        getContext().startActivity(getRelatedIntent());
    }
}
