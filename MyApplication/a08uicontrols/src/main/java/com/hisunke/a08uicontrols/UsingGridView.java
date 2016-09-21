package com.hisunke.a08uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class UsingGridView extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_grid_view);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(3);

        for(int i=0; i<60; i++)
        {
            adapter.add("hello " + i);
        }
    }
}
