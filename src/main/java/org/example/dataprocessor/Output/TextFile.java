package org.example.dataprocessor.Output;

import java.nio.file.Files;
import java.nio.file.Path;

public class TextFile implements OutputtingStrategy{
    @Override
    public void write(double value) throws Exception {
        Path path=Path.of("target","result.txt");
        Files.createDirectories(path.getParent());
        Files.writeString(path, "Result = "+ value);

    }
}
