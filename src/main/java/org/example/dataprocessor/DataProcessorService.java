package org.example.dataprocessor;

import org.example.dataprocessor.Analysis.AnalyzingStrategy;
import org.example.dataprocessor.Cleaning.CleaningStrategy;
import org.example.dataprocessor.Output.OutputtingStrategy;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.factory.StrategyFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


public class DataProcessorService {

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {
        CleaningStrategy cleaner= StrategyFactory.getCleaner(cleaningType);
        AnalyzingStrategy analyzer=StrategyFactory.getAnalyzer(analysisType);
        OutputtingStrategy out=StrategyFactory.getOutput(outputType);
        List<Integer> cleaned=cleaner.clean(new ArrayList<>(data));
        double result= analyzer.analyze(cleaned);
        out.write(result);
        return result;


    }
}

