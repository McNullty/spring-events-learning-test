package com.mladen.cikara.events;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CustomSpringEventPublisherTest {

  @Autowired
  private CustomSpringEventPublisher publisher;

  @Test
  void test() throws InterruptedException {
    publisher.doStuffAndPublishAnEvent("Hello world");

    Thread.sleep(10000l);

    fail("Not yet implemented");
  }

}
