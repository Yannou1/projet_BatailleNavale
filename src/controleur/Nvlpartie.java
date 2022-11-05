package controleur;


import vue.grille;


public class Nvlpartie {
	
	
	//static destroyer destroyer3 = new destroyer("d3");
	public static grille g1 = new grille();
	public static Joueur joueur1 = new Joueur("test");
	
	
	// on place maintenant les obj crée

	
	
	
	


public static void main(String[] args) {
	
	Placegrille.PLaceGrille();
	ChoseBoat.choseBoat();
	System.out.println(controleur.Joueur.destroyerList.get(0).getvie());
}





}


