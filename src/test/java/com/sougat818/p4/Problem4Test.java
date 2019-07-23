package com.sougat818.p4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

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

    Assert.assertEquals(
        "[177.71.128.21, 168.41.191.40, 72.44.32.10]",
        metricSummary.getTopIps().keySet().toString());
    Assert.assertArrayEquals(
        new Long[] {3L, 4L, 3L}, metricSummary.getTopIps().values().toArray(new Long[] {}));

    Assert.assertEquals(
        "[\"GET /faq/how-to/, \"GET /asset.js, \"GET /docs/manage-websites/]",
        metricSummary.getTopUrls().keySet().toString());
    Assert.assertArrayEquals(
        new Long[] {1L, 1L, 2L}, metricSummary.getTopUrls().values().toArray(new Long[] {}));
  }

  @Test
  public void testSolution2() throws IOException {
    MetricSummary metricSummary =
        problem4.solution(
            this.getClass().getClassLoader().getResource("com/sougat818/p4/access_log").getPath());

    Assert.assertEquals(172, metricSummary.getUniqueIps());

    Assert.assertEquals(
        "[10.0.0.153, h24-71-236-129.ca.shawcable.net, 64.242.88.10]",
        metricSummary.getTopIps().keySet().toString());
    Assert.assertArrayEquals(
        new Long[] {270L, 51L, 452L}, metricSummary.getTopIps().values().toArray(new Long[] {}));

    Assert.assertEquals(
        "[\"GET /twiki/bin/view/Main/WebHome, \"GET /twiki/pub/TWiki/TWikiLogos/twikiRobot46x50.gif, \"GET /]",
        metricSummary.getTopUrls().keySet().toString());
    Assert.assertArrayEquals(
        new Long[] {41L, 64L, 47L}, metricSummary.getTopUrls().values().toArray(new Long[] {}));
  }
}
