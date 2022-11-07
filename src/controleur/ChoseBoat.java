package controleur;

import java.util.Scanner;

public class ChoseBoat {
	boolean test = true;
	
	static void choseBoat(Joueur joueur) 
	{
		boolean test = true;
		while(test == true )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("quel bateau bouger : ");
			int choix = sc.nextInt();
			if (choix <0) System.out.println("non-valide");
			switch(choix)
			{
			case 1:
				test = false;
				action.quelactiondest(joueur.Boats.get("d1"),joueur);
				break; 
			case 2 :
				test = false;
				action.quelactiondest(joueur.Boats.get("S1"), joueur);
				break; 
			case 3 :
				break;

			}
		}
	}
}
