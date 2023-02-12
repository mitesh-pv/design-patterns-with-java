package org.abstractfactory;

import org.abstractfactory.abstractfactory.ComputerFactory;
import org.abstractfactory.abstractfactory.LaptopAbstractFactory;
import org.abstractfactory.abstractfactory.PCAbstractFactory;
import org.abstractfactory.factory.Laptop;
import org.abstractfactory.factory.PC;

public class Driver {
    public static void main(String[] args) {
        PCAbstractFactory pcFactory = new PCAbstractFactory("2.5GH", "2TB", "4GB");
        PC pc = (PC) ComputerFactory.getComputer(pcFactory);
        System.out.println(pc);

        LaptopAbstractFactory laptopFactory = new LaptopAbstractFactory("2GH", "1TB", "2GB");
        Laptop laptop = (Laptop) ComputerFactory.getComputer(laptopFactory);
        System.out.println(laptop);
    }
}
