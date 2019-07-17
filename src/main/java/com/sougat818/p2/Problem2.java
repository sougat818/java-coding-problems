package com.sougat818.p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Problem2 {

  /*
   Daily Coding Challenge #2
    */
  Boolean addsToK(int k, int... list) {

    Objects.requireNonNull(list, "list cannot be Null in Problem2:addsToK");

    Set<Integer> possibleKs = new HashSet<>();
    for (int l : list) {
      if (possibleKs.contains(l)) {
        return true;
      } else {
        possibleKs.add(k - l);
      }
    }
    return false;

  }

  /*
  https://leetcode.com/problems/two-sum
   */
  int[] twoSum(int[] nums, int target) {

    Objects.requireNonNull(nums, "nums cannot be Null in Problem2:twoSum");

    Map<Integer, Integer> possibleValues = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int currentValue = nums[i];
      if (possibleValues.containsKey(currentValue)) {
        return new int[]{possibleValues.get(currentValue), i};
      } else {
        possibleValues.put(target - currentValue, i);
      }
    }
    return new int[]{};

  }

}
