package controleur;

import java.awt.Point;
import java.util.ArrayList;

import vue.grille;


public class bateautouche {
static Point [] toucher ;
static int CoordX =0;
static int CoordY =0;
static String[] BatKey;
static Point[] isboathit(Point[] attaque,ArrayList<Point[]> tousBat ){ 
toucher = new Point[1];
int indice =0;
for (Point i :attaque ) {
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

static String [] whichboat(Point [] att) {
	BatKey = new String[att.length];
	int indice2 =0;
for (Point point : att)
{
	CoordX = (int) point.getX();
	CoordY =(int) point.getY();
	BatKey[indice2] = grille.getGrille(CoordX, CoordY);
	Nvlpartie.g1.placement(att, "X");
	indice2 ++;
}
return BatKey;  
}
	
}


