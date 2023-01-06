package com.example.daggerdidemo;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Provides
    abstract Engine provideEngine(PetrolEngine engine);
}
