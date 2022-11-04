package modele;

import java.awt.Point;

import java.util.Scanner;

public class destroyer extends Bateau 
{
	
	public int sense;
	public int coordX;
	public int coordY;
	public Point[] coord;
	public int nbattaque =0;
	public Point[] attaque;
	private final static int taille = 3;

	
public destroyer (String name) 
{
	super(name, taille);
	this.coord = new Point [3];
	this.vie = VieBateau();
	Point p1 = firstpoint();
	this.coordX = (int) p1.getX();
	this.coordY = (int) p1.getY();	
	sens();
	this.sense = getsens();
	coord=ClcPts.coordpts(sense, p1);
	this.nbattaque =nbattaque;
	
	
	
}
// mettre les partie qui peuvent être commune dans bateu sans abstract


	@Override
	public
	int VieBateau() {
		
		//if toucher -1
		return vie;
	}
	
	

	public Point[] Puissancetire() 
	{
		
		int X = 0;
		while (X >= 15 || X <= 1) {
			Scanner sc = new Scanner(System.in);
			 X = sc.nextInt();
			if (X <0) System.out.println("non-valide");
		}
		
		
		int Y= 0;
		while (X >= 15 || X <= 1) {
			Scanner sc = new Scanner(System.in);
			 X = sc.nextInt();
			if (X <0) System.out.println("non-valide");
		}
		
		for (int i=0; i< 1; i++) {
			Point p4 = new Point(X, Y );
		attaque[i] = p4;
		}
		return attaque;
	}
	
	
	


}

