package vue;

import java.awt.Point;

public class grille {
	String c = "";
	private String [] [] grille;
	
	
public grille()	{
	
grille = new String [15] [15];

for (int i= 0; i< 15; i++) {	
	for (int j= 0; j< 15; j++) {
		grille [i] [j] = null ;
		
}
}

} 


public void placement (Point[] BatCoord, String name) {
	for (Point i : BatCoord) {
		int X= (int) i.getX();
		int Y= (int) i.getY();
		grille [X-1] [Y-1] = name;	
		
	}
			
}



public void affiche() {
	
	System.out.println();
	for (int j=0; j< 15; j++) 
	{
		for (int i= 0; i< 15; i++) 
		{
			if (grille [i] [j] == null )
			{
				
			System.out.print("_|_");
		
			}
			else 
			
				System.out.print( grille [i] [j] + "|");
			
		}
		System.out.println("_|");

	}
	System.out.println();

}




}
