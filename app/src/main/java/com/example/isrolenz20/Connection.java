package com.example.isrolenz20;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class Connection {

    Context context;

    public Connection(Context context) {
        this.context = context;
    }

    public boolean isConnected(){
        String name;
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if(cm!= null){
            NetworkInfo info = cm.getActiveNetworkInfo();
            if(info!=null){
                if(info.getState() == NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;

    }

}
