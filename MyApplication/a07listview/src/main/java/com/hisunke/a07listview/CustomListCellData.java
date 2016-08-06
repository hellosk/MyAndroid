package com.hisunke.a07listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CustomListCellData {

    public CustomListCellData(String name, String description, int imgID) {
        this.name = name;
        this.description = description;
        this.imgID = imgID;
    }

    public String name = "";
    public String description = "";
    public int imgID = 0;
}
