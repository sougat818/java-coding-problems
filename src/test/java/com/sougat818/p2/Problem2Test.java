package com.sougat818.p2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Problem2Test {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  private Problem2 problem2;

  @Before
  public void setUp() {
    problem2 = new Problem2();
  }

  @Test(timeout = 10)
  public void addsToKSolutionIsTrue() {
    assertTrue(problem2.addsToK(17, 10, 15, 3, 7));
  }

  @Test(timeout = 5)
  public void addsToKSolutionIsFalse() {
    assertFalse(problem2.addsToK(100, 10, 15, 3, 7));
  }

  @Test(timeout = 10)
  public void addsToKEdgeCases() {
    assertFalse(problem2.addsToK(1));
  }

  @Test
  public void addsToKListNullException() {
    expectedException.expect(NullPointerException.class);
    expectedException.expectMessage("list cannot be Null in Problem2:addsToK");
    problem2.addsToK(1, (int[]) null);

  }

  @Test(timeout = 10)
  public void twoSumSolution1() {
    assertArrayEquals(new int[]{0, 3}, problem2.twoSum(new int[]{10, 15, 3, 7}, 17));
  }

  @Test(timeout = 10)
  public void twoSumSolution2() {
    assertArrayEquals(new int[]{0, 1}, problem2.twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  @Test(timeout = 10)
  public void twoSumSolution3() {
    assertArrayEquals(new int[]{}, problem2.twoSum(new int[]{10, 15, 3, 7}, 100));
  }

  @Test(timeout = 10)
  public void twoSumSolution4() {
    assertArrayEquals(new int[]{}, problem2.twoSum(new int[]{}, 100));
  }

  @Test
  public void twoSumListNullException() {
    expectedException.expect(NullPointerException.class);
    expectedException.expectMessage("nums cannot be Null in Problem2:twoSum");
    problem2.twoSum(null, 1);

  }
}