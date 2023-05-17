package org.example.abstract_factory;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
