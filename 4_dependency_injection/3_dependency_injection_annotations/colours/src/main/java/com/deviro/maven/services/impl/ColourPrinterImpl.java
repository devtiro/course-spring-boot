package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  public ColourPrinterImpl(
      RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
