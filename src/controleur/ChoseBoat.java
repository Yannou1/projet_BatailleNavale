package controleur;

import java.util.Scanner;

public class ChoseBoat {
	boolean test = true;
	
	static void choseBoat() 
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
				Joueur.getMap("d1");
				System.out.println(Joueur.getMap("d1"));
				action.quelactiondest(Nvlpartie.joueur1.Boats.get("d1"));
				break; 
			case 2 :
				break;

			}
		}
	}
}
