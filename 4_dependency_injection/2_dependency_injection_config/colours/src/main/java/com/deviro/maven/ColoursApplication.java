package com.deviro.maven;

import com.deviro.maven.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

  private ColourPrinter colourPrinter;

  public ColoursApplication(ColourPrinter colourPrinter) {
    this.colourPrinter = colourPrinter;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoursApplication.class, args);
  }

  @Override
  public void run(final String... args) {
    log.info(colourPrinter.print());
  }
}
