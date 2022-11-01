package controleur;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import modele.destroyer;
import vue.grille;


public class Nvlpartie {
	
	static destroyer destroyer1 = new destroyer("d1");
	static destroyer destroyer2 = new destroyer("d2");
	static destroyer destroyer3 = new destroyer("d3");
	static grille g1 = new grille();
	static Joueur joueur1 = new Joueur("test");
	
	
	// on place maintenant les obj crée
	static void PLaceGrille() {
	
	g1.placement(destroyer1.coordX , destroyer1.coordY, destroyer1.name,destroyer1.VieBateau(), destroyer1.sense);
	
	boolean test = false;
	while(test == false)
	{
		if (bateauHere.bateauhere(destroyer2.coord , destroyer1.coord, null, null, null, null, null, null, null, null)==false)
		{
			g1.placement(destroyer2.coordX , destroyer2.coordY, destroyer2.name,destroyer2.VieBateau(), destroyer2.sense);
			test = true;
		}
	else 
	{
		 destroyer2 = new destroyer("d2");
		}
	}
	
	while(test == false)
	{
		if (bateauHere.bateauhere(destroyer3.coord , destroyer2.coord, destroyer1.coord, null, null, null, null, null, null, null)==false)
		{
	g1.placement(destroyer3.coordX , destroyer3.coordY, destroyer3.name,destroyer3.VieBateau(), destroyer3.sense);
		}
	else 
	{
		 destroyer3 = new destroyer("d3");
		}
	
	}
	
	}


public static void main(String[] args) {
	
	;
	System.out.println(bateauHere.bateauhere(destroyer1.coord , destroyer2.coord, destroyer3.coord, null, null, null, null, null, null, null));
	PLaceGrille();
	g1.affiche();
	for(Point i : destroyer1.coord) {
		System.out.println(i);
	}
	for(Point i : destroyer2.coord) {
		System.out.println(i);
	}


}
}

