package com.example.daggerdidemo;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine() {
    }

    public void start() {
        Log.i("TAG", "Diesel engine started...");
    }
}
