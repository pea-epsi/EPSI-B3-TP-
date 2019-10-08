package fr.epsi.polygon;

/*
 * Solution: Le quadrilatere est un cas particulier et tous les quadrilateres ont une largeur
 * et une hauteur. On doit IMPLEMENTER l'INTERFACE de base (polygon) car tous les quadrilateres
 * calculent la surface de la meme maniere. Comme on ne veut pas instancier cette classe, on
 * la rend ABSTRAITE les classes. Les classes filles partagent des ATTRIBUTS largeur et hauteur.
 */
public abstract class Quads implements Polygon
{
    public int getSurface()
    {
        return height * width;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    protected int height;
    protected int width;
}
