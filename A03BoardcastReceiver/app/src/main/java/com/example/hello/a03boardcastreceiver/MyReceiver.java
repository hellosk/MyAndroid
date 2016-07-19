package com.example.hello.a03boardcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    public static final String ACTION = "com.example.hello.action.MyBC";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        System.out.println("[sk]onReceive :" + intent.getStringExtra("txt"));
    }
}
