package com.hisunke.a08uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class UsingProgressBar extends AppCompatActivity {

    private ProgressBar progressBarHor;

    private Timer timer = null;
    private TimerTask task = null;
    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_progress_bar);

        progressBarHor = (ProgressBar)findViewById(R.id.progressBarHor);
        progressBarHor.setMax(1000);
        progressBarHor.setProgress(progress);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startTimer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTimer();
    }

    private  void startTimer(){
        if(timer == null){
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    progress++;

                    progressBarHor.setProgress(progress);
                }
            };
            timer.schedule(task, 100, 10);
        }
    }

    private void stopTimer(){
        if (timer!=null) {
            task.cancel();
            timer.cancel();

            task = null;
            timer = null;
        }
    }
}
