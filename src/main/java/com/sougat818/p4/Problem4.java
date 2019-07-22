package com.sougat818.p4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Template.
 */

class Problem4 {

  private static final Logger logger = LoggerFactory.getLogger(Problem4.class);


  MetricSummary solution(String paths) {
    Path path = Paths
        .get(paths);
    try {
      Map<String, Long> ips = Files.lines(path)
          .map(Metric::new)
          .collect(Collectors.groupingBy(Metric::getIp, Collectors.counting()))
          .entrySet().stream()
          .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
          .limit(3)
          .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

      Map<String, Long> urls = Files.lines(path)
          .map(Metric::new)
          .collect(Collectors.groupingBy(Metric::getUrl, Collectors.counting()))
          .entrySet().stream()
          .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
          .limit(3)
          .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

      long size = Files.lines(path)
          .map(Metric::new).collect(Collectors.groupingBy(Metric::getIp, Collectors.toList()))
          .size();
      return new MetricSummary(ips, urls, size);


    } catch (IOException e) {
      logger.error("Exception while accessing file - {}", path, e);
    }
    return new MetricSummary(new HashMap<>(), new HashMap<>(), 0L);

  }
}


