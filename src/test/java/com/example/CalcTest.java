package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; // JUnit4

public class CalcTest {

  @Test
  public void add() {
    assertEquals(3, 1 + 2);
  }
}