package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {
    public int getNumberOfMales(String path) {
        int maleCounter = 0;

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path));
            String line;

            while ((line = bufferedReader.readLine())  != null) {
                if (line.contains(",Male,")) maleCounter +=1;
            }
        } catch (IOException e) { throw new IllegalStateException("Cannot read the file"); }

        return maleCounter;
    }
}
