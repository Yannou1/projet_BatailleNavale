package controleur;

import java.awt.Point;
import java.util.ArrayList;

public class Joueur {
	public ArrayList<Point[]> arraylist;

Joueur(String name) {
	 arraylist = new ArrayList<Point []>();
	
}

public void ajouter(Point[] new_object) 
{
	
arraylist.add(new_object);
}

public void set(int index, Point[] coord) {
	arraylist.set(index, coord);
	
}

}





