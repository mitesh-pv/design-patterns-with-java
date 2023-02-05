package org.singleton;

import org.singleton.eagerinitialisation.EagerInitialisation;

public class Driver {
    public static void main(String[] args) {
        EagerInitialisation eagerInitialisation = EagerInitialisation.getInstance();
        System.out.println(eagerInitialisation);
    }
}
