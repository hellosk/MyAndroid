package com.example.hello.a03boardcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver MyBC;
    private Button btnSendBC, btnRegist, btnUnregist;

    private final MyReceiver myReceiver = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendBC = (Button)findViewById(R.id.btnSend);
        btnSendBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, MyReceiver.class);
                //Intent i = new Intent(MyReceiver.ACTION);
                i.putExtra("txt", "Hello Receiver!");
                sendBroadcast(i);
            }
        });

        btnRegist = (Button)findViewById(R.id.btnRegist);
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerReceiver(myReceiver, new IntentFilter(MyReceiver.ACTION));
            }
        });

        btnUnregist = (Button)findViewById(R.id.btnUnregist);
        btnUnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unregisterReceiver(myReceiver);
            }
        });
    }
}
