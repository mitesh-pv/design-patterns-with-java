# Bill Pugh Singleton Class

- Static classes are only loaded by the class loader at the time of the first usage and not when its enclosing class gets loaded in JVM
- So `BillPughsSingletonClass` inside `SingletonHelper` class is not initialised until we call getInstance() method.
- BillPugh's Singleton method will fail if we want to serialise and deserialise that singleton class.
  -  Everytime an object is deserialised, a new object will be created.
  -  To safeguard this process we want to override the `readResolve()` method to make sure same instance is returned whenever the obejct is deserialised.


```java
import java.io.Serializable;

public class BillPughSingleton implements Serializable {
    // Private constructor to prevent direct instantiation from other classes
    private BillPughSingleton() {}

    // Nested static class to handle instance creation
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to access the singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Implement readResolve to control deserialization
    protected Object readResolve() {
        // Return the existing instance to maintain singleton behavior
        return getInstance();
    }
}
```
