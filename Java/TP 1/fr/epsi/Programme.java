package fr.epsi;

import fr.epsi.stringutils.StringUtils;

public class Programme {
    // Exercice 1 : faire un programme qui accepte deux nombres en ligne de commande et renvoie 
    // leur somme (on utilise Integer.parseInt())
    public static void main(String[] args) {
        if (args.length != 2) {
            usage();
            return;
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.printf("Somme %d + %d : %d\n", n1, n2, n1+n2);
        }
        catch(NumberFormatException e) {
            usage();
        }

        // Exercice 2 
        System.out.println(StringUtils.dotdotdot("abcdefghijkl"));
        System.out.println(StringUtils.dotdotdotBuf("abcdefghijkl", ':'));
    }

    private static void usage() {
        System.err.println("Usage : fr.epsi.Programme <nombre 1> <nombre 2>");
    }
}
