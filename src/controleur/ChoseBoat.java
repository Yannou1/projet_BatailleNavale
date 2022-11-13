package controleur;

import java.util.Scanner;

import modele.Joueur;
/**
 * choix du bateau sur le quel on veut effectuer une action
 * @author Yanis
 *
 */
public class ChoseBoat {
	boolean test = true;
	/**
	 * choisit le bateau grace a un input qui fait réference à une clef de la hashmap sinon on redemande de saisir un nom de bateau
	 * @param joueur
	 * le joueur a qui est entrain de jouer
	 * @param joueur2
	 * l'autre joueur
	 */
	static void choseBoat(Joueur joueur, Joueur joueur2) 
	{
		
		Object choix = null;
		while(joueur.Boats.get(choix) == null )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("quel bateau bouger (entrer nom du bateau present sur la grille : ");
			 choix = sc.next();
			Object a = joueur.Boats.get(choix);
			}
		 action.quelactiondest(joueur.Boats.get(choix),joueur, joueur2);
		 
		}
	}

