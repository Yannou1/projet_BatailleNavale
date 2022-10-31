package modele;

import java.awt.Point;

import java.util.Scanner;

public class destroyer extends bateau {
public int vie;
public int taille;
public String name;
public int sense;
public int coordX;
public int coordY;
public Point[] coord;


public destroyer (String name) {
	this.coord = new Point [5];
	this.name = name;
	this.taille =taille();
	this.vie = VieBateau();
	this.coordX=coordonneX();
	this.coordY=coordonneY();
	this.sense =sens();
	
	if (sense == 1) {
	for (int i=0; i<= 4; i++) {
		Point p1 = new Point(this.coordY+i, this.coordX );
		this.coord[i] =  p1;
	}}
	if (sense == 2) {
		for (int i=0; i<= 4; i++) {
			Point p2 = new Point(this.coordY-i, this.coordX );
		this.coord[i] =p2 ;
		}
		}
	if (sense == 3) {
		for (int i=0; i<= 4; i++) {
			Point p3 = new Point(this.coordY, this.coordX-i );
		this.coord[i] = p3 ;}
		}
	if (sense == 4) {
		for (int i=0; i<= 4; i++) {
			Point p4 = new Point(this.coordY, this.coordX+i );
		this.coord[i] = p4 ;
		}
		}
	

	
	
	
}

	@Override
	public
	String Namebateau() {
	while (taille >0) {
		return name;
	}
	String o = "";
	return o;
	}

	@Override
	int Puissancetire() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public
	int VieBateau() {
		int vie =5;
		//if toucher -1
		return vie;
	}
	@Override
	int taille() {
		int taille= 5;
		return 0;
	}

	
	@Override
	int coordonneX() {
		System.out.println("X : ");
		int X = 0;
		while (X >= 15 || X < 1) {
			System.out.println("1 : ");
			Scanner sc = new Scanner(System.in);
			 X = sc.nextInt();
			if (X <0) System.out.println("non-valide");
		}
		return X;
			}
	
	
	@Override
	 int coordonneY() {
		System.out.println("Y : ");
		int Y = 0;
		while (Y >= 15 || Y <= 1) {
			Scanner sc = new Scanner(System.in);
			 Y = sc.nextInt();
			if (Y <0) System.out.println("non-valide");
		}
		return Y;
	}
	
	
	@Override
	int sens() {
		int sens =0;
		while(sens == 0 )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("taper (1) droite");
			System.out.println("taper (2) gauche");
			System.out.println("taper (3) haut");
			System.out.println("taper (4) bas");
			System.out.println("que faire ? :");
			
			int choix = sc.nextInt();
			if (choix <0) System.out.println("non-valide");
		
			switch(choix)

			{
				
			
			case 1:
				sens = 1;
				
				break; 
			case 2 :
				sens = 2;
				
				break;
			case 3 :
				sens = 3;
				
				break;
				
			case 4 : 
				sens = 4;
		
	}
			
		}
		return sens;
	}

}
