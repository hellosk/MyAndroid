package com.hisunke.a07listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter =  new ArrayAdapter<String>(this, R.layout.list_cell);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        for(int i =0; i<5; i++) {
            adapter.add("item" + i);
        }
        */

       // adapter =  new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
        adapter =  new ArrayAdapter<ListCellData>(this, R.layout.list_cell);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.add(new ListCellData("小明", "M", 24));
        adapter.add(new ListCellData("Lily", "F", 25));
        adapter.add(new ListCellData("Yao", "M", 26));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListCellData data = adapter.getItem(position);

                Toast.makeText(MainActivity.this, String.format("Name: %s, Sex: %s, Age: %d", data.getName(), data.getSex(), data.getAge()), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
