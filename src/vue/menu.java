package vue;

import java.util.Scanner;

import controleur.Nvlpartie;



public class menu {
	public static void main()
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
				Nvlpartie.partie();
				break; 
			case 2 :
				System.out.println("non implémenter");
				break;
			case 3 :
				System.out.println("Les régles de la bataille navale est la suivante :");
				System.out.println("our jouer à la Bataille Navale et quelle que soit la forme de celle-ci, chacun des deux joueurs dispose d'une grille oû il positionne ses bateaux et une grille sur laquelle il va noter les repères de chaque tir touché ou dans l'eau. Ces grilles peuvent être considérées comme des cartes maritimes permettant d'identifier les emplacements de bateaux.\r\n"
						+ "\r\n"
						+ "Les bateaux doivent être positionnés de façon verticale ou horizontale sur une grille et jamais en diagonale. Ils doivent toujours être placés bien à l'intérieur du plateau, ne doivent pas se toucher ni se superposer.\r\n"
						+ "\r\n"
						+ "Ce jeu  consiste à faire couler tous les bateaux de l'adversaire. La bataille commence en plaçant tous les navires dans une grille secrète. Chacun à leur tour, les joueurs doivent trouver et couler les bateaux adverses en communiquant les coordonnées visées, composées d'une lettre puis d'un nombre. Il revient aux deux joueurs de décider qui va ouvrir les hostilités en premier." //selon la définition de Hasbro
						+ "\r\n"
						+ " la spécifité ici est que tant qu'un bateau n'est pas touché il est possible de le deplacé d'une case en avant ou en arriérre celon sont sens de positionnement initiale"
						);
				break;
			case 4 : 
				test = false;
				
				break;
	}

}
	}
}
