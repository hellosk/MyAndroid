package com.hisunke.a07listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomListViewAdapter extends BaseAdapter {

    private Context context = null;

    public Context getContext() {
        return context;
    }

    public CustomListViewAdapter(Context context) {
        this.context = context;
    }

    private CustomListCellData[] data =  new CustomListCellData[]{
            new CustomListCellData("IMG1", "img1 description", R.drawable.abc),
            new CustomListCellData("IMG2", "img2 description", R.drawable.abc),
            new CustomListCellData("IMG3", "img3 description", R.drawable.abc),
            new CustomListCellData("IMG4", "img4 description", R.drawable.abc),
            new CustomListCellData("IMG5", "img5 description", R.drawable.abc),
            new CustomListCellData("IMG6", "img6 description", R.drawable.abc),
            new CustomListCellData("IMG7", "img7 description", R.drawable.abc),
            new CustomListCellData("IMG8", "img8 description", R.drawable.abc),
    };

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public CustomListCellData getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LinearLayout ll;

        if(convertView != null) {
            ll = (LinearLayout) convertView;
        }
        else {
            ll = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_list_cell, null);

            System.out.println("-->>>>>>>>>>>>>>>>>>create linearlayout");
        }

        CustomListCellData data = getItem(position);

        ImageView imgView = (ImageView)ll.findViewById(R.id.imageView);
        TextView textName = (TextView)ll.findViewById(R.id.textName);
        TextView textDescription = (TextView)ll.findViewById(R.id.textDescription);

        imgView.setImageResource(data.imgID);
        textName.setText(data.name);
        textDescription.setText(data.description);

        ll.setPadding(20, 20, 0, 10);

        return ll;
    }
}
