package com.example;

import org.junit.Test;            // JUnit4
import static org.junit.Assert.*; // JUnit4

public class CalcTest {

  @Test
  public void add() {
    assertEquals(3, 1 + 2);
  }
}