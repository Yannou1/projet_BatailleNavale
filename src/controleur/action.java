package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import modele.Testplacement;
import modele.croiseur;
import modele.destroyer;
import modele.sousmarin;

public class action
{
	static Point[] hit;
	public static void quelactiondest(Object object, Joueur joueur, Joueur joueur2) 
	{
		System.out.println(object);
		boolean test = true;
		while(test == true )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("(1)tirer");
			System.out.println("(2)bouger");
			int choix = sc.nextInt();
			if (choix <0) System.out.println("non-valide");
			switch(choix)
			{
			case 1:
				
				if (isdestr(object, joueur) == true ) 
				{
					destroyer a = objecttodestroy(object, joueur);
					  a.Puissancetire(); 
						hit= new Point[1];
						hit = bateautouche.isboathit(a.attaque, joueur2.arraylist, a.gettaille());
						test =false;
				}
				if (isSmarin(object, joueur) == true)
				{
					sousmarin a = objectTodsousM(object, joueur);
					 a.Puissancetire(); 
					hit= new Point[1];
					hit = bateautouche.isboathit(a.attaque, joueur2.arraylist, a.gettaille());
				}
				if (iscroiseur(object, joueur) == true)
				{
					croiseur a = objectTocroiseur(object, joueur);
					 a.Puissancetire(); 
					hit= new Point[5];
					hit = bateautouche.isboathit(a.attaque, joueur2.arraylist, a.gettaille());
				}
				// -------------------------------------------------------------
					test =false;
				for (Point i :hit)
				{
					if ( i ==null)
						break;
					else 
					{
						ArrayList<String> toucher = new ArrayList<String>();
						toucher=bateautouche.whichboat(hit, joueur2);
						if ( isSmarin(object, joueur) == false)
						{
							for (String b : toucher) 	
							{
								Object p= joueur2.Boats.get(b);
								if (isdestr(p, joueur2) == true)
								{
									joueur2.g1.placement(hit, "X");
									destroyer c  = objecttodestroy(p, joueur2);
									c.VieBateau(1);	
								}
							}
						}
							
							//test si on tire depuis un sousmarin ou non
							
							if ( isSmarin(object, joueur) == true) 
							{
								for (String b : toucher) 	
								{
									Object p= joueur2.Boats.get(b);
									if (isdestr(p, joueur2) == true)
									{
										joueur2.g1.placement(hit, "X");
										destroyer c  = objecttodestroy(p, joueur2);
										c.VieBateau(1);	
									}
									if (isSmarin(p, joueur2) == true)
									{
										joueur2.g1.placement(hit, "X");
										sousmarin c  = objectTodsousM(p, joueur2);
										c.VieBateau(1);	
									}
								}
							}
						}
					}
				
				break; 
				
			case 2 :
				
				if (isdestr(object, joueur) == true ) 
				{
					destroyer a = objecttodestroy(object, joueur);
					mouvement.destroyermluvement(a, joueur);
					test =false;
				}
				
				if (isSmarin(object, joueur) == true ) 
				{
					sousmarin a = objectTodsousM(object, joueur);
					mouvement.sousmarinrmouvement(a, joueur);
					test =false;
					}
				
				
			}
			}
	}
		

	
	
	static destroyer objecttodestroy(Object object,Joueur joueur) {


		for(destroyer i :  joueur.getDestroyerList()) {
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
	
	static croiseur objectTocroiseur(Object object, Joueur joueur) {
		for(croiseur i:  joueur.croiseurList) {
			if (object == i)
				return i;
		}
		return null;
	}
	
	

	
	static boolean isdestr(Object object, Joueur joueur ) 
	{
		
		if (objecttodestroy(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	
	static boolean iscroiseur(Object object, Joueur joueur ) 
	{
		if (objectTocroiseur(object, joueur)!=null)
			return true;
		else
			return false;
		
	}
	
	
	
	
	static boolean isSmarin(Object object, Joueur joueur) 
	{
		if (objectTodsousM(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	



}



