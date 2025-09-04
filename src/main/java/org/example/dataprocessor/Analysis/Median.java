package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Median implements AnalyzingStrategy{
    public double analyze (List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        List<Integer> copy = new ArrayList<>(data);
        Collections.sort(copy);
        int n = copy.size();
        if (n % 2 == 1) {
            return copy.get(n/2);
        }
        else {
            return (copy.get(n/2)+ copy.get(n/2-1));
        }
    }
}
