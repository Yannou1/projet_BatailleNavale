package controleur;


import java.util.ArrayList;
import java.util.Scanner;
import modele.Testplacement;
import modele.destroyer;
import modele.sousmarin;

public class Placegrille {
	public static void PLaceGrille(Joueur joueur)
	{	
		final int nbBateau =1;
		final int nbSmarin =1;
		final int nbDest =3;
		int destpose =0;
		int Smarinpose =0;
		int bateaupose = 0;
		
	
		
		 
		
		
		
		
	while( bateaupose < nbBateau )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("taper (1) destroyer 1 ");
		System.out.println("taper (2) destroyer 2");
		System.out.println("taper (3) destroyer 3 ");
		System.out.println("taper (4) quiter");
		System.out.println("que faire ? :");
		
		int choix = sc.nextInt();
		if (choix <0) System.out.println("non-valide");
		String destroyername = "d" + Integer.toString(joueur.getDestroyerList().size()+1);
		String Smarinname = "S" + Integer.toString(joueur.SmarinList.size()+1);
		
		switch(choix)
		{
		
		case 1:
			if (destpose <= nbDest)
			{
				joueur.getDestroyerList().add(new destroyer(destroyername));
				joueur.ajouter(joueur.getDestroyerList().get(destpose).coord);
				for ( destroyer i : joueur.getDestroyerList() )
				{
					while (true) {
						if (Testplacement.isPlacementok(joueur.getDestroyerList().get(destpose).coord, joueur.arraylist) ==false)
						{
							joueur.g1.placement(joueur.getDestroyerList().get(destpose).coord,joueur.getDestroyerList().get(destpose).getName());
							joueur.g1.affiche();
							joueur.Boats.put(joueur.getDestroyerList().get(destpose).getName(),joueur.getDestroyerList().get(destpose) );
							bateaupose ++;
							destpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +destroyername +" nouvel coordonées :" );
							joueur.getDestroyerList().set(destpose, new destroyer(destroyername));
							joueur.set(bateaupose,joueur.getDestroyerList().get(destpose).coord);
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
				joueur.SmarinList.add(new sousmarin(Smarinname));	
				joueur.ajouter(joueur.SmarinList.get(Smarinpose).coord);
				for ( sousmarin i : joueur.SmarinList )
				{
					while (true) {
						if (Testplacement.isPlacementok(joueur.SmarinList.get(Smarinpose).coord, joueur.arraylist) ==false)
						{
							joueur.g1.placement(joueur.SmarinList.get(Smarinpose).coord,joueur.SmarinList.get(Smarinpose).getName());
							joueur.g1.affiche();
							joueur.Boats.put(joueur.SmarinList.get(Smarinpose).getName(),joueur.SmarinList.get(Smarinpose) );
							bateaupose ++;
							Smarinpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +Smarinname +" nouvel coordonées :" );
							joueur.SmarinList.set(Smarinpose, new sousmarin(Smarinname));
							joueur.set(bateaupose,joueur.SmarinList.get(Smarinpose).coord);
						}
						
					}
					break;
				}
		}		
		break; 
		
		case 3 :
			
			break;
		case 4 : 
		
			
			break;
}

	
	
	}
}

	
	
	
}
