package controleur;

import java.util.Scanner;

public class ChoseBoat {
	boolean test = true;
	
	static void choseBoat(Joueur joueur) 
	{
		boolean test = true;
		Object choix = null;
		while(joueur.Boats.get(choix ) == null )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("quel bateau bouger (entrer nom du bateau present sur la grille : ");
			 choix = sc.next();
			//if (choix <0) System.out.println("non-valide");
			Object a = joueur.Boats.get(choix);
				test = false;
				
			
				
			

			}
		 action.quelactiondest(joueur.Boats.get(choix),joueur);
		}
	}

