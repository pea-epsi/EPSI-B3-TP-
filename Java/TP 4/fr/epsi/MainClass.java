package fr.epsi;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

class MainClass
{
    public static void main(String[] args) {
        FileReader infile;
        BufferedReader reader;
        String line;

        try {
            infile = new FileReader("notes.csv");
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
            return;
        }

        reader = new BufferedReader(infile);
        while (true) {
            Scanner scanner;
            List<String> tokens;
            double mean;

            try {
                line = reader.readLine();
            }
            catch (IOException e)
            {
                System.err.println("Erreur a la lecture");
                return;
            }

            if (line == null)
                break;

            scanner = new Scanner(line).useDelimiter("\\|");
            tokens = scanner.tokens().collect(Collectors.toList());
            mean = 0;
            for (int i = 1; i < tokens.size(); ++i)
                mean += Float.parseFloat(tokens.get(i));
            mean /= tokens.size() - 1;
            System.out.printf("%s : %.2f\n", tokens.get(0), mean);
        }

        try {
            infile.close();
        }
        catch (IOException e) {
            System.err.println("Erreur lors de la fermeture");
            return;
        }
    }
}
