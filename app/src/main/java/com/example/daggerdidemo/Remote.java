package com.example.daggerdidemo;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.i("TAG","remote connected");
    }
}
