package com.hisunke.a05intent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button btnStartNewAty;
    private Button btnOpenImage;
    private Button btnDial;
    private Button btnBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartNewAty = (Button)findViewById(R.id.btnStartNewAty);
        btnStartNewAty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*start activiy with component*/
                //Intent i = new Intent();
				//i.setComponent(new ComponentName("com.hisunke.a05intent", "com.hisunke.a05intent.NewActivity"));
                //startActivity(i);

                /*start activiy with action*/
                Intent i = new Intent("com.hisunke.a05intent.intent.action.NewActivity");
                startActivity(i);
            }
        });

        btnOpenImage = (Button)findViewById(R.id.btnOpenImg);
        btnOpenImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                File f = new File("/mnt/sdcard/test.png");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setDataAndType(Uri.fromFile(f), "image/*");
                startActivity(i);
            }
        });

        btnDial = (Button)findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:10086"));
                startActivity(i);
            }
        });

        btnBrowser = (Button)findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                startActivity(i);
            }
        });

    }
}
