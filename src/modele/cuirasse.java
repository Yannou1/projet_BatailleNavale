package modele;

import java.awt.Point;
import java.util.Scanner;

public class cuirasse extends Bateau {
	public int sense;
	public int coordX;
	public int coordY;
	public Point[] coord;
	public int nbattaque =0;
	public Point[] attaque;
	private final static int taille = 7;
	destroyer destroyer ;
	
	cuirasse(String name, int taille) {
		super(name, taille);
		this.coord = new Point [3];
		this.attaque = new Point [1];
		this.vie = VieBateau(0);
		Point p1 = firstpoint();
		this.coordX = (int) p1.getX();
		this.coordY = (int) p1.getY();	
		sens();
		this.sense = getsens();
		coord=ClcPts.coordpts(sense, p1, taille);
		// TODO Auto-generated constructor stub
	}

	@Override
	int VieBateau(int toucher) {
		this.vie = vie - toucher;
		return vie;
	}

	@Override
	public void Puissancetire() {
		
			
			int X = 0;
			while (X > 15 || X < 1) {
				Scanner sc1 = new Scanner(System.in);
				 X = sc1.nextInt();
				if (X <0) System.out.println("non-valide");
			}
			
			
			int Y= 0;
			while (Y > 15 || Y < 1) {
				Scanner sc = new Scanner(System.in);
				 Y= sc.nextInt();
				if (X <0) System.out.println("non-valide");
			}
			
			for (int i=0; i< 1; i++) {
				Point p4 = new Point(X, Y );
			attaque[i] = p4;
			}
		}
}
	
	
	
	

