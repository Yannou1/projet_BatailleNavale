package controleur;

import java.awt.Point;
import java.util.ArrayList;

import modele.Joueur;
import vue.grille;

/**
 * permet de faire les test a la suite d'un tire pour savoir si un bateau est touché
 * @author Yanis
 * 
 */
public class bateautouche {
 static Point [] toucher ;
 static int CoordX =0;
 static int CoordY =0;
 static ArrayList<String> BatKey;
 	/**
 	 * verifie si un bateau est touché
 	 * @param attaque
 	 * coordonées des point d'impact d'une attaque
 	 * @param tousBat
 	 * liste des coordonné de tout les points de chaque bateau
 	 * @param taille
 	 * taille du bateau
 	 * @return
 	 * un tableau avec tout les points ou un bateau est touché
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
								System.out.println("Les tableaux sont égaux");
								System.out.println(i);
								toucher[indice] = i;
							}
							else 
							{
								System.out.println("Les tableaux ne sont pas égaux.");
							}	
						}
					}
			indice ++;
				}
		return toucher;
	}
	/**
	 * permet de connaitre le nom des bateaux touchées 
	 * @param att
	 * point retourné de la méthode isboathit
	 * @param joueur
	 * joueur a qui appartient lagrille
	 * @return
	 * retourne un tableau aavec tous les noms des bateau touché
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


