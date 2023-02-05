# Bill Pugh Singleton Class

- Static classes are only loaded by the class loader at the time of the first usage and not when its enclosing class gets loaded in JVM
- So `BillPughsSingletonClass` inside `SingletonHelper` class is not initialised until we call getInstance() method.