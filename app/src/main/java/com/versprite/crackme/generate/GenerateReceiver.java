package com.versprite.crackme.generate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class GenerateReceiver extends BroadcastReceiver {
    public GenerateReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle extras = intent.getExtras();
        if(extras != null){
            String key = extras.getString("key");
            Log.d("GenerateReceiver", "Key Received: " + key);
            Generate g = new Generate();
            if(g.c(key).equals(true)){
                Toast.makeText(context.getApplicationContext(), "Success!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context.getApplicationContext(), "Try Again!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
