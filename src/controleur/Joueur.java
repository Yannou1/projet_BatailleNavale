package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import modele.destroyer;
import modele.sousmarin;
import vue.grille;

public class Joueur {
	public ArrayList<Point[]> arraylist;
	public  HashMap<String, Object> Boats;
	 private ArrayList<destroyer> destroyerList ;
	 ArrayList<sousmarin> SmarinList  ;
	 public grille g1;
	 
	

Joueur(String name) {
	 g1 = new grille();
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

public ArrayList<destroyer> getDestroyerList() {
	return destroyerList;
}
public ArrayList<sousmarin> getSmarinList() {
	return SmarinList;
}

}





