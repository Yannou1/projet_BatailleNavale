package modele;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import controleur.Nvlpartie;
import controleur.Testplacement;

public class Placegrille {
	public static void PLaceGrille()
	{	
		final int nbBateau =2;
		final int nbDest =3;
		int destpose =0;
		int bateaupose = 0;
		
	//quel bateau
	//Nvlpartie.g1.placement(Nvlpartie.destroyer1.coord, Nvlpartie.destroyer1.getName());
	
	
	boolean t = false;
	int destroyerNum = 1;
	ArrayList<destroyer> destroyerList = new ArrayList<destroyer>() ;

	while( bateaupose <= nbBateau )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("taper (1) destroyer 1 ");
		System.out.println("taper (2) destroyer 2");
		System.out.println("taper (3) destroyer 3 ");
		System.out.println("taper (4) quiter");
		System.out.println("que faire ? :");
		
		int choix = sc.nextInt();
		if (choix <0) System.out.println("non-valide");
		String destroyername = "d" + Integer.toString(destroyerList.size()+1);
		switch(choix)
		{
		case 1:
		if (destpose <= nbDest)
		{
			destroyerList.add(new destroyer(destroyername));	
			
			for ( destroyer i : destroyerList )
			{
				while (Testplacement.coordValide(destroyerList.get(destpose).coord) == false)
				{
					System.out.println("coordoné non valide pour " +destroyername +" nouvel coordonées :" );
					destroyerList.set(destpose, new destroyer(destroyername) );
				}
				Nvlpartie.joueur1.ajouter(destroyerList.get(destpose).coord);
				int test =1;
				while (test  == 1)
				{
					if (Testplacement.boathere(Nvlpartie.joueur1.arraylist) == false )
					{
						Nvlpartie.g1.placement(destroyerList.get(destpose).coord,destroyerList.get(destpose).getName());
						bateaupose ++;
						destpose++;
						Nvlpartie.g1.affiche();
						test = 2;
						break;
					}
					else
					{
						System.out.println("deja un bateau ici entrée de nouvelle coordonné pour les destroyer " +destroyername );	
						destroyerList.set(destpose, new destroyer(destroyername) );
						Nvlpartie.joueur1.set(bateaupose,destroyerList.get(destpose).coord);
					}
					
				}
				break;
			}
			
		}
		else 
			System.out.println("tout les destroyers sont positionés");
				break; 
				
		case 2 :
		
			
			break;
		case 3 :
			
			break;
		case 4 : 
		
			
			break;
}

	
	
	}
}
}
