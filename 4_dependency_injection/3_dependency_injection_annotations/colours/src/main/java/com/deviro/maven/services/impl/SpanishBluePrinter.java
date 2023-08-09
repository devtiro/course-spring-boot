package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "azul";
  }
}
