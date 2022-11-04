package modele;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import controleur.Nvlpartie;
import controleur.Testplacement;

public class Placegrille {
	public static void PLaceGrille()
	{	
		final int nbBateau =2;
		final int nbSmarin =1;
		final int nbDest =3;
		int destpose =0;
		int Smarinpose =0;
		int bateaupose = 0;
		ArrayList<destroyer> destroyerList = new ArrayList<destroyer>() ;
		ArrayList<sousmarin> SmarinList = new ArrayList<sousmarin>() ;
		
		
		HashMap<String, Bateau> Boats = new HashMap<String, Bateau>();
		 
        
		
		
		
		
		
		
		
		
		
		
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
		String Smarinname = "S" + Integer.toString(SmarinList.size()+1);
		
		
		
		switch(choix)
		{
		
		case 1:
		if (destpose <= nbDest)
		{
			destroyerList.add(new destroyer(destroyername));	
			
			for ( destroyer i : destroyerList )
			{
				while (Testplacement.coordValide(destroyerList.get(destpose).coord) == true)
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
						
						Nvlpartie.g1.affiche();
						test = 2;
						Boats.put(destroyerList.get(destpose).getName(),destroyerList.get(destpose) );
						bateaupose ++;
						destpose++;
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
			if (Smarinpose <= nbSmarin)
			{
				SmarinList.add(new sousmarin(Smarinname));	
				
				for ( sousmarin i : SmarinList )
				{
					while (Testplacement.coordValide(SmarinList.get(Smarinpose).coord) == true)
					{
						System.out.println("coordoné non valide pour " +destroyername +" nouvel coordonées :" );
						SmarinList.set(Smarinpose, new sousmarin(Smarinname) );
					}
					Nvlpartie.joueur1.ajouter(SmarinList.get(Smarinpose).coord);
					int test =1;
					while (test  == 1)
					{
						if (Testplacement.boathere(Nvlpartie.joueur1.arraylist) == false )
						{
							Nvlpartie.g1.placement(SmarinList.get(Smarinpose).coord,SmarinList.get(Smarinpose).getName());
							
							Nvlpartie.g1.affiche();
							test = 2;
							Boats.put(SmarinList.get(Smarinpose).getName(),SmarinList.get(Smarinpose) );
							bateaupose ++;
							Smarinpose++;
							break;
						}
						else
						{
							System.out.println("deja un bateau ici entrée de nouvelle coordonné pour les destroyer " +destroyername );	
							destroyerList.set(Smarinpose, new destroyer(Smarinname) );
							Nvlpartie.joueur1.set(bateaupose,SmarinList.get(Smarinpose).coord);
						}
						
					}
					break;
				}
				
			}
			else 
				System.out.println("tout les destroyers sont positionés");
		break; 
		
		case 3 :
			
			break;
		case 4 : 
		
			
			break;
}

	
	
	}
}
}
