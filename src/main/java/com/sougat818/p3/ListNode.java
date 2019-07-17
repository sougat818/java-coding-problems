package com.sougat818.p3;

public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    if (x > 9) {
      throw new IllegalArgumentException("Value should be a single digit x - " + x);
    }
    val = x;
  }

  ListNode(int[] x) {
    if (x.length == 0) {
      return;
    }
    if (x[0] > 9) {
      throw new IllegalArgumentException("Value should be a single digit x - " + x[0]);
    }
    val = x[0];
    if (x.length == 1) {
      return;
    }
    next = new ListNode(x[1]);
    ListNode temp = next;
    for (int i = 2; i < x.length; i++) {
      temp.next = new ListNode(x[i]);
      temp = temp.next;
    }
  }

  @Override
  public String toString() {
    return val + (next != null ? next.toString() : "");
  }

}
