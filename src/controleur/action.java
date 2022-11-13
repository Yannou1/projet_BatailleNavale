package controleur;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import modele.Joueur;
import modele.croiseur;
import modele.cuirasse;
import modele.destroyer;
import modele.sousmarin;
/**
 * permet de avoir quelle action effectué pour un bateau
 * @author Yanis
 *
 */
public class action
{
	static Point[] hit;
	/**
	 * permet de savoir quelle action va être faite entre tirer et bouger 
	 * @param object
	 * le bateau contenu dans la hashmap 
	 * @param joueur
	 * le joueur 
	 * @param joueur2
	 * le joueur 2
	 */
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
				if (iscuirasse(object, joueur) == true)
				{
					cuirasse a = objectTocuirasse(object, joueur);
					 a.Puissancetire(); 
					hit= new Point[5];
					hit = bateautouche.isboathit(a.attaque, joueur2.arraylist, a.gettaille());
				}
				
				
				// -------------------------------------------------------------
					test =false;
				for (Point i :hit)
				{
					if ( i ==null)
						continue;
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
									joueur2.g1.placement(hit, "_X_");
									joueur.g2.placement(hit, "_X_");
									destroyer c  = objecttodestroy(p, joueur2);
									c.VieBateau(1);	
								}
								if (iscroiseur(p, joueur2) == true)
								{
									joueur2.g1.placement(hit, "_X_");
									joueur.g2.placement(hit, "_X_");
									
									croiseur c  = objectTocroiseur(p, joueur2);
									c.VieBateau(1);	
								}if (iscroiseur(p, joueur2) == true)
								{
									joueur2.g1.placement(hit, "_X_");
									joueur.g2.placement(hit, "_X_");
									croiseur c  = objectTocroiseur(p, joueur2);
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
										joueur2.g1.placement(hit, "_X_");
										joueur.g2.placement(hit, "_X_");
										destroyer c  = objecttodestroy(p, joueur2);
										c.VieBateau(1);	
									}
									if (isSmarin(p, joueur2) == true)
									{
										joueur2.g1.placement(hit, "_X_");
										joueur.g2.placement(hit, "_X_");
										sousmarin c  = objectTodsousM(p, joueur2);
										c.VieBateau(1);	
									}
									if (iscroiseur(p, joueur2) == true)
									{
										joueur2.g1.placement(hit, "_X_");
										joueur.g2.placement(hit, "_X_");
										croiseur c  = objectTocroiseur(p, joueur2);
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
					if (a.getvie() != a.gettaille())
					{
						System.out.println("impossible de déplacer le bateau");
						break;
					}
					else
					mouvement.destroyermouvement(a, joueur);
					test =false;
				}
				
				if (isSmarin(object, joueur) == true ) 
				{

					sousmarin a = objectTodsousM(object, joueur);
					if (a.getvie() != a.gettaille())
					{
						System.out.println("impossible de déplacer le bateau");
						break;
					}
					mouvement.sousmarinrmouvement(a, joueur);
					test =false;
					}
				
				if (iscroiseur(object, joueur) == true)
				{
					
					croiseur a = objectTocroiseur(object, joueur);
					if (a.getvie() != a.gettaille())
					{
						System.out.println("impossible de déplacer le bateau");
						break;
					}
					mouvement.croiseurmouvement(a, joueur);
					test =false;
				
				}
				if (iscuirasse(object, joueur) == true)
				{
					
					cuirasse a = objectTocuirasse(object, joueur);
					if (a.getvie() != a.gettaille())
					{
						System.out.println("impossible de déplacer le bateau");
						break;
					}
					mouvement.cuirassermouvement(a, joueur);
					test =false;
				
				}
			}
		}
	}
		

	
	/**
	 * convertit l'objet retourner par la Hashmap en destroyer
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * retourne l'objet convertit en destroyer
	 */
	static destroyer objecttodestroy(Object object,Joueur joueur) {


		for(destroyer i :  joueur.getDestroyerList()) {
			if (object == i)
				return i;
		}
		return null;
	}
	/**
	 * convertit l'objet retourner par la Hashmap en sousmarin
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * retourne l'objet convertit en dsousmarin
	 */
	static sousmarin objectTodsousM(Object object, Joueur joueur) {
		for(sousmarin i:  joueur.getSmarinList()) {
			if (object == i)
				return i;
		}
		return null;
	}
	/**
	 * convertit l'objet retourner par la Hashmap en croiseur
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * retourne l'objet convertit en croiseur
	 */
	static croiseur objectTocroiseur(Object object, Joueur joueur) {
		for(croiseur i:  joueur.getCroiseurList()) {
			if (object == i)
				return i;
		}
		return null;
	}
	/**
	 * convertit l'objet retourner par la Hashmap en cuirassé
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * retourne l'objet convertit en cuirassé
	 */
	static cuirasse objectTocuirasse(Object object, Joueur joueur) {
		for(cuirasse i:  joueur.getCuirasseList()) {
			if (object == i)
				return i;
		}
		return null;
	}
	
	

	/**
	 * vérifie si l'objet retourner par la Hashmap est un destroyer
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * un boléen 
	 */
	static boolean isdestr(Object object, Joueur joueur ) 
	{
		
		if (objecttodestroy(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	/**
	 * vérifie si l'objet retourner par la Hashmap est un croiseur
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * un boléen 
	 */
	static boolean iscroiseur(Object object, Joueur joueur ) 
	{
		if (objectTocroiseur(object, joueur)!=null)
			return true;
		else
			return false;
		
	}
	
	
	/**
	 * vérifie si l'objet retourner par la Hashmap est un sousmarin
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * un boléen 
	 */
	
	static boolean isSmarin(Object object, Joueur joueur) 
	{
		if (objectTodsousM(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	/**
	 * vérifie si l'objet retourner par la Hashmap est un cuirassé
	 * @param object
	 * l'objet retourner par la Hasmap
	 * @param joueur
	 * le joueur qui est entrain de jouer
	 * @return
	 * un boléen 
	 */
	static boolean iscuirasse(Object object, Joueur joueur) 
	{
		if (objectTocuirasse(object, joueur)!=null)
			return true;
		else
		return false;
		
	}
	



}



