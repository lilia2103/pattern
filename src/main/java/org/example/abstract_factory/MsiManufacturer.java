package org.example.abstract_factory;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
