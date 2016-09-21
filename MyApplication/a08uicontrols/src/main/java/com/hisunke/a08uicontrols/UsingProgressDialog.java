package com.hisunke.a08uicontrols;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UsingProgressDialog extends AppCompatActivity {

    private Button btnShow;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_progress_dialog);

        btnShow = (Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressDialog = ProgressDialog.show(UsingProgressDialog.this, "loading", "please waiting");
                new Thread(){
                    public void run(){
                        try {
                            Thread.sleep(3000);
                            progressDialog.dismiss();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }.start();  //remember to run thread.
            }
        });
    }
}
