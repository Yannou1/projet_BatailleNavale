package controleur;



import java.util.Scanner;
import modele.Testplacement;
import modele.croiseur;
import modele.cuirasse;
import modele.destroyer;
import modele.sousmarin;

public class Placegrille {
	public static void PLaceGrille(Joueur joueur)
	{	
		final int nbBateau =1;
		final int nbSmarin =1;
		final int nbDest =3;
		final int nbcroiseur =1;
		final int nbcuirasse =1;
		int destpose =0;
		int Smarinpose =0;
		int bateaupose = 0;
		int croiseurpose = 0;
		int cuirasseposee =0;
		
		
		
	while( bateaupose < nbBateau )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("taper (1) destroyer ");
		System.out.println("taper (2) sous-marin");
		System.out.println("taper (3) croiseur");
		System.out.println("taper (4) cuirasse");
		System.out.println("que faire ? :");
		
		int choix = sc.nextInt();
		if (choix <0) System.out.println("non-valide");
		String destroyername = "de" + Integer.toString(joueur.getDestroyerList().size()+1);
		String Smarinname = "so" + Integer.toString(joueur.SmarinList.size()+1);
		String croiseurname = "cr" + Integer.toString(joueur.getCroiseurList().size()+1);
		String cuirassename = "cu" + Integer.toString(joueur.getCuirasseList().size()+1);
		
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
			if (croiseurpose <= nbcroiseur)
			{
				joueur.getCroiseurList().add(new croiseur(croiseurname));	
				joueur.ajouter(joueur.getCroiseurList().get(croiseurpose).coord);
				for ( croiseur i : joueur.getCroiseurList() )
				{
					while (true) {
						if (Testplacement.isPlacementok(joueur.getCroiseurList().get(croiseurpose).coord, joueur.arraylist) ==false)
						{
							joueur.g1.placement(joueur.getCroiseurList().get(croiseurpose).coord,joueur.getCroiseurList().get(croiseurpose).getName());
							joueur.g1.affiche();
							joueur.Boats.put(joueur.getCroiseurList().get(croiseurpose).getName(),joueur.getCroiseurList().get(croiseurpose) );
							bateaupose ++;
							croiseurpose++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +croiseurname +" nouvel coordonées :" );
							joueur.getCroiseurList().set(croiseurpose, new croiseur(croiseurname));
							joueur.set(bateaupose,joueur.getCroiseurList().get(croiseurpose).coord);
						}
						
					}
					break;
				}
		}		
		break; 			
			
		case 4 : 
			if (cuirasseposee <= nbcuirasse)
			{
				joueur.getCuirasseList().add(new cuirasse(cuirassename));	
				joueur.ajouter(joueur.getCuirasseList().get(cuirasseposee).coord);
				for ( cuirasse i : joueur.getCuirasseList() )
				{
					while (true) {
						if (Testplacement.isPlacementok(joueur.getCuirasseList().get(cuirasseposee).coord, joueur.arraylist) ==false)
						{
							joueur.g1.placement(joueur.getCuirasseList().get(cuirasseposee).coord,joueur.getCuirasseList().get(cuirasseposee).getName());
							joueur.g1.affiche();
							joueur.Boats.put(joueur.getCuirasseList().get(cuirasseposee).getName(),joueur.getCuirasseList().get(cuirasseposee) );
							bateaupose ++;
							cuirasseposee++;
							break;
						}
						else {
							System.out.println("coordoné non valide pour " +cuirassename +" nouvel coordonées :" );
							joueur.getCuirasseList().set(croiseurpose, new cuirasse(cuirassename));
							joueur.set(bateaupose,joueur.getCuirasseList().get(cuirasseposee).coord);
						}
						
					}
					break;
				}
		}		
		break; 			
			
}

	
	
	}
}

	
	
	
}
