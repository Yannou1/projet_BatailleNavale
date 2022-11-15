package controleur;


import modele.Joueur;
import modele.quigagne;

/**
 * permet d'initailiser une nouvelle partie
 * @author Yanis
 *
 */
public class Nvlpartie {
	
	public static void partie() {

	Joueur joueur1 = new Joueur("joueur1");
	Joueur joueur2 = new Joueur("joueur 2");// IA non iimplementer seulement jcj
	
	
	
	Placegrille.PLaceGrille(joueur1);
	Placegrille.PLaceGrille(joueur2);
		while (quigagne.score(joueur2, joueur1)  <10 || quigagne.score(joueur1, joueur2) < 10)
		{
			System.out.println("Au tour du joueur 1 de jouer");
			ChoseBoat.choseBoat(joueur1, joueur2);
			System.out.println("J1 G2");
			joueur1.g2.affiche();
			System.out.println("J1 G1");
			joueur1.g1.affiche();
		
		if (quigagne.score(joueur2, joueur1)  ==10) {
			System.out.println("le joueur 1 a gagné");
			break;
		}
		if (quigagne.score(joueur1, joueur2)  ==10) {
			System.out.println("le joueur 2 a gagné");
			break;
		}
			
			System.out.println("Au tour du joueur 2 de jouer");
			ChoseBoat.choseBoat(joueur2, joueur1);
			System.out.println("J2 G1");
			joueur2.g1.affiche();
			System.out.println("J2 G2");
			joueur2.g2.affiche();

		
		}
		if (quigagne.score(joueur2, joueur1)  ==10) {
			System.out.println("le joueur 1 a gagné");
		}
		if (quigagne.score(joueur1, joueur2)  ==10) {
			System.out.println("le joueur 2 a gagné");
		}
		
	
	
	
	
	}
	// on place maintenant les obj crée

}


