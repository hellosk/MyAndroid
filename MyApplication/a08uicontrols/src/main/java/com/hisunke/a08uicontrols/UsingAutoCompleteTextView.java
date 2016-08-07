package com.hisunke.a08uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class UsingAutoCompleteTextView extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private ArrayAdapter<String> adapter;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    private ArrayAdapter<String> multiAdapter;
    private String[] strs = new String[]{
            "hello",
            "hello android",
            "hello java",
            "hello textview",
            "hello button",
            "hello adapter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_auto_complete_text_view);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs);
        multiAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs);

        autoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(multiAdapter);
    }
}
