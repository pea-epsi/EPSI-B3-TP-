package fr.epsi.stringutils;

public class StringUtils
{
    // Exercice 2: Creer une classe dans un sous package qui 
    // a partir d'une chaine la renvoie avec un point entre chaque lettre
    // Il faut une methode STATIQUE
    public static String dotdotdot(String string)
    {
        String ret = new String();
        for (int i = 0; i < string.length(); ++i) {
            ret += string.charAt(i);
            // Pas de point apres le dernier caractere
            if (i < string.length() - 1)
                ret += '.';
        }
        return ret;
    }

    // Version optimisee
    public static String dotdotdotBuf(String string, char separator)
    {
        StringBuffer buf = new StringBuffer();
        char[] car = string.toCharArray();
        for (int i = 0; i < string.length(); ++i) {
            buf.append(car[i]);
            if (i < string.length() - 1)
                buf.append(separator);
        }
        return buf.toString();
    }
}
