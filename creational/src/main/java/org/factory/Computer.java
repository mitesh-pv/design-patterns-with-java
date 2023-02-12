package org.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return getCPU() + " " + getRam() + " " + getHDD();
    }
}