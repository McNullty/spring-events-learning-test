package com.mladen.cikara.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

  private static final Logger LOGGER = LoggerFactory.getLogger(ContextRefreshedListener.class);

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    LOGGER.info("Handling context re-freshed event. ");
  }

}
