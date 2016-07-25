package com.hisunke.a02service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {


        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");

        System.out.println("[sk]onBind");
        return MyBinder;
    }

    private final MyserviceBinder MyBinder = new MyserviceBinder();

    public class MyserviceBinder extends Binder {
        public MyService getService(){
            return MyService.this;
        }
    }

    private Timer timer = null;
    private TimerTask task = null;
    private int i = 0;

    public int getNum()
    {
        return i;
    }

    private void StartTimer(){
        if(null == timer){
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    i++;
                    System.out.println("i = " + i);
                }
            };
            timer.schedule(task, 1000, 1000);
        }
    }

    private void StopTimer(){
        if(null != timer)
        {
            timer.cancel();
            if(null != task){
                task.cancel();
            }
        }
    }

    @Override
    public void onCreate() {
        System.out.println("[sk]onCreate");
        StartTimer();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        System.out.println("[sk]onDestroy");
        StopTimer();
        super.onDestroy();
    }
}
