package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "blue";
  }
}
