package controleur;

import java.awt.Point;

public class coorddepl {
	
	private static Point[] NewCoord;


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
