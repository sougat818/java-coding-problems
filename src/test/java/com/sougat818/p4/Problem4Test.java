package com.sougat818.p4;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Problem4Test {

  Problem4 problem4;

  @Before
  public void setUp() {
    problem4 = new Problem4();
  }

  @Test
  public void testSolution1() throws IOException {
    MetricSummary metricSummary =
        problem4.solution(
            this.getClass().getClassLoader().getResource("com/sougat818/p4/data_log").getPath());

    Assert.assertEquals(11, metricSummary.getUniqueIps());

    Map<String, Long> topIps = metricSummary.getTopIps();
    Map<String, Long> topUrls = metricSummary.getTopUrls();
    Assert.assertTrue(
        CollectionUtils.isEqualCollection(
            topIps.keySet(), Arrays.asList("168.41.191.40", "72.44.32.10", "177.71.128.21")));
    Assert.assertTrue(
        CollectionUtils.isEqualCollection(topIps.values(), Arrays.asList(3L, 4L, 3L)));

    Assert.assertTrue(
        CollectionUtils.isEqualCollection(
            topUrls.keySet(),
            Arrays.asList(
                "\"GET /faq/how-to/", "\"GET /asset.js", "\"GET /docs/manage-websites/")));
    Assert.assertTrue(
        CollectionUtils.isEqualCollection(topUrls.values(), Arrays.asList(1L, 1L, 2L)));
  }

  @Test
  public void testSolution2() throws IOException {
    MetricSummary metricSummary =
        problem4.solution(
            this.getClass().getClassLoader().getResource("com/sougat818/p4/access_log").getPath());

    Assert.assertEquals(172, metricSummary.getUniqueIps());
    Map<String, Long> topIps = metricSummary.getTopIps();
    Map<String, Long> topUrls = metricSummary.getTopUrls();

    Assert.assertTrue(
        CollectionUtils.isEqualCollection(
            topIps.keySet(),
            Arrays.asList("10.0.0.153", "h24-71-236-129.ca.shawcable.net", "64.242.88.10")));
    Assert.assertTrue(
        CollectionUtils.isEqualCollection(topIps.values(), Arrays.asList(270L, 51L, 452L)));

    Assert.assertTrue(
        CollectionUtils.isEqualCollection(
            topUrls.keySet(),
            Arrays.asList(
                "\"GET /twiki/bin/view/Main/WebHome",
                "\"GET /twiki/pub/TWiki/TWikiLogos/twikiRobot46x50.gif",
                "\"GET /")));

    Assert.assertTrue(
        CollectionUtils.isEqualCollection(topUrls.values(), Arrays.asList(41L, 64L, 47L)));
  }
}
