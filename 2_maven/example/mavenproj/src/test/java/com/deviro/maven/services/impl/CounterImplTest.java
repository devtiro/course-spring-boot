package com.deviro.maven.services.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterImplTest {

  private CounterImpl underTest;

  @BeforeEach
  public void beforeEach() {
    this.underTest = new CounterImpl();
  }

  @Test
  public void testReturnsEmptyArrayWhen0Provided() {
    final String[] expected = new String[] {};
    final String[] result = underTest.count(0);
    assertThat(expected).isEqualTo(result);
  }

  @Test
  public void testReturnsEmptyArrayWhenNegativeNumberProvided() {
    final String[] expected = new String[] {};
    final String[] result = underTest.count(-5);
    assertThat(expected).isEqualTo(result);
  }

  @Test
  public void testReturnsCorrectArrayWhenNumberProvided() {
    final String[] expected = new String[] {"1", "2", "3", "4", "5"};
    final String[] result = underTest.count(5);
    assertThat(expected).isEqualTo(result);
  }
}
