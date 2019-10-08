package fr.epsi.polygon;

/*
 * Solution: pour les cas particuliers (en boutde chaine), on veut pouvoir les
 * instancier donc on implemente les methodes abstraites
 */
public class Rectangle extends Quads
{
    public Rectangle(int width, int height)
    {
        super.width = width;
        super.height = height;
    }

    public int getWidth()
    {
        return super.width;
    }

    public int getHeight()
    {
        return super.height;
    }
}
