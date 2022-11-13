package modele;

import java.awt.Point;
/**
 * calcul tous les point d'un bateau 
 * @author Yanis
 *
 */
public class ClcPts {
	
	static int  sense =Bateau.sens();
	final static int DROITE = 1;
	final static int GAUCHE = 2;
	final static int HAUT = 3; 
	final static int BAS = 4;
	public static Point[] coord;
	static int coordX = 0;
	static int  coordY= 0;
	/**
	 * calcul des point 
	 * @param sens
	 * sens du bateau
	 * @param p1
	 * premier point 
	 * @param taille
	 * longeur du bateau
	 * @return
	 * un tableau avec tous les points du bateau
	 */
	public static Point[] coordpts(int sens, Point p1, int taille )
	{
		coordX = (int) p1.getX();
		coordY = (int) p1.getY();	
		coord = new Point [taille];
		
		
		coord[0] =  p1;
		if (taille != 1)
		{
		for (int i=1; i<= taille-1; i++) 
		{
			if (sens == DROITE) 
			{
				coord[i] =new Point(coordX+i, coordY );	
			}
			if (sens == GAUCHE) 
			{
					coord[i] =new Point(coordX-i , coordY) ;
				
			}
			if (sens == HAUT)
			{
					 coord[i] = new Point(coordX, coordY -i); ;
					 
			}
			if (sens == BAS) 
			{
					coord[i] = new Point(coordX, coordY+i ); ;
				
			}
		}
		}
		return coord;
	}
}
