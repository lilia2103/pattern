package org.example.abstract_factory;

public abstract class Company {
    public abstract Gpu createGpu();
    public Gpu assembleGpu(){
        Gpu gpu = createGpu();
        return gpu;
    }
}
