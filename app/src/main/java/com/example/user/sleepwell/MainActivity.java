package com.example.user.sleepwell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fn_sleep(View v){
        Log.i("message","in");
        Intent intent = new Intent();
        intent.setAction("SLEEP");
        sendBroadcast(intent);
    }

}
