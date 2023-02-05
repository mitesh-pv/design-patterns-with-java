# Lazy Initialisation

- Object is created at the time when client invokes getInstance() method.

> getInstance method is not thread safe method, multiple threads gets inside if block same time may get different instances.
