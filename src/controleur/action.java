package controleur;

import java.awt.Point;
import java.util.Scanner;

import modele.destroyer;

public class action 
{
	public void quelaction() {
		
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
				
				
				break; 
			case 2 :
				
				break;

	}

}
}
	void tir()
	{
		
	}
}





