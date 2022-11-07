package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import modele.Bateau;
import modele.destroyer;
import modele.sousmarin;

public class action
{
	static Point[] hit;
	public static void quelactiondest(Object object, Joueur joueur) {
		System.out.println(object);
		boolean test = true;
		while(test == true )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("taper tirer");
			System.out.println("taper bouger");
			int choix = sc.nextInt();
			if (choix <0) System.out.println("non-valide");
			switch(choix)
			{
			case 1:
				
				
				if (isdestr(object, joueur) == true ) {
					destroyer a = objecttodestroy(object, joueur);
					  a.Puissancetire(); 
						hit= new Point[1];
						hit = bateautouche.isboathit(a.attaque, joueur.arraylist);
						test =false;
				}
				if (isSmarin(object, joueur) == true)
				{
					sousmarin a = objectTodsousM(object, joueur);
					 a.Puissancetire(); 
					hit= new Point[1];
					hit = bateautouche.isboathit(a.attaque, joueur.arraylist);
				}
				
					test =false;
					for (Point i :hit)
					{
						if ( i ==null)
							break;
						else {
							String[] toucher= bateautouche.whichboat(hit);
							for (String b : toucher) 
							{
								Object p= joueur.Boats.get(b);
									if (isdestr(p, joueur) == true)
									{
									destroyer c  = objecttodestroy(p, joueur);
									c.VieBateau(1);	
									}
									if (isSmarin(p, joueur) == true)
									{
									sousmarin c  = objectTodsousM(p, joueur);
									c.VieBateau(1);	
									}
								
							}
						}
					}
				
				break; 
				
			case 2 :
				int t = 1;
				break;
	}

}
}
	
	
	
	
	static destroyer objecttodestroy(Object object,Joueur joueur) {


		for(destroyer i :  joueur.destroyerList) {
			if (object == i)
				return i;
		}
		return null;
	}
	
	static sousmarin objectTodsousM(Object object, Joueur joueur) {
		for(sousmarin i:  joueur.SmarinList) {
			if (object == i)
				return i;
		}
		return null;
	}
	

	

	
	static boolean isdestr(Object object, Joueur joueur ) {
		
		if (objecttodestroy(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	
	static boolean isSmarin(Object object, Joueur joueur) {
		if (objectTodsousM(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	
	

Point [] getaction(int choix) {
	if (choix ==1)
		
	return this.hit;
	else 	
	return null;
	
}

}



