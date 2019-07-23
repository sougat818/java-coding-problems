package com.sougat818.p4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Template. */
class Problem4 {

  MetricSummary solution(String paths) throws IOException {
    Path path = Paths.get(paths);

    MetricSummary metricSummary = new MetricSummary();

    Files.lines(path)
        .map(Metric::new)
        .forEach(
            metric -> {
              metricSummary.addUrl(metric.getUrl());
              metricSummary.addIp(metric.getIp());
            });
    return metricSummary;
  }
}
