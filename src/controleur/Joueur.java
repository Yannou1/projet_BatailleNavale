package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import modele.destroyer;
import modele.sousmarin;

public class Joueur {
	public ArrayList<Point[]> arraylist;
	public  HashMap<String, Object> Boats;
	 ArrayList<destroyer> destroyerList ;
	 ArrayList<sousmarin> SmarinList  ;
	

Joueur(String name) {
	
	 arraylist = new ArrayList<Point []>();
	 Boats = new HashMap<String, Object>();
	 destroyerList = new ArrayList<destroyer>();
	 SmarinList = new ArrayList<sousmarin>() ;
	 
}

public void ajouter(Point[] new_object) 
{
	
arraylist.add(new_object);
}

public void set(int index, Point[] coord) {
	arraylist.set(index, coord);
	
}


}





