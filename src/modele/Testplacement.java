package modele;

import java.awt.Point;
import java.util.ArrayList;

public class Testplacement {
	
	public static boolean boathere( ArrayList<Point[]> Mesbateaux ) 
	{
		
	

		for(int p= 0; p < Mesbateaux.size(); p++ )	
		{
			for(Point j : Mesbateaux.get(p))
			{
				for(int l= 0; l < Mesbateaux.size(); l++ )
		
				{
					if (l!=p)
					{
					
						for(Point i : Mesbateaux.get(l)) 
						{	
							if (i.equals(j)) 
							{
								System.out.println("Les tableaux sont égaux");
								System.out.println(i);
								return true;
							}
							else 
							{
								System.out.println("Les tableaux ne sont pas égaux.");
							}	
						}
					} 
					else 
						System.out.println(Mesbateaux.size());
				}
			}
		}
		return false;
	}




	public static boolean coordValide(Point[] monbateau) 
	{
		boolean value = false;
		for ( Point i : monbateau)
		{
			int coordX = (int) i.getX();
			int coordY = (int) i.getY();
			if ((coordX >15 | coordX < 1) ) 
			{
				value = true;
				break;
			}
				else 
				{
					value = false;	
				}
			if(coordX >15 | coordY < 1) 
			{
				value = true;
				break;
			}
				else 
				{
					value = false;	
				}
			
			}
	return value;
	}
	
	public static boolean isPlacementok(Point[] bat, ArrayList<Point[]> bateauxjoueur )
	{
		
		if (coordValide(bat) == false & boathere(bateauxjoueur) == false ) {
			return false; 
		}
		else return true;
	
		}	
}























