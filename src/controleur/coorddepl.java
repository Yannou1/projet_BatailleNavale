package controleur;

import java.awt.Point;

public class coorddepl {
	
	private static Point[] NewCoord;


	static Point[] newcoord(Point[] ancienCoord, Joueur joueur, int taille) 
	{
		int indice =0;
		NewCoord = new Point[3];
		for (Point i : ancienCoord) 
		{
			int X = (int) i.getX();
			int Y = (int) i.getY();
			X++;
			Point p1 = new Point(X,Y);
			NewCoord[indice] = p1;
			indice ++;	
		}
		for (Point [] i : joueur.arraylist)
		{
			if ( i == ancienCoord) 
			{
				int index = joueur.arraylist.indexOf(i);
				joueur.arraylist.set(index, NewCoord) ;
			}
			else 
				continue;
		}
		return NewCoord;
	}
}
