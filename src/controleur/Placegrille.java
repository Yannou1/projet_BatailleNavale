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
		String destroyername = "d" + Integer.toString(joueur.destroyerList.size()+1);
		String Smarinname = "S" + Integer.toString(joueur.SmarinList.size()+1);
		
		switch(choix)
		{
		
		case 1:
			if (destpose <= nbDest)
			{
				joueur.destroyerList.add(new destroyer(destroyername));
				joueur.ajouter(joueur.destroyerList.get(destpose).coord);
				for ( destroyer i : joueur.destroyerList )
				{
					while (true) {
						if (Testplacement.isPlacementok(joueur.destroyerList.get(destpose).coord, joueur.arraylist) ==false)
						{
							Nvlpartie.g1.placement(joueur.destroyerList.get(destpose).coord,joueur.destroyerList.get(destpose).getName());
							Nvlpartie.g1.affiche();
							joueur.Boats.put(joueur.destroyerList.get(destpose).getName(),joueur.destroyerList.get(destpose) );
							bateaupose ++;
							destpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +destroyername +" nouvel coordonées :" );
							joueur.destroyerList.set(destpose, new destroyer(destroyername));
							joueur.set(bateaupose,joueur.destroyerList.get(destpose).coord);
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
				controleur.Joueur.SmarinList.add(new sousmarin(Smarinname));	
				joueur.ajouter(controleur.Joueur.SmarinList.get(Smarinpose).coord);
				for ( sousmarin i : controleur.Joueur.SmarinList )
				{
					while (true) {
						if (Testplacement.isPlacementok(controleur.Joueur.SmarinList.get(Smarinpose).coord, joueur.arraylist) ==false)
						{
							Nvlpartie.g1.placement(controleur.Joueur.SmarinList.get(Smarinpose).coord,controleur.Joueur.SmarinList.get(Smarinpose).getName());
							Nvlpartie.g1.affiche();
							joueur.Boats.put(controleur.Joueur.SmarinList.get(Smarinpose).getName(),controleur.Joueur.SmarinList.get(Smarinpose) );
							bateaupose ++;
							Smarinpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +Smarinname +" nouvel coordonées :" );
							controleur.Joueur.SmarinList.set(Smarinpose, new sousmarin(Smarinname));
							joueur.set(bateaupose,controleur.Joueur.SmarinList.get(Smarinpose).coord);
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
