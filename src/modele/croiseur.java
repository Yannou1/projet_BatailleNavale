package modele;

import java.awt.Point;
import java.util.Scanner;
/**
 * Croiseur 
 * @author Yanis
 *
 */
public class croiseur extends Bateau {
	public int sense;
	public int coordX;
	public int coordY;
	public Point[] coord;
	public int nbattaque =0;
	public Point[] attaque;
	private final static int taille = 5;
	destroyer destroyer ;
	
	/**
	 * contruit un croiseur 
	 * @param name
	 * du nom du croiseur (cr+nombre)
	 */
	public croiseur(String name) {
		super(name, taille);
		this.coord = new Point [taille];
		this.attaque = new Point [5];
		this.vie = VieBateau(0);
		Point p1 = firstpoint();
		this.coordX = (int) p1.getX();
		this.coordY = (int) p1.getY();	
		sens();
		this.sense = getsens();
		coord=ClcPts.coordpts(sense, p1, taille);
	}


	@Override
	public
	int VieBateau(int toucher) {
		this.vie = vie - toucher;
		return vie;
	}

	@Override
	public void Puissancetire() {
		
			
			int X = 0;
			while (X > 15 || X < 1) 
			{
				Scanner sc1 = new Scanner(System.in);
				 X = sc1.nextInt();
				if (X <0) System.out.println("non-valide");
			}
			
			
			int Y= 0;
			while (Y > 15 || Y < 1)
			{
				Scanner sc = new Scanner(System.in);
				 Y= sc.nextInt();
				if (X <0) System.out.println("non-valide");
			}
			
				Point p1 = new Point(X, Y );
				attaque[0] = p1;
				Point p2 = new Point(X +1, Y );
				attaque[1] = p2;
				Point p3 = new Point(X -1, Y );
				attaque[2] = p3;
				Point p4 = new Point(X , Y +1);
				attaque[3] = p4;
				Point p5 = new Point(X , Y -1);
				attaque[4] = p5;
			
			
			}
	}


