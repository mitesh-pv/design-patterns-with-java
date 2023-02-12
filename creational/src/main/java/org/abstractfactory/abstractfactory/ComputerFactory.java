package org.abstractfactory.abstractfactory;

import org.abstractfactory.factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
