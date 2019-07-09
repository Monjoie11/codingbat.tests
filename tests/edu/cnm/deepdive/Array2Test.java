package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Array2Test {

  @Test

  void either24() {
  }
  assertAll(
      // cut and paste all assertions
      () -> assertTrue(array.either24(one24)),
      () -> assertTrue(array.either24(two24)),
      ...
      ...
  );




  @ParameterizedTest
  @MethodSource("either24Source")
  staic Object[][] input = {
      {new int []{1, 2, 2}, true},
      {new int[]{4,4,1}, true},
      {new int[]{4,4,1,2,2}, true},
      ...
  ...
  };

  private static Object[][] either24Source(){
    return input;
  }

  void either24(int[] nums, boolean expected) {
    boolean actual = array.either24(nums);
    if(expected){
      assertTrue(actual);
    }else{
      assertFalse(actual);
    }
  }
  assertAll(
      // cut and paste all assertions
      () -> assertTrue(array.either24(one24)),
      () -> assertTrue(array.either24(two24)),
      ...
      ...
      );


  @Test
  void pre4() {
  }
}