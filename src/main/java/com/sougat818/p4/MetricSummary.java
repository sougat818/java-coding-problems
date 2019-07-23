package com.sougat818.p4;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class MetricSummary {

    ConcurrentHashMap<String, Long> urls = new ConcurrentHashMap<>();

    ConcurrentHashMap<String, Long> ips = new ConcurrentHashMap<>();

    void addUrl(String url) {
        urls.merge(url, 1L, Long::sum);
    }

    void addIp(String ip) {
        ips.merge(ip, 1L, Long::sum);
    }

    private Map<String, Long> getTopN(ConcurrentHashMap<String, Long> urls, int n) {
        return
                urls.entrySet().parallelStream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .limit(n)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    Map<String, Long> getTopIps() {
        return getTopN(ips, 3);
    }

    Map<String, Long> getTopUrls() {
        return getTopN(urls, 3);
    }

    int getUniqueIps() {
        return ips.keySet().size();
    }
}
