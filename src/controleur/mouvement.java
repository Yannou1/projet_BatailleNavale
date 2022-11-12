package controleur;

import java.awt.Point;
import java.util.Scanner;

import modele.Testplacement;
import modele.destroyer;
import modele.sousmarin;

public class mouvement {
	
	static void destroyermluvement(destroyer a, Joueur joueur)
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
	
//_____________________________________________________________________________________________________________________________________________________________
	
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
	
	
	
}






