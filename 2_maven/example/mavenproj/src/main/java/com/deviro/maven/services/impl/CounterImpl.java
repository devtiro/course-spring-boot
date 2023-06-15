package com.deviro.maven.services.impl;

import com.deviro.maven.services.Counter;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class CounterImpl implements Counter {

  @Override
  public String[] count(int countTo) {
    return IntStream.range(1, countTo + 1)
        .mapToObj(i -> Integer.valueOf(i).toString())
        .toArray(String[]::new);
  }
}
