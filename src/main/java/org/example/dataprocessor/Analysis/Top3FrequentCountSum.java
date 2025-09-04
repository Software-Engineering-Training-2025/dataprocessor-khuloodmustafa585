package org.example.dataprocessor.Analysis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Top3FrequentCountSum implements AnalyzingStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return 0.0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : data) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> {
                    int cmp = Integer.compare(b.getValue(), a.getValue());
                    if (cmp != 0) return cmp;
                    return Integer.compare(a.getKey(), b.getKey());
                });

        pq.addAll(freq.entrySet());


        int sumTop3 = 0;
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            sumTop3 += pq.poll().getValue();
        }

        return (double) sumTop3;
    }
}
