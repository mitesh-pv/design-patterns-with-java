package org.abstractfactory.factory;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getHDD();
    public abstract String getRAM();

    @Override
    public String toString() {
        return getCPU() + " " + getHDD() + " " + getRAM();
    }
}
