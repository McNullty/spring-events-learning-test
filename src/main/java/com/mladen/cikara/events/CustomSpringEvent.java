package com.mladen.cikara.events;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent extends ApplicationEvent {

  private static final long serialVersionUID = 2429067966704420926L;

  private final String message;

  public CustomSpringEvent(final Object source, final String message) {
    super(source);

    this.message = message;
  }

  public String getMessage() {
    return message;
  }

}
