package vue;

import java.util.Scanner;



public class menu {
	public static void main(String[] args) 
	{
		boolean test = true;
		while(test == true )
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("taper (1) jouer une partie");
			System.out.println("taper (2) charger une partie");
			System.out.println("taper (3) aide");
			System.out.println("taper (4) quiter");
			System.out.println("que faire ? :");
			
			int choix = sc.nextInt();
			if (choix <0) System.out.println("non-valide");
		
			switch(choix)

			{
				
			
			case 1:
				
				break; 
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 : 
				test = false;
				
				break;
	}

}
	}
}
