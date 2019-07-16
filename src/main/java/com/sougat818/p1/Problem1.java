package com.sougat818.p1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Problem1 {

  ArrayList<String> solution(String input) {
    ArrayList<String> result = new ArrayList<>();
    Pattern pattern = Pattern.compile("<(.+)>([^>]+)</\\1>");
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      String match = matcher.group(2);
      result.add(match);
    }

    if (result.isEmpty()) {
      result.add("None");
    }

    return result;
  }
}
