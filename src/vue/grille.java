package vue;

import java.util.ArrayList;

import modele.bateau;
import modele.destroyer;

public class grille {
	int n ;
	int p;
	private char [] [] grille;

	
	
public grille(int coordX, int coordY, char lettre, int taille)	{
	
grille = new char [15] [15];

for (int i= 0; i< 15; i++) {	
	for (int j= 0; j< 15; j++) {
		grille [coordX] [coordY] = lettre;
		while(taille< 5 )	
		grille [coordX+1] [coordY] = lettre;
		taille --;
}
	
}


} 

void affiche( ) {
	
	System.out.println();
	for (int i= 0; i< 15; i++) {
		for (int j= 0; j< 15; j++) {
			System.out.print("_|_ "+ grille [i] [j]);
		}
		System.out.println("_|");

	}
	System.out.println();

}

public static void main(String[] args) 
{
	
	
	destroyer destroyer = new destroyer();
	grille g1 = new grille(1,14,(char) destroyer.Taillebateau(), 5);
	g1.affiche();
			
}

}
