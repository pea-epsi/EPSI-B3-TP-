package fr.epsi;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class MainClass
{
    public static void main(String[] args) {
        FileReader infile;
        BufferedReader reader;
        String line;
        Map<String,List<Double>> map = new HashMap<>(); 

        try {
            infile = new FileReader("notes.csv");
        } catch (IOException e) {
            System.err.println("Impossible d'ouvrir le fichier");
            return;
        }
        
        reader = new BufferedReader(infile);
        while (true) {
            Scanner scanner;
            List<String> tokens;
            String name;
            double note;

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

            scanner = new Scanner(line).useDelimiter(":");
            tokens = scanner.tokens().collect(Collectors.toList());

            // TODO verifier format
            name = tokens.get(0);
            note = Double.parseDouble(tokens.get(1));
            if (map.containsKey(name)) {
                map.get(name).add(note);
            }
            else {
                List<Double> newEntry = new ArrayList();
                newEntry.add(note);
                map.put(name, newEntry);
            }
        }

        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        System.out.println(map);

        try {
            infile.close();
        }
        catch (IOException e) {
            System.err.println("Erreur lors de la fermeture");
            return;
        }
    }
}
