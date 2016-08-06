package com.hisunke.a07listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView listView = (ListView) findViewById(R.id.listView);
        //listView.setAdapter(basicAdapter);
        listView.setAdapter(new CustomListViewAdapter(this));
    }
//
//    private BaseAdapter basicAdapter = new BaseAdapter() {
//
//        private String[] data = new String[]{"hello1", "hello2", "hello3", "hello4", "hello5",
//                "hello6", "hello7", "hello8", "hello9", "hello10",
//                "hello11", "hello12", "hello13", "hello14", "hello15"};
//
//        @Override
//        public int getCount() {
//            return data.length;
//        }
//
//        @Override
//        public String getItem(int position) {
//            return data[position];
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            TextView textView;
//            if(convertView != null) {
//                textView = (TextView) convertView;
//            }
//            else {
//                textView = new TextView(CustomListView.this);
//                System.out.println("-->>>>>>>>>>>>>>>>>>create view");
//            }
//
//            textView.setText(data[position]);
//            textView.setTextSize(30);
//
//            textView.setPadding(20, 20, 0, 10);
//            return textView;
//        }
//    };
}
