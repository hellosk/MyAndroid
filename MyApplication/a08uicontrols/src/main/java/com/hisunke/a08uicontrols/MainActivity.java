package com.hisunke.a08uicontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<MainListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        adapter =  new ArrayAdapter<MainListCellData>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        adapter.add(new MainListCellData("RadioGroup", this, new Intent(this, UsingRadioGroup.class)));
        adapter.add(new MainListCellData("CheckBox", this, new Intent(this, UsingCheckBox.class)));
        adapter.add(new MainListCellData("DatePicker", this, new Intent(this, UsingDatePicker.class)));
        adapter.add(new MainListCellData("TimePicker", this, new Intent(this, UsingTimePicker.class)));
        adapter.add(new MainListCellData("Spinner", this, new Intent(this, UsingSpinner.class)));
        adapter.add(new MainListCellData("ProgressBar", this, new Intent(this, UsingProgressBar.class)));
        adapter.add(new MainListCellData("AutoCompleteTextView", this, new Intent(this, UsingAutoCompleteTextView.class)));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainListCellData data = adapter.getItem(position);
                data.startActivity();
            }
        });
    }
}
