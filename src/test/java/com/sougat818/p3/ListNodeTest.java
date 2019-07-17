package com.sougat818.p3;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeTest {

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
}