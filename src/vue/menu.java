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
				System.out.println("non impl�menter");
				break;
			case 3 :
				System.out.println("Les r�gles de la bataille navale est la suivante :");
				System.out.println("our jouer � la Bataille Navale et quelle que soit la forme de celle-ci, chacun des deux joueurs dispose d'une grille o� il positionne ses bateaux et une grille sur laquelle il va noter les rep�res de chaque tir touch� ou dans l'eau. Ces grilles peuvent �tre consid�r�es comme des cartes maritimes permettant d'identifier les emplacements de bateaux.\r\n"
						+ "\r\n"
						+ "Les bateaux doivent �tre positionn�s de fa�on verticale ou horizontale sur une grille et jamais en diagonale. Ils doivent toujours �tre plac�s bien � l'int�rieur du plateau, ne doivent pas se toucher ni se superposer.\r\n"
						+ "\r\n"
						+ "Ce jeu  consiste � faire couler tous les bateaux de l'adversaire. La bataille commence en pla�ant tous les navires dans une grille secr�te. Chacun � leur tour, les joueurs doivent trouver et couler les bateaux adverses en communiquant les coordonn�es vis�es, compos�es d'une lettre puis d'un nombre. Il revient aux deux joueurs de d�cider qui va ouvrir les hostilit�s en premier." //selon la d�finition de Hasbro
						+ "\r\n"
						+ " la sp�cifit� ici est que tant qu'un bateau n'est pas touch� il est possible de le deplac� d'une case en avant ou en arri�rre celon sont sens de positionnement initiale"
						);
				break;
			case 4 : 
				test = false;
				
				break;
	}

}
	}
}
