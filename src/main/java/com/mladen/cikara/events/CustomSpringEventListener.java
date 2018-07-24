package com.mladen.cikara.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
  private static final Logger LOGGER = LoggerFactory.getLogger(CustomSpringEventListener.class);

  @Override
  public void onApplicationEvent(CustomSpringEvent event) {
    LOGGER.info("Started receiving event");

    try {
      Thread.sleep(2000l);
    } catch (final InterruptedException e) {
      e.printStackTrace();
    }

    LOGGER.info("Received spring custom event - {}", event.getMessage());
  }

}
