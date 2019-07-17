package com.sougat818.p3;

public class Problem3 {

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
