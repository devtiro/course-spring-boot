package com.deviro.maven.services;

/**
 * A counter takes an integer and returns an array of Strings of the numbers from 0 to the number
 * provided (inclusive).
 */
public interface Counter {

  String[] count(int countTo);
}
