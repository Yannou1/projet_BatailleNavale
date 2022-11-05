package controleur;


import java.util.ArrayList;
import java.util.Scanner;
import modele.Testplacement;
import modele.destroyer;
import modele.sousmarin;

public class Placegrille {
	public static void PLaceGrille()
	{	
		final int nbBateau =1;
		final int nbSmarin =1;
		final int nbDest =3;
		int destpose =0;
		int Smarinpose =0;
		int bateaupose = 0;
		
		ArrayList<sousmarin> SmarinList = new ArrayList<sousmarin>() ;
		
		 
		
		
		
		
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
		String destroyername = "d" + Integer.toString(controleur.Joueur.destroyerList.size()+1);
		String Smarinname = "S" + Integer.toString(SmarinList.size()+1);
		
		switch(choix)
		{
		
		case 1:
			if (destpose <= nbDest)
			{
				controleur.Joueur.destroyerList.add(new destroyer(destroyername));
				Nvlpartie.joueur1.ajouter(controleur.Joueur.destroyerList.get(destpose).coord);
				for ( destroyer i : controleur.Joueur.destroyerList )
				{
					while (true) {
						if (Testplacement.isPlacementok(controleur.Joueur.destroyerList.get(destpose).coord, Nvlpartie.joueur1.arraylist) ==false)
						{
							Nvlpartie.g1.placement(controleur.Joueur.destroyerList.get(destpose).coord,controleur.Joueur.destroyerList.get(destpose).getName());
							Nvlpartie.g1.affiche();
							Nvlpartie.joueur1.Boats.put(controleur.Joueur.destroyerList.get(destpose).getName(),controleur.Joueur.destroyerList.get(destpose) );
							bateaupose ++;
							destpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +destroyername +" nouvel coordonées :" );
							controleur.Joueur.destroyerList.set(destpose, new destroyer(destroyername));
							Nvlpartie.joueur1.set(bateaupose,controleur.Joueur.destroyerList.get(destpose).coord);
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
				Nvlpartie.joueur1.ajouter(SmarinList.get(Smarinpose).coord);
				for ( sousmarin i : SmarinList )
				{
					while (true) {
						if (Testplacement.isPlacementok(SmarinList.get(Smarinpose).coord, Nvlpartie.joueur1.arraylist) ==false)
						{
							Nvlpartie.g1.placement(SmarinList.get(Smarinpose).coord,SmarinList.get(Smarinpose).getName());
							Nvlpartie.g1.affiche();
							Nvlpartie.joueur1.Boats.put(SmarinList.get(Smarinpose).getName(),SmarinList.get(Smarinpose) );
							bateaupose ++;
							Smarinpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +Smarinname +" nouvel coordonées :" );
							SmarinList.set(Smarinpose, new sousmarin(Smarinname));
							Nvlpartie.joueur1.set(bateaupose,SmarinList.get(Smarinpose).coord);
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
