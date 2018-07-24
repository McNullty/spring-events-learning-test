package com.mladen.cikara.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SecondCustomSpringEventListener
    implements ApplicationListener<CustomSpringEvent>, Ordered {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(SecondCustomSpringEventListener.class);

  @Override
  public int getOrder() {
    return Ordered.HIGHEST_PRECEDENCE;
  }

  @Override
  public void onApplicationEvent(CustomSpringEvent event) {
    LOGGER.info("Started receiving event");

    // throw new RuntimeException();

    LOGGER.info("Also received spring custom event - {}", event.getMessage());
  }

}
