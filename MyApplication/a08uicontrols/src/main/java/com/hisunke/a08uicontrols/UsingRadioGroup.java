package com.hisunke.a08uicontrols;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class UsingRadioGroup extends AppCompatActivity {

    private RadioButton rbEasy, rbDiffcult, rbUnknown;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_radio_group);

        rbEasy = (RadioButton)findViewById(R.id.rbEasy);
        rbDiffcult = (RadioButton)findViewById(R.id.rbDifficult);
        rbUnknown = (RadioButton)findViewById(R.id.rbUnknown);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strMessage;

                if(rbEasy.isChecked()){
                    strMessage = "Android is easy";

                }else if(rbDiffcult.isChecked()){
                    strMessage = "Android is different";

                }else if(rbUnknown.isChecked()){
                    strMessage = "Don't know";
                }
                else{
                    strMessage = "Unknown selection";
                }

                //Show Dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(UsingRadioGroup.this);
                builder.setTitle("Message");
                builder.setMessage(strMessage);
                builder.setPositiveButton("Close", null);
                builder.show();
            }
        });
    }
}
