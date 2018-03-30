package com.example.user.sleepwell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SleepReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("SLEEP")){
            Toast.makeText(context, "收到了，一個小時後去睡覺", Toast.LENGTH_SHORT).show();
        }
        if (intent.getAction().equals("SCREEN_ON")){
            Toast.makeText(context, "screen on", Toast.LENGTH_SHORT).show();
        }


    }
}
