package org.singleton.lazyinitialisation;

public class LazyInitialisation {
    private static LazyInitialisation object;

    private LazyInitialisation(){}

    public static LazyInitialisation getInstance() {
        if (object == null) {
            object = new LazyInitialisation();
        }

        return object;
    }
}
