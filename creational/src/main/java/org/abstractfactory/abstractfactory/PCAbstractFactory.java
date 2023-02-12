package org.abstractfactory.abstractfactory;

import org.abstractfactory.factory.Computer;
import org.abstractfactory.factory.PC;

public class PCAbstractFactory implements ComputerAbstractFactory {
    private String cpu;
    private String hdd;
    private String ram;

    public PCAbstractFactory(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(cpu, hdd, ram);
    }
}
