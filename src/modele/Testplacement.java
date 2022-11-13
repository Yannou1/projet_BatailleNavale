package modele;

import java.awt.Point;
import java.util.ArrayList;
/**
 * Fait les test pour savoir un placement est valide 
 * @author Yanis
 *
 */
public class Testplacement {
	/**
	 * parcours la liste des bateaux pour savoir si un bateau est positioner au m�me endroit que celui qui va �tre pos�
	 * @param Mesbateaux
	 * liste de toutes les coordon�es des diff�rents bateaux
	 * @return
	 * un bol�en
	 */
	public static boolean boathere( ArrayList<Point[]> Mesbateaux ) 
	{
		
	

		for(int p= 0; p < Mesbateaux.size(); p++ )	
		{
			for(Point j : Mesbateaux.get(p))
			{
				for(int l= 0; l < Mesbateaux.size(); l++ )
		
				{
					if (l!=p)
					{
					
						for(Point i : Mesbateaux.get(l)) 
						{	
							if (i.equals(j)) 
							{
								System.out.println("un bateau et ici");
								System.out.println(i);
								return true;
							}
							else 
							{
								continue;
							}	
						}
					} 
					else 
						System.out.println(Mesbateaux.size());
				}
			}
		}
		return false;
	}



 /**
  * permet de savoir si un bateau et dans la grille 
  * @param monbateau
  * coordon�es du bateau en cours de placement 
  * @return
  * un bool�ens
  */
	public static boolean coordValide(Point[] monbateau) 
	{
		boolean value = false;
		for ( Point i : monbateau)
		{
			int coordX = (int) i.getX();
			int coordY = (int) i.getY();
			if ((coordX >15 | coordX < 1) ) 
			{
				value = true;
				break;
			}
				else 
				{
					value = false;	
				}
			if(coordY >15 | coordY < 1) 
			{
				value = true;
				break;
			}
				else 
				{
					value = false;	
				}
			
			}
	return value;
	}
	/**
	 * verifie si les deux method� pr�cedente valide le placement du bateau 
	 * @param bat
	 * coordon�es du bateau en cours de placement 
	 * @param bateauxjoueur
	 * liste de toutes les coordon�es des diff�rents bateaux
	 * @return
	 * un bool�en
	 */
	public static boolean isPlacementok(Point[] bat, ArrayList<Point[]> bateauxjoueur )
	{
		
		if (coordValide(bat) == false & boathere(bateauxjoueur) == false ) {
			return false; 
		}
		else return true;
	
		}	
}























