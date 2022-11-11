package controleur;

import java.awt.Point;

public class coorddepl {
	
	private static Point[] NewCoord;

	static Point[] newcoord(Point[] ancienCoord) 
	{
		int indice =0;
	
		for (Point i : ancienCoord) 
		{
			int X = (int) i.getX();
			int Y = (int) i.getY();
			X++;
			Point p1 = new Point(X,Y);
			NewCoord[indice] = p1;
			indice ++;	
		}
		return NewCoord;
	}
}
