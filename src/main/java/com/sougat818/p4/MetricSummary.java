package com.sougat818.p4;

import java.util.Map;

class MetricSummary {

  public MetricSummary(Map<String, Long> topIps,
      Map<String, Long> topUrls, Long uniqueIps) {
    this.topIps = topIps;
    this.topUrls = topUrls;
    this.uniqueIps = uniqueIps;
  }

  private Map<String, Long> topIps;
  private Map<String, Long> topUrls;
  private Long uniqueIps;


  public Long getUniqueIps() {
    return uniqueIps;
  }

  public Map<String, Long> getTopIps() {
    return topIps;
  }

  public Map<String, Long> getTopUrls() {
    return topUrls;
  }
}
