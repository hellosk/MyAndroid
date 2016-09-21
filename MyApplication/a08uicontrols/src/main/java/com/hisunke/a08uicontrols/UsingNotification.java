package com.hisunke.a08uicontrols;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UsingNotification extends AppCompatActivity {

    private Button btnShow;
    private NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_notification);

        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        btnShow = (Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification.Builder builder = new Notification.Builder(UsingNotification.this);

                builder.setSmallIcon(R.drawable.ic_launcher);
                builder.setTicker("ticker");
                builder.setContentTitle("Title");
                builder.setContentText("Text");
                builder.setAutoCancel(true);

                notificationManager.notify(R.layout.activity_using_notification, builder.build());
            }
        });
    }
}
