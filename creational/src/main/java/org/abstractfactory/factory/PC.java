package org.abstractfactory.factory;

public class PC extends Computer {
    private String cpu;
    private String hdd;
    private String ram;

    public PC(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getRAM() {
        return ram;
    }
}
