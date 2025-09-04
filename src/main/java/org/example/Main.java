package org.example;

import org.example.dataprocessor.DataProcessorService;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        DataProcessorService service=new DataProcessorService();
        service.process(
                CleaningType.REMOVE_NEGATIVES,
                AnalysisType.MEAN,
                OutputType.CONSOLE,
                List.of (5, -4, 0, 24)
        );
    }
}