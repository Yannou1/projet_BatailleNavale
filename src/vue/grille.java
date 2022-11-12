package vue;

import java.awt.Point;

import controleur.Joueur;

public class grille {
	String c = "";
	private  String [] [] grille;
	
	
	public grille()
	{
		grille = new String [15] [15];
		for (int i= 0; i< 15; i++) 
		{	
			for (int j= 0; j< 15; j++) 
			{
				grille [i] [j] = null ;
				
			}
		}
	} 


public void placement (Point[] BatCoord, String name) {
	for (Point i : BatCoord) {
		if ( i != null)
		{
		int X= (int) i.getX();
		int Y= (int) i.getY();
		grille [X-1] [Y-1] = name;	
		}
		else continue;
		
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
				
			System.out.print("|___");
		
			}
			else
			{
				
				System.out.print( "|" + grille [i] [j]  );
			}
			
		}
		
		System.out.println("|");

	}
	System.out.println();

}

public String getGrille(int X, int Y) {
	
	return this.grille [X-1] [Y-1];
	
}


}
