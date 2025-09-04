package org.example.dataprocessor.Output;

public class Console implements OutputtingStrategy{
    @Override
    public void write(double value) {
        System.out.println("Result= " +value);
    }
}
