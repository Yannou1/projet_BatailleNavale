package controleur;


import vue.grille;


public class Nvlpartie {
	
	
	//static destroyer destroyer3 = new destroyer("d3");
	public static grille g1 = new grille();
	public static Joueur joueur1 = new Joueur("test");
	public static Joueur joueur2 = new Joueur("test1");
	
	
	// on place maintenant les obj crée

	
	
	
	


public static void main(String[] args) {
	
	Placegrille.PLaceGrille(joueur1);
	
	//Placegrille.PLaceGrille(joueur2);

	ChoseBoat.choseBoat(joueur1);
	System.out.println(joueur1.destroyerList.get(0).getvie());
	g1.affiche();
}





}


