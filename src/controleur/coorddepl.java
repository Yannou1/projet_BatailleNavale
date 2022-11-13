package controleur;

import java.awt.Point;

import modele.Joueur;
/**
 *calcule les coordon�es apr�s le deplacement 
 * @author Yanis
 *
 */
public class coorddepl {
	
private static Point[] NewCoord;

/**
 * calcul des coordon�e de dd�placement enfonction des coordonn�e actuelle et du sens ainsi que du choix demander avant 
 * @param ancienCoord
 * les coordon�es actuel du bateau
 * @param joueur
 * le joueur qui joue
 * @param taille
 * la taille du bateau d�plac�
 * @param sens
 * le sens du bateau d�plac�
 * @param choix
 * le choix soit all� en avant soit en arri�re
 * @return
 * les nouvelle coordon� sous forme d'un tableau de point 
 */
	static Point[] newcoord(Point[] ancienCoord, Joueur joueur, int taille, int sens, int choix ) 
	{
		
	if (sens == 1 || sens ==2)
	{
		if (choix == 1)
		{
			int indice =0;
			NewCoord = new Point[taille];
			for (Point i : ancienCoord) 
			{
				int X = (int) i.getX();
				int Y = (int) i.getY();
				X++;
				Point p1 = new Point(X,Y);
				NewCoord[indice] = p1;
				indice ++;	
			}
		}
	
		
		if (choix == 2)
		{
			int indice =0;
			NewCoord = new Point[taille];
			for (Point i : ancienCoord) 
			{
				int X = (int) i.getX();
				int Y = (int) i.getY();
				X--;
				Point p1 = new Point(X,Y);
				NewCoord[indice] = p1;
				indice ++;	
			}
			
		}	
	}
	
	
	if (sens == 3 || sens ==4)
	{
		if (choix == 1)
		{
			int indice =0;
			NewCoord = new Point[taille];
			for (Point i : ancienCoord) 
			{
				int X = (int) i.getX();
				int Y = (int) i.getY();
				Y++;
				Point p1 = new Point(X,Y);
				NewCoord[indice] = p1;
				indice ++;	
			}
		}
	
		
		if (choix == 2)
		{
			int indice =0;
			NewCoord = new Point[taille];
			for (Point i : ancienCoord) 
			{
				int X = (int) i.getX();
				int Y = (int) i.getY();
				Y--;
				Point p1 = new Point(X,Y);
				NewCoord[indice] = p1;
				indice ++;	
			}
			
		}	
	}	
		return NewCoord;
	}
}
