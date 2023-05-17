package org.example.abstract_factory_pattern.abs2;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
