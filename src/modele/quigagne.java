package modele;
/**
 * permet de savoir qui gagne
 * @author Yanis
 *
 */
public class quigagne {
	/**
	 * calcul le score de chaque joueur 
	 * @param joueur
	 * le joueur choisit
	 * @return
	 * le score du joueur 
	 */
	public static int score(Joueur joueur)
	{
		int monscore =0;
		for (destroyer a : joueur.getDestroyerList())
			if (a.getvie() == 0)
			{
				monscore += 1;
			}
		for (sousmarin a : joueur.getSmarinList())
			if (a.getvie() == 0)
			{
				monscore += 1;
			}
		for (croiseur a : joueur.getCroiseurList())
			if (a.getvie() == 0)
			{
				monscore += 1;
			}
		return monscore;	
	}
	
	
	
}
