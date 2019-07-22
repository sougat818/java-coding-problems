package com.sougat818.p4;

class Metric {

  private String ip;
  private String url;

  public Metric(String line) {
    ip = line.split(" ")[0];
    url = line.split(" ")[5] + " " + line.split(" ")[6];
  }

  public String getIp() {
    return ip;
  }

  public String getUrl() {
    return url;
  }
}
