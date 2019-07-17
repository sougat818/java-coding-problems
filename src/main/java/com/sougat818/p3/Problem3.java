package com.sougat818.p3;

class ListNode {

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

class Problem3 {

  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;
    ListNode looper = null;
    int carryOver = 0;
    while (l1 != null || l2 != null || carryOver != 0) {

      int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryOver;
      if (result == null) {
        result = new ListNode(sum % 10);
        looper = result;
      } else {
        looper.next = new ListNode(sum % 10);
        looper = looper.next;
      }
      carryOver = sum / 10;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }

    }
    return result;
  }

}
