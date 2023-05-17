package org.example.abstract_factory.abs2;

public class MsiManufacturer extends Company {

    @Override
    public Component createComponent(String type) {
        Component component = null;
        if("GPU".equals(type)){
            component = new MsiGpu();
        }else {
            component = new MsiMonitor();
        }
        return component;
    }
}
