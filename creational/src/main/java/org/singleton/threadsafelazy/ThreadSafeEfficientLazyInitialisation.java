package org.singleton.threadsafelazy;

public class ThreadSafeEfficientLazyInitialisation {
    private static ThreadSafeEfficientLazyInitialisation object;

    private ThreadSafeEfficientLazyInitialisation(){}

    public static ThreadSafeEfficientLazyInitialisation getInstance() {
        if (object == null) {
            synchronized (ThreadSafeEfficientLazyInitialisation.class) {
                if (object == null) {
                    object = new ThreadSafeEfficientLazyInitialisation();
                }
            }
        }
        return object;
    }
}
