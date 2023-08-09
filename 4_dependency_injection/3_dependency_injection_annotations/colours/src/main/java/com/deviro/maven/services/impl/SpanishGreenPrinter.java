package com.deviro.maven.services.impl;

import com.deviro.maven.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "verde";
  }
}
