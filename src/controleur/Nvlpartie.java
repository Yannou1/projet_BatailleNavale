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
	
	// on place maintenant les obj crée

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
		if (Y <0) System.out.println("non-valide");
	}
	return Y;
}
	

static int sens(){
			boolean test = true;
			int sens =0;
			while(sens == 0 )
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("taper (1) droite");
				System.out.println("taper (2) gauche");
				System.out.println("taper (3) haut");
				System.out.println("taper (4) bas");
				System.out.println("que faire ? :");
				
				int choix = sc.nextInt();
				if (choix <0) System.out.println("non-valide");
			
				switch(choix)

				{
					
				
				case 1:
					sens = 1;
					
					break; 
				case 2 :
					sens = 2;
					
					break;
				case 3 :
					sens = 3;
					
					break;
					
				case 4 : 
					sens = 4;
					
	
				}
				
				
	
	
	
			}
			return sens;	
}

static void PLaceGrille() {
	
	g1.placement(1,12,destroyer1.Namebateau(), destroyer1.VieBateau(),4);
	g1.placement(4,10,destroyer2.Namebateau(), destroyer2.VieBateau(),1);
	
	
	

	
	
}

	


public static void main(String[] args) {
	PLaceGrille();
	g1.affiche();
}
}

