package com.example.daggerdidemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Wheels provideWheels(){
        Log.i("TAG","Wheels module");
        return new Wheels();
    }


}
