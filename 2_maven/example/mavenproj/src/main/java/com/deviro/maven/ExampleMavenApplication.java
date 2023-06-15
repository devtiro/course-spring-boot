package com.deviro.maven;

import com.deviro.maven.services.Counter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ExampleMavenApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ExampleMavenApplication.class, args);
  }

  private final Counter counter;

  public ExampleMavenApplication(final Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run(final String... args) {
    log.info(String.join(",", counter.count(100)));
  }
}
