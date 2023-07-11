package com.example.daggerdidemo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine provideEngine(PetrolEngine engine);
}
