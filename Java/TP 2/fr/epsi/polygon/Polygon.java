package fr.epsi.polygon;

/*
 * Solution: pour le polygon (classe de base) on fait une INTERFACE (un polygone est tres general
 * et il est inutile de stocker des attributs, en revanche tous les polygones ont une surface, or 
 * l'interface ne permet d'implementer que des methodes)
 */
public interface Polygon
{
    public int getSurface();
}
