package org.abstractfactory.abstractfactory;

import org.abstractfactory.factory.Computer;
import org.abstractfactory.factory.Laptop;

public class LaptopAbstractFactory implements ComputerAbstractFactory {
    private String cpu;
    private String hdd;
    private String ram;

    public LaptopAbstractFactory(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(cpu, hdd, ram);
    }
}
