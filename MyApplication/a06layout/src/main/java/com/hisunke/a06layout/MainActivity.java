package com.hisunke.a06layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout)findViewById(R.id.main_layout);

        for(int i=0; i<5; i++)
        {
            btn = new Button(this);
            btn.setText("Remove me" + i);

            //set layout param
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 200*i, 0, 0);

            //add button
            layout.addView(btn, layoutParams);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //remove button
                    layout.removeView(v);
                }
            });
        }
    }
}
