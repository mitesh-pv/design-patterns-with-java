package org.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu, String hdd) {
        if (type.equals("Laptop")) {
            return new Laptop(ram, hdd, cpu);
        } else if (type.equals("PC")) {
            return new PC(ram, hdd, cpu);
        }
        return null;
    }
}
