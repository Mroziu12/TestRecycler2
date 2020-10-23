package com.example.testrecycler;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;

public class WiFiCheckDialog {
    String TAG="Mroziu";
    private Activity activity;
    private AlertDialog alertDialog;

    WiFiCheckDialog(Activity myActivity){
        activity=myActivity;
    }

    void startWiFiCheckDialog(){
        Log.d(TAG, "startWiFiCheckDialog: zaczynam dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.proces_dialog_esp_respone,null));
        builder.setCancelable(false);

        alertDialog = builder.create();
        alertDialog.show();
        Log.d(TAG, "startWiFiCheckDialog: nic nie jest zepsute w starcie");
    }

    void dismissWiFiCheckDialog(){
        Log.d(TAG, "dismissWiFiCheckDialog: koncze dialog");
        alertDialog.dismiss();
    }
}
