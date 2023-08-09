package com.deviro.maven.services.impl;

import com.deviro.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
