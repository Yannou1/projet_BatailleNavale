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
	public static void quelactiondest(Object object) {
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
				
				
				if (isdestr(object) == true ) {
					destroyer a = objecttodestroy(object);
					 a.Puissancetire(); 
						hit= new Point[1];
						hit = bateautouche.isboathit(a.attaque, Nvlpartie.joueur1.arraylist);
						test =false;
						for (Point i :hit)
						{
							if ( i ==null)
								break;
							else {
								String[] toucher= bateautouche.whichboat(hit);
								for (String b : toucher) 
								{
									 Object p= Nvlpartie.joueur1.Boats.get(b);
									destroyer c  = objecttodestroy(p);
									c.VieBateau(1);	
								}
							}
						}
					
						break; 	
				}
				
				if (isSmarin(object) == true)
				{
					sousmarin a = objectTodsousM(object);
					 a.Puissancetire(); 
					hit= new Point[1];
					hit = bateautouche.isboathit(a.attaque, Nvlpartie.joueur1.arraylist);
					test =false;
					for (Point i :hit)
					{
						if ( i ==null)
							break;
						else {
							String[] toucher= bateautouche.whichboat(hit);
							for (String b : toucher) 
							{
								 Object p= Nvlpartie.joueur1.Boats.get(b);
								destroyer c  = objecttodestroy(p);
								c.VieBateau(1);	
							}
						}
					}
				}
				break; 
				
			case 2 :
				break;
	}

}
}
	
	
	
	
	static destroyer objecttodestroy(Object object) {


		for(destroyer i :  controleur.Joueur.destroyerList) {
			if (object == i)
				return i;
		}
		return null;
	}
	
	static sousmarin objectTodsousM(Object object) {
		for(sousmarin i:  controleur.Joueur.SmarinList) {
			if (object == i)
				return i;
		}
		return null;
	}
	

	

	
	static boolean isdestr(Object object ) {
		
		if (objecttodestroy(object)!=null)
			return true;
		else
		return false;
		
	}
	
	static boolean isSmarin(Object object) {
		if (objectTodsousM(object)!=null)
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



