package modele;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import vue.grille;
/**
 * initialise un joueur avec tous ses attribut
 * @author Yanis
 * 
 */
public class Joueur {
	public ArrayList<Point[]> arraylist;
	public  HashMap<String, Object> Boats;
	 private ArrayList<destroyer> destroyerList ;
	 ArrayList<sousmarin> SmarinList  ;
	 ArrayList<croiseur> croiseurList;
	private ArrayList<cuirasse> cuirasseList;
	 public grille g1;
	 public grille g2;
	 String name;
	 int score;
	
/**
 * construit le joueur
 * @param name
 * nom du joueur 
 */
public Joueur(String name) {
	this.name = name;
	 g1 = new grille();
	 g2 = new grille();
	 arraylist = new ArrayList<Point []>();
	 Boats = new HashMap<String, Object>();
	 destroyerList = new ArrayList<destroyer>();
	 SmarinList = new ArrayList<sousmarin>() ; 
	 croiseurList = new ArrayList<croiseur>() ;
	 cuirasseList = new ArrayList<cuirasse>();
	 this.score = getscore(0);
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

public String getName() {
	return name;
}

public int getscore(int i) {
	return score + i;
	
}


}





