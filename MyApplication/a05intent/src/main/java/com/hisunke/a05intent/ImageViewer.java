package com.hisunke.a05intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewer extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        iv = new ImageView(this);
        setContentView(iv);

        iv.setImageURI(getIntent().getData());
    }
}
