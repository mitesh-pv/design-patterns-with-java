# Thread Safe Lazy Initialisation

1. [Thread Safe Lazy Initialisation](./ThreadSafeLazyInitialisation.java)
- Method is synchronized
- Object monitor is acquired by the thread each time getInstance() method is invoked
- The object only needs safety from first few threads in the beginning
- But here all the threads have to acquire the lock before invoking getInstance() method which is a performance overhead.

2. [Thead Safe Efficient Initialisation](./ThreadSafeEfficientLazyInitialisation.java)
- Double check locking method used to avoid object monitor overhead