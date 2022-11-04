package controleur;

import java.awt.Point;
import java.util.Scanner;

import modele.destroyer;

public class action {
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
