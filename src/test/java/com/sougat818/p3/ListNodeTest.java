package com.sougat818.p3;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListNodeTest {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Test
  public void toString1() {
    ListNode listNode = new ListNode(1);
    Assert.assertEquals("1", listNode.toString());
  }

  @Test
  public void toString2() {
    ListNode listNode = new ListNode(new int[]{1});
    Assert.assertEquals("1", listNode.toString());
  }

  @Test
  public void toString3() {
    ListNode listNode = new ListNode(new int[]{1, 2});
    Assert.assertEquals("12", listNode.toString());
  }

  @Test
  public void toString4() {
    ListNode listNode = new ListNode(new int[]{1, 2, 3});
    Assert.assertEquals("123", listNode.toString());
  }

  @Test
  public void toString5() {
    expectedException.expectMessage("Value should be a single digit x - 10");
    expectedException.expect(IllegalArgumentException.class);
    new ListNode(new int[]{10});
  }

  @Test
  public void toString6() {
    expectedException.expectMessage("Value should be a single digit x - 10");
    expectedException.expect(IllegalArgumentException.class);
    new ListNode(10);
  }
}