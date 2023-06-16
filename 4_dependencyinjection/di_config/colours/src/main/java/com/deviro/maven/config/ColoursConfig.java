package com.deviro.maven.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColoursConfig {

  @Bean
  public RedPrinter redPrinter() {
    //        return new SpanishRedPrinter();
    return new EnglishRedPrinter();
  }

  @Bean
  public BluePrinter bluePrinter() {
    //        return new SpanishBluePrinter();
    return new EnglishBluePrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    //        return new SpanishGreenPrinter();
    return new EnglishGreenPrinter();
  }
}
