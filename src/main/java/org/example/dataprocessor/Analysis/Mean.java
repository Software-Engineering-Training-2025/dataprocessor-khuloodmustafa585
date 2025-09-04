package org.example.dataprocessor.Analysis;

import java.util.List;

public class Mean implements AnalyzingStrategy{
    public double analyze(List<Integer> data){
        if (data.isEmpty()) return Double.NaN;
        double sum=0;
        for (Integer x: data) sum+=x;
        return sum/data.size();
    }
}
