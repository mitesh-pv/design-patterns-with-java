package org.singleton.threadsafelazy;

public class ThreadSafeLazyInitialisation {

    private static ThreadSafeLazyInitialisation object;

    private ThreadSafeLazyInitialisation(){}

    public static synchronized ThreadSafeLazyInitialisation getInstance() {
        if (object == null) {
            object = new ThreadSafeLazyInitialisation();
        }
        return object;
    }
}
