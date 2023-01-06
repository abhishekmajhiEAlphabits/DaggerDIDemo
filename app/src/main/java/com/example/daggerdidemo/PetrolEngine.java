package com.example.daggerdidemo;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.i("TAG", "Petrol Engine started....");
    }
}
