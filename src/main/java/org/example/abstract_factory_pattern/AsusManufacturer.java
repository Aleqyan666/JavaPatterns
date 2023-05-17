package org.example.abstract_factory_pattern;



public class AsusManufacturer  extends Company {
    @Override
    public Component createComponent(String type) {
        Component component =  null;
        if("GPU".equals(type)){
            component = new AsusGpu();
        }else {
            component = new AsusMonitor();
        }
        return component;
    }
}
