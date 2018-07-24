package com.mladen.cikara.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {
  private static final Logger LOGGER = LoggerFactory.getLogger(CustomSpringEventPublisher.class);

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public void doStuffAndPublishAnEvent(final String message) {
    LOGGER.info("Publishing custom event.");
    final CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
    applicationEventPublisher.publishEvent(customSpringEvent);
  }
}
