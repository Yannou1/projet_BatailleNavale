package controleur;


import modele.Joueur;
import modele.quigagne;

/**
 * permet d'initailiser une nouvelle partie
 * @author Yanis
 *
 */
public class Nvlpartie {
	
	
	//static destroyer destroyer3 = new destroyer("d3");
	public static Joueur joueur1 = new Joueur("test");
	public static Joueur joueur2 = new Joueur("test1");
	
	
	// on place maintenant les obj cr�e

	
	
	
	


public static void main(String[] args) {
Placegrille.PLaceGrille(joueur1);
Placegrille.PLaceGrille(joueur2);
	while (quigagne.score(joueur2)  <2)
	{
	ChoseBoat.choseBoat(joueur1, joueur2);
	ChoseBoat.choseBoat(joueur2, joueur1);
	System.out.println("J2 G1");
	joueur2.g1.affiche();
	System.out.println("J1 G2");
	joueur1.g2.affiche();
	System.out.println("J1 G1");
	joueur1.g1.affiche();
	
}
}
}


