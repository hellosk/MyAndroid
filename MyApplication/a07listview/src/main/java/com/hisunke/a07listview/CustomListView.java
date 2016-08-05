package com.hisunke.a07listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomListView extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
    }

    private BaseAdapter adapter = new BaseAdapter() {

        private String[] data = new String[]{"hello1", "hello2", "hello3", "hello4", "hello5"};

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public String getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            TextView textView = new TextView(CustomListView.this);
            textView.setText(data[position]);
            textView.setTextSize(30);

            textView.setPadding(20, 10, 0, 10);
            return textView;
        }
    };
}
