package com.sougat818.p3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem3Test {

  private Problem3 problem3;

  @Before
  public void setUp() {
    problem3 = new Problem3();
  }

  @Test
  public void testSolution1() {

    ListNode listNode1 = new ListNode(new int[]{2, 4, 3});
    ListNode listNode2 = new ListNode(new int[]{5, 6, 4});

    Assert.assertEquals("708", problem3.addTwoNumbers(listNode1, listNode2).toString());
  }

  @Test
  public void testSolution2() {

    ListNode listNode1 = new ListNode(new int[]{});
    ListNode listNode2 = new ListNode(new int[]{});

    Assert.assertEquals("0", problem3.addTwoNumbers(listNode1, listNode2).toString());
  }

  @Test
  public void testSolution3() {

    ListNode listNode = new ListNode(
        new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
            9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
            9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
            9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9});

    Assert.assertEquals(
        "8999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999991",
        problem3.addTwoNumbers(listNode, listNode).toString());
  }

  @Test
  public void testSolution4() {

    ListNode listNode1 = new ListNode(new int[]{1, 2, 3, 4, 5});
    ListNode listNode2 = new ListNode(new int[]{9, 8, 1, 6});

    Assert.assertEquals("01506", problem3.addTwoNumbers(listNode1, listNode2).toString());
    Assert.assertEquals("01506", problem3.addTwoNumbers(listNode2, listNode1).toString());
  }



}