package org.example.dataprocessor.factory;

import org.example.dataprocessor.Analysis.*;
import org.example.dataprocessor.Cleaning.CleaningStrategy;
import org.example.dataprocessor.Cleaning.RemoveNegatives;
import org.example.dataprocessor.Cleaning.ReplaceNegativesWithZero;
import org.example.dataprocessor.Output.Console;
import org.example.dataprocessor.Output.OutputtingStrategy;
import org.example.dataprocessor.Output.TextFile;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

public class StrategyFactory {
    public static CleaningStrategy getCleaner(CleaningType type){
        if(type==CleaningType.REMOVE_NEGATIVES) return new RemoveNegatives();
        return new ReplaceNegativesWithZero();
    }
    public static AnalyzingStrategy getAnalyzer(AnalysisType type){
        if (type==AnalysisType.MEAN) return new Mean();
        if (type==AnalysisType.MEDIAN) return new Median();
        if (type==AnalysisType.STD_DEV) return new StdDev();
        if (type==AnalysisType.P90_NEAREST_RANK) return new P90NearestRank();
        return new Top3FrequentCountSum();
    }
    public static OutputtingStrategy getOutput(OutputType type){
        if (type == OutputType.CONSOLE) return new Console();
        return new TextFile();
    }
}
