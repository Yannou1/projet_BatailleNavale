package controleur;

import java.awt.Point;
import java.util.ArrayList;

import modele.Joueur;
import vue.grille;

/**
 * permet de faire les test a la suite d'un tire pour savoir si un bateau est touch�
 * @author Yanis
 * 
 */
public class bateautouche {
 static Point [] toucher ;
 static int CoordX =0;
 static int CoordY =0;
 static ArrayList<String> BatKey;
 	/**
 	 * verifie si un bateau est touch�
 	 * @param attaque
 	 * coordon�es des point d'impact d'une attaque
 	 * @param tousBat
 	 * liste des coordonn� de tout les points de chaque bateau
 	 * @param taille
 	 * taille du bateau
 	 * @return
 	 * un tableau avec tout les points ou un bateau est touch�
 	 */
	 static Point[] isboathit(Point[] attaque,ArrayList<Point[]> tousBat, int taille )
	{ 
	toucher = new Point[20];
	int indice =0;
	for (Point i :attaque ) 
	{
		for(int p= 0; p < tousBat.size(); p++ )	
		{
			for(Point j : tousBat.get(p))
			{
							if (j.equals(i)) 
							{
								System.out.println("Les tableaux sont �gaux");
								System.out.println(i);
								toucher[indice] = i;
							}
							else 
							{
								System.out.println("Les tableaux ne sont pas �gaux.");
							}	
						}
					}
			indice ++;
				}
		return toucher;
	}
	/**
	 * permet de connaitre le nom des bateaux touch�es 
	 * @param att
	 * point retourn� de la m�thode isboathit
	 * @param joueur
	 * joueur a qui appartient lagrille
	 * @return
	 * retourne un tableau aavec tous les noms des bateau touch�
	 */
	   static ArrayList<String> whichboat(Point [] att, Joueur joueur) {
		BatKey = new ArrayList<String>();
		int indice2 =0;
	for (Point point : att)
	{
		if (point ==null) {
			continue;
		}
		else 
		{
			CoordX = (int) point.getX();
			CoordY =(int) point.getY();
			BatKey.add(joueur.g1.getGrille(CoordX, CoordY));
			indice2 ++;
		}
	}
	return BatKey;  
	}

	
	



}


