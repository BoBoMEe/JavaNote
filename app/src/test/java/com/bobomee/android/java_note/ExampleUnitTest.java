package com.bobomee.android.java_note;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
  @Test public void addition_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }

  public static void main(String[] args) {
    Plate<? extends Fruit> plate = new Plate<>(new Apple());


    Plate<? super Fruit> plate1 = new Plate<>(new Fruit());
    plate1.set(new Fruit());
  }
}