package org.example.dataprocessor.Analysis;

import java.util.List;

public class StdDev implements AnalyzingStrategy{
    @Override
    public double analyze(List<Integer> data) {
        if(data.isEmpty()) return Double.NaN;
        double sum=0;
        for(int x:data) sum+=x;
        double mean= sum/data.size();
        double varSum=0;
        for (int x:data){
            double difference=x-mean;
            varSum +=difference*difference;
        }
        double variance=varSum/data.size();
        return Math.sqrt(variance);
    }
}
