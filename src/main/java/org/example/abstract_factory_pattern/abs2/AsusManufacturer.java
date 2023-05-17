package org.example.abstract_factory_pattern.abs2;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
