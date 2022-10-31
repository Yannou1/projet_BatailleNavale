package controleur;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import modele.destroyer;
import vue.grille;


public class Nvlpartie {
	static Joueur joueur1 = new Joueur("test");
	static destroyer destroyer1 = new destroyer("d1");
	static destroyer destroyer2 = new destroyer("d2");
	destroyer destroyer3 = new destroyer("d3");
	static grille g1 = new grille();
	
	
	// on place maintenant les obj crée
	static void PLaceGrille() {
	
	g1.placement(destroyer1.coordX , destroyer1.coordY, destroyer1.name,destroyer1.VieBateau(), destroyer1.sense);
	 g1.placement(destroyer2.coordX , destroyer2.coordY, destroyer2.name,destroyer2.VieBateau(), destroyer2.sense);
	
	}
	
	
	static boolean isboathere() {
		
		for(Point j : destroyer2.coord) {
		
		for(Point i : destroyer1.coord) {	
		if (i.equals(j)) {
			 System.out.println("Les tableaux sont égaux");
			destroyer2 = new destroyer("d2");
			
			return true;
		}
			 else {
			 System.out.println("Les tableaux ne sont pas égaux.");
			
			 }
	}
		}
		return false;
	}



public static void main(String[] args) {
	isboathere();
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

