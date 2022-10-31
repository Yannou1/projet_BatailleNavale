package vue;

import java.util.ArrayList;

import modele.bateau;
import modele.destroyer;

public class grille {
	String c = "";
	private String [] [] grille;

	
	
public grille()	{
	
grille = new String [16] [16];

for (int i= 1; i< 16; i++) {	
	for (int j= 1; j< 16; j++) {
		grille [i] [j] = null ;
		
}
}






} 

@SuppressWarnings("unused")
public void placement (int coordX, int coordY, String lettre, int taille) {
	if (grille [coordX] [coordY] == null ) {
	grille [coordX] [coordY] = lettre;		

	for (int longu =0; longu< taille-1; longu++) {
		taille --;
		placement (coordX+1,  coordY,  lettre,  taille);
	grille [coordX] [coordY] = lettre;
	}
	}
	else 
		System.out.println("probléme");
		
	}

	



public void affiche() {
	
	System.out.println();
	for (int i= 1; i< 16; i++) {
		for (int j= 1; j< 16; j++) {
			System.out.print("_|_"+ grille [i] [j]);
		}
		System.out.println("_|");

	}
	System.out.println();

}




}
