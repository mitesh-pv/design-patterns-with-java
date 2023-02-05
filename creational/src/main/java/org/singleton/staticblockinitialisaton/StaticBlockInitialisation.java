package org.singleton.staticblockinitialisaton;

public class StaticBlockInitialisation {
    private static StaticBlockInitialisation object;

    static {
        try {
            object = new StaticBlockInitialisation();
        } catch (Exception exp) {
            throw new RuntimeException("Exception while creating singleton design pattern");
        }
    }

    public static StaticBlockInitialisation getInstance() {
        return object;
    }
}
