package org.singleton.eagerinitialisation;

public class EagerInitialisation {
    private static final EagerInitialisation object = new EagerInitialisation();

    private EagerInitialisation() {
    }

    public static EagerInitialisation getInstance() {
        return object;
    }
}
