package com.hisunke.a08uicontrols;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class UsingCheckBox extends AppCompatActivity {

    private CheckBox cbRed, cbYellow, cbBlue;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_check_box);

        cbRed = (CheckBox)findViewById(R.id.cbRed);
        cbYellow = (CheckBox)findViewById(R.id.cbYellow);
        cbBlue = (CheckBox)findViewById(R.id.cbBlue);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strMessage = "I like below colors:\n";

                if(cbRed.isChecked()){
                    strMessage += "Red\n";

                }
                if(cbYellow.isChecked()){
                    strMessage += "Yellow\n";

                }
                if(cbBlue.isChecked()){
                    strMessage += "Blue\n";
                }

                //Show Dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(UsingCheckBox.this);
                builder.setTitle("Message");
                builder.setMessage(strMessage);
                builder.setPositiveButton("Close", null);
                builder.show();
            }
        });



    }
}
