package com.example.saideep.lockscreen2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Toast;

public class AutoStart extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Toast.makeText(context, "caught broadcast", Toast.LENGTH_SHORT).show();
            Intent localIntent = new Intent(context, FullscreenActivity.class);
            localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        localIntent.addFlags(WindowManager.LayoutParams.TYPE_SYSTEM_ERROR);
            context.startActivity(localIntent);


        }
    }
}
