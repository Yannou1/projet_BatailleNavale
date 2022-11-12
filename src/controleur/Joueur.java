package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import modele.croiseur;
import modele.cuirasse;
import modele.destroyer;
import modele.sousmarin;
import vue.grille;

public class Joueur {
	public ArrayList<Point[]> arraylist;
	public  HashMap<String, Object> Boats;
	 private ArrayList<destroyer> destroyerList ;
	 ArrayList<sousmarin> SmarinList  ;
	 ArrayList<croiseur> croiseurList;
	private ArrayList<cuirasse> cuirasseList;
	 public grille g1;
	 public grille g2;
	 
	

Joueur(String name) {
	 g1 = new grille();
	 g2 = new grille();
	 arraylist = new ArrayList<Point []>();
	 Boats = new HashMap<String, Object>();
	 destroyerList = new ArrayList<destroyer>();
	 SmarinList = new ArrayList<sousmarin>() ; 
	 croiseurList = new ArrayList<croiseur>() ;
	 cuirasseList = new ArrayList<cuirasse>();
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

public ArrayList<croiseur> getCroiseurList() {
	return croiseurList;
}

public ArrayList<cuirasse> getCuirasseList() {
	return cuirasseList;
}

}





