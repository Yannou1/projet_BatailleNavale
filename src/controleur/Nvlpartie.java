package controleur;

import java.util.Scanner;

import modele.destroyer;
import vue.grille;


public class Nvlpartie {
	Joueur joueur1 = new Joueur();
	static destroyer destroyer1 = new destroyer("d1");
	static destroyer destroyer2 = new destroyer("d2");
	destroyer destroyer3 = new destroyer("d3");
	static grille g1 = new grille();
	private static int X;
	private static int Y;
	
	// on place maintenant les obj cr�e

static int gencoorX () {
	System.out.println("X : ");
	X = 0;
	while (X >= 15 || X < 1) {
		System.out.println("1 : ");
		Scanner sc = new Scanner(System.in);
		 X = sc.nextInt();
		if (X <0) System.out.println("non-valide");
	}
	return X;
}

static int gencoorY () {
	System.out.println("Y : ");
	Y = 0;
	while (Y >= 15 || Y <= 1) {
		Scanner sc = new Scanner(System.in);
		 Y = sc.nextInt();
		if (X <0) System.out.println("non-valide");
	}
	return Y;
}
	
static void PLaceGrille() {
	
	g1.placement(1,12,destroyer1.Namebateau(), destroyer1.VieBateau());
	g1.placement(2,12,destroyer2.Namebateau(), destroyer2.VieBateau());
	

	
	
}

	


public static void main(String[] args) {
	PLaceGrille();
	g1.affiche();
}
}
