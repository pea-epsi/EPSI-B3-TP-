/* 
 * TP - Polygones et surfaces
 * Modeliser un polygone dont on pourra demander la surface
 * Modeliser un quadrilatere rectangle qui pourra fournir sa longueur et sa largeur (concept "abstrait")
 * Modelier un rectangle et un carre, deux applications concretes du polygone rectangle
 */

package fr.epsi;
import fr.epsi.polygon.*;

public class Main
{
    public static void main(String[] args)
    {
        Square sq = new Square(7);
        Rectangle rect = new Rectangle(4, 6);
        Polygon mystere = mystere();
        System.out.printf("- Square\twidth: %2d, height: %2d, surface: %d\n", sq.getHeight(), sq.getWidth(), sq.getSurface());
        System.out.printf("- Rectangle\twidth: %2d, height: %2d, surface: %d\n", rect.getHeight(), rect.getWidth(), rect.getSurface());
        System.out.printf("- ???\t\tsurface: %d\n", mystere.getSurface());
    }

    // Creee un POLYGON (type de retour de la fonction)
    private static Polygon mystere() {
        return new Square(5);
    }
}
