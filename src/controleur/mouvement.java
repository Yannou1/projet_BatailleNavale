package controleur;

import java.awt.Point;
import java.util.Scanner;

import modele.Joueur;
import modele.Testplacement;
import modele.croiseur;
import modele.cuirasse;
import modele.destroyer;
import modele.sousmarin;
/**
 * classe qui permet de deplacer chaque type de bateau
 * @author Yanis
 *
 */
public class mouvement {
	/**
	 * classe qui permet de deplacer les destroyer
	 * @param a
	 * represente le type bateau séléctionner
	 * @param joueur 
	 * est le joueur a qui appartient le bateau
	 */
	static public void destroyermouvement(destroyer a, Joueur joueur)
	
	{
		boolean test = true;
		while (test == true)
		{
			System.out.println(" ou voulez-vous aller");
			System.out.println(" (1) arriere");
			System.out.println(" (2) avant");
			Scanner sc1 = new Scanner(System.in);
			int where = sc1.nextInt();
			Point[] newcoord ;
		 	newcoord = new Point[3];
		 	Point[] tmpcoord;
		 	tmpcoord = new Point[3];
			tmpcoord = a.coord;
			newcoord=  coorddepl.newcoord(a.coord,joueur, a.gettaille(), a.sense, where);
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, newcoord) ;
					a.coord =newcoord;
				}
			}
			if (a.sense== 1 || a.sense ==2) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						 test = actiondepldestr(joueur,a,newcoord,tmpcoord );
							break;	
					 case 2 :
						 test = actiondepldestr(joueur,a,newcoord,tmpcoord );
							break;
				 }
			 }
			 if (a.sense== 3 || a.sense ==4) 
			 {
				 switch (where)
				 {
					 case 1 : //  
						test = actiondepldestr(joueur,a,newcoord,tmpcoord );
							break;
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 test = actiondepldestr(joueur,a,newcoord,tmpcoord );
						 break;
				 }
			 }
		} 
	}
	/**
	 * classe qui permet de deplacer les sousmarin
	 * @param a
	 * represente le type bateau séléctionner
	 * @param joueur 
	 * est le joueur a qui appartient le bateau
	 */
	static void sousmarinrmouvement(sousmarin a, Joueur joueur)
	{
		boolean test = true;
		while (test == true)
		{
			System.out.println(" ou voulez-vous aller");
			System.out.println(" (1) arriere");
			System.out.println(" (2) avant");
			Scanner sc1 = new Scanner(System.in);
			int where = sc1.nextInt();
			Point[] newcoord ;
			newcoord = new Point[3];
			Point[] tmpcoord;
			tmpcoord = new Point[3];
			tmpcoord = a.coord;
			newcoord=  coorddepl.newcoord(a.coord,joueur, a.gettaille(), a.sense, where);
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, newcoord) ;
					a.coord =newcoord;
				}
			}
			if (a.sense== 1 || a.sense ==2) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						 test = actiondeplSmarin(joueur,a,newcoord,tmpcoord );
							break;	
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 
						 test = actiondeplSmarin(joueur,a,newcoord,tmpcoord );
							break;
				 }
			 } 
			 if (a.sense== 3 || a.sense ==4) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						test = actiondeplSmarin(joueur,a,newcoord,tmpcoord );
							break;
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 test = actiondeplSmarin(joueur,a,newcoord,tmpcoord );
						 break;
				 }
			 }
		}
		 
	}
	/**
	 * classe qui permet de deplacer les cuirassées 
	 * @param a
	 * represente le type bateau séléctionner
	 * @param joueur 
	 * est le joueur a qui appartient le bateau
	 */
	static void cuirassermouvement(cuirasse a, Joueur joueur)
	{
		boolean test = true;
		while (test == true)
		{
			System.out.println(" ou voulez-vous aller");
			System.out.println(" (1) arriere");
			System.out.println(" (2) avant");
			Scanner sc1 = new Scanner(System.in);
			int where = sc1.nextInt();
			Point[] newcoord ;
			newcoord = new Point[3];
			Point[] tmpcoord;
			tmpcoord = new Point[3];
			tmpcoord = a.coord;
			newcoord=  coorddepl.newcoord(a.coord,joueur, a.gettaille(), a.sense, where);
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, newcoord) ;
					a.coord =newcoord;
				}
			}
			if (a.sense== 1 || a.sense ==2) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						 test = actiondeplCuirrasse(joueur,a,newcoord,tmpcoord );
							break;	
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 
						 test = actiondeplCuirrasse(joueur,a,newcoord,tmpcoord );
							break;
				 }
			 } 
			 if (a.sense== 3 || a.sense ==4) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						test = actiondeplCuirrasse(joueur,a,newcoord,tmpcoord );
							break;
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 test = actiondeplCuirrasse(joueur,a,newcoord,tmpcoord );
						 break;
				 }
			 }
		}
		 
	}
	/**
	 * classe qui permet de deplacer les croiseurs
	 * @param a
	 * represente le type bateau séléctionner
	 * @param joueur 
	 * est le joueur a qui appartient le bateau
	 */
	static void croiseurmouvement(croiseur a, Joueur joueur)
	{
		boolean test = true;
		while (test == true)
		{
			System.out.println(" ou voulez-vous aller");
			System.out.println(" (1) arriere");
			System.out.println(" (2) avant");
			Scanner sc1 = new Scanner(System.in);
			int where = sc1.nextInt();
			Point[] newcoord ;
			newcoord = new Point[3];
			Point[] tmpcoord;
			tmpcoord = new Point[3];
			tmpcoord = a.coord;
			newcoord=  coorddepl.newcoord(a.coord,joueur, a.gettaille(), a.sense, where);
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, newcoord) ;
					a.coord =newcoord;
				}
			}
			if (a.sense== 1 || a.sense ==2) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						 test = actiondeplcroiseur(joueur,a,newcoord,tmpcoord );
							break;	
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 
						 test = actiondeplcroiseur(joueur,a,newcoord,tmpcoord );
							break;
				 }
			 } 
			 if (a.sense== 3 || a.sense ==4) 
			 {
				 switch (where)
				 {
					 case 1 : // 
						test = actiondeplcroiseur(joueur,a,newcoord,tmpcoord );
							break;
					 case 2 :
						// meme que en haut mais on vas dans l'autre sens  
						 test = actiondeplcroiseur(joueur,a,newcoord,tmpcoord );
						 break;
				 }
			 }
		}
		 
	}
	
	
//_____________________________________________________________________________________________________________________________________________________________
/**
 * méthode permetant de teste si les nouvelles coordonné sont bien utilisables et place le bateau si oui sinon le remet a ses ancienne coordoné
 * @param joueur
 * le joueur
 * @param a
 * un sousmarin
 * @param newcoord
 * les nouvelles coordonnées
 * @param tmpcoord
 * les anciennes coordonées
 * @return
 * un booléen
 */
	static boolean actiondeplSmarin(Joueur joueur, sousmarin a, Point [] newcoord, Point [] tmpcoord) {
		if (Testplacement.isPlacementok(newcoord, joueur.arraylist) == false )
		{
			joueur.g1.placement(tmpcoord, null);
			joueur.g1.placement(newcoord, a.getName());
			joueur.g1.affiche();
		return false;
			
		}
		else
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, tmpcoord) ;
					
					a.coord = tmpcoord;
				}
			}
				System.out.println("Erreur"); 
				return true;
		
	}
	/**
	 * méthode permetant de teste si les nouvelles coordonné sont bien utilisables et place le bateau si oui sinon le remet a ses ancienne coordoné
	 * @param joueur
	 * le joueur
	 * @param a
	 * destroyer
	 * @param newcoord
	 * les nouvelles coordonnées
	 * @param tmpcoord
	 * les anciennes coordonées
	 * @return
	 * un booléen
	 */
	
	
	static boolean actiondepldestr(Joueur joueur, destroyer a, Point [] newcoord, Point [] tmpcoord) {
		if (Testplacement.isPlacementok(newcoord, joueur.arraylist) == false )
		{
			joueur.g1.placement(tmpcoord, null);
			joueur.g1.placement(newcoord, a.getName());
			joueur.g1.affiche();
		return false;
			
		}
		else
			for (Point [] i : joueur.arraylist)
			{
				if ( i == a.coord) 
				{
					int index = joueur.arraylist.indexOf(i);
					joueur.arraylist.set(index, tmpcoord) ;
					a.coord = tmpcoord;
				}
			}
				System.out.println("Erreur"); 
				return true;
		
	}
	
	
	/**
	 * méthode permetant de teste si les nouvelles coordonné sont bien utilisables et place le bateau si oui sinon le remet a ses ancienne coordoné
	 * @param joueur
	 * le joueur
	 * @param a
	 * croiseur
	 * @param newcoord
	 * les nouvelles coordonnées
	 * @param tmpcoord
	 * les anciennes coordonées
	 * @return
	 * un booléen
	 */


static boolean actiondeplcroiseur(Joueur joueur, croiseur a, Point [] newcoord, Point [] tmpcoord) {
	if (Testplacement.isPlacementok(newcoord, joueur.arraylist) == false )
	{
		joueur.g1.placement(tmpcoord, null);
		joueur.g1.placement(newcoord, a.getName());
		joueur.g1.affiche();
	return false;
		
	}
	else
		for (Point [] i : joueur.arraylist)
		{
			if ( i == a.coord) 
			{
				int index = joueur.arraylist.indexOf(i);
				joueur.arraylist.set(index, tmpcoord) ;
				a.coord = tmpcoord;
			}
		}
			System.out.println("Erreur"); 
			return true;
	
}
/**
 * méthode permetant de teste si les nouvelles coordonné sont bien utilisables et place le bateau si oui sinon le remet a ses ancienne coordoné
 * @param joueur
 * le joueur
 * @param a
 * un cuirassé
 * @param newcoord
 * les nouvelles coordonnées
 * @param tmpcoord
 * les anciennes coordonées
 * @return
 * un booléen
 */
static boolean actiondeplCuirrasse(Joueur joueur, cuirasse a, Point [] newcoord, Point [] tmpcoord) {
	if (Testplacement.isPlacementok(newcoord, joueur.arraylist) == false )
	{
		joueur.g1.placement(tmpcoord, null);
		joueur.g1.placement(newcoord, a.getName());
		joueur.g1.affiche();
	return false;
		
	}
	else
		for (Point [] i : joueur.arraylist)
		{
			if ( i == a.coord) 
			{
				int index = joueur.arraylist.indexOf(i);
				joueur.arraylist.set(index, tmpcoord) ;
				a.coord = tmpcoord;
			}
		}
			System.out.println("Erreur"); 
			return true;
	
}


}



