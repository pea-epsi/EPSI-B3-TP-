package fr.epsi.polygon;

/*
 * Solution: pour les cas particuliers (en boutde chaine), on veut pouvoir les
 * instancier donc on implemente les methodes abstraites
 */
public class Square extends Quads
{
    public Square(int size)
    {
        super.width = size;
        super.height = size;
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
