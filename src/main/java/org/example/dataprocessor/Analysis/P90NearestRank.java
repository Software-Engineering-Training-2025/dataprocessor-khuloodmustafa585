package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.List;

public class P90NearestRank implements AnalyzingStrategy{
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        List<Integer> copy= new ArrayList<>(data);
        int n =copy.size();
        int rank=(int) Math.ceil(n*0.9);
        return copy.get(rank-1);
    }
}
