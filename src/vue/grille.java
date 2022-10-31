package vue;

import java.util.ArrayList;

import modele.bateau;
import modele.destroyer;

public class grille {
	int n ;
	int p;
	private char [] [] grille;

	
	
public grille()	{
	
grille = new char [16] [16];
char c = ' ' ;
for (int i= 1; i< 16; i++) {	
	for (int j= 1; j< 16; j++) {
		grille [i] [j] = c ;
		
}
}






} 

void action (int coordX, int coordY, char lettre, int taille) {
	for (int i= 1; i< 16; i++) {	
		for (int j= 1; j< 16; j++) {
			grille [coordX] [coordY] = lettre;
			
	}
		
	}
	for (int longu =0; longu< taille; longu++)
	{
		coordX ++;
	grille [coordX] [coordY] = lettre;
	}

	
}


void affiche( ) {
	
	System.out.println();
	for (int i= 1; i< 16; i++) {
		for (int j= 1; j< 16; j++) {
			System.out.print("_|_"+ grille [i] [j]);
		}
		System.out.println("_|");

	}
	System.out.println();

}

public static void main(String[] args) 
{
	
	
	destroyer destroyer = new destroyer();
	grille g1 = new grille();
	g1.action(1,14,(char) destroyer.Taillebateau(), 5);
	g1.affiche();
			
}



}
