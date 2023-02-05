package org.singleton.billpughssingletonclass;

public class BillPughsSingletonClass {
    private BillPughsSingletonClass(){}

    private static class SingletonHelper {
        private static final BillPughsSingletonClass OBJECT = new BillPughsSingletonClass();
    }

    public static BillPughsSingletonClass getInstance() {
        return SingletonHelper.OBJECT;
    }
}
