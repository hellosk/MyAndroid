package com.hisunke.a01activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private Button btnCloseAty1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btnCloseAty1 = (Button)findViewById(R.id.buttonCloseAty1);
        btnCloseAty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.putExtra("txt", "Hello, main activity!");

                setResult(0, i);

                finish();
            }
        });

        textView = (TextView)findViewById(R.id.newTextView);

        //get data from intent, then set.
        //textView.setText(getIntent().getStringExtra("txt"));

        //get bundle data from intent
        Bundle data = getIntent().getExtras();
        textView.setText(data.getString("txt"));
    }
}
