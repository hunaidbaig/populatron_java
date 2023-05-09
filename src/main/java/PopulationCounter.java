import java.text.NumberFormat;
import java.util.Locale;

public class PopulationCounter {
    public static void main(String[] args) throws Exception {
       
        String path = args[0];

        ReadLine readFile = new ReadLine();
        long result =  readFile.getAllPopulation(path);
        String num = NumberFormat.getInstance(Locale.getDefault()).format(result);
        System.out.printf("World population is: %s\n", num);
    }
}
