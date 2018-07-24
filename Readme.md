# Spring Events Learning Test

## Notes
1. Custom events are by default synchronous
1. Number of threads is checked with `jvisualvm`

## Synchronous Event handling

This is default cinfiguration. If configuration is not changed Events will be 
handeled synchroniously. 

This way no new Threads will be created.

## Asynchronous Event handling

If this is configured new thread will be created for every class that implements
 interface ApplicationListener.