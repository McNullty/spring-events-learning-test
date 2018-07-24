package com.mladen.cikara.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SecondCustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {

  @Override
  public void onApplicationEvent(CustomSpringEvent event) {
    System.out.println("Also received spring custom event - " + event.getMessage());
  }

}
