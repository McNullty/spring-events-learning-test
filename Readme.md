# Spring Events Learning Test

## Notes
1. Custom events are by default synchronous
1. Number of threads is checked with `jvisualvm`
1. If exception is raised and not handeled in event handler all handlers after
that handler will not be executed.

## Synchronous Event handling

This is default cinfiguration. If configuration is not changed Events will be 
handeled synchroniously. 

This way no new Threads will be created.

## Asynchronous Event handling

If this is configured new thread will be created for every class that implements
 interface ApplicationListener.

## Notes about Spring implementation

Listener is invoked by SimpleApplicationEventMulticaster

List of listener is got by getApplicationListeners(ApplicationEvent, 
 ResolvableType) in SimpleApplicationEventMulticaster

Listeners are added to list with 
 AbstractApplicationEventMulticaster.addApplicationListenerBean(String)

Listeners are added by alphanumeric order by name. 