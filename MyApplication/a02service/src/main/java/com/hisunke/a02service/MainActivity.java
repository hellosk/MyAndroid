package com.hisunke.a02service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ServiceConnection {

    private Button btnStart, btnStop, btnBind, btnUnbind, btnGetValue;
    private Intent serviceIntent;
    private MyService myService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStartService);
        btnStop = (Button) findViewById(R.id.btnStopService);
        btnBind = (Button) findViewById(R.id.btnBindService);
        btnUnbind = (Button) findViewById(R.id.btnUnbindService);
        btnGetValue = (Button) findViewById(R.id.btnGetValue);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnBind.setOnClickListener(this);
        btnUnbind.setOnClickListener(this);
        btnGetValue.setOnClickListener(this);

        serviceIntent = new Intent(this, MyService.class);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnStartService:
                //start service
                startService(serviceIntent);
                break;

            case R.id.btnStopService:
                //stop service
                stopService(serviceIntent);
                break;

            case R.id.btnBindService:
                //bind service
                bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);
                break;

            case R.id.btnUnbindService:
                //unbind service
                unbindService(this);
                break;

            case R.id.btnGetValue:
                //unbind service
                if(myService!= null) {
                    System.out.println("[sk]Get value from service: " + myService.getNum());
                }
                break;

        }
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        System.out.println("[sk]onServiceConnected");
        myService = ((MyService.MyserviceBinder)service).getService();
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
}
