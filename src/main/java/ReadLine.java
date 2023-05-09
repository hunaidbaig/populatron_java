import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;


public class ReadLine {

    public long getAllPopulation(String path) throws IOException {
        long sum = 0;
        List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);

        sum = lines.stream()
                .skip(1)
                .map(l -> l.split(","))
                .filter(terms -> terms.length > 4 && !terms[4].isEmpty())
                .mapToLong(terms -> Long.parseLong(terms[4]))
                .sum();
       
        return sum;
    }
}
