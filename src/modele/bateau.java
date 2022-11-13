package modele;

import java.awt.Point;
import java.util.Scanner;
/**
 * classe m�re abstraite dont tout les bateau h�rite
 * @author Yanis
 *
 */
public abstract class Bateau {
	protected  int vie;
	private final int taille;
	private final String name;
	static int sens;
	final static int DROITE = 1;
	final static int GAUCHE = 2;
	final static int HAUT = 3; 
	final static int BAS = 4;
	Point p1;
	/**
	 * constucteur de bateau 
	 * @param name
	 * nom du bateau
	 * @param taille
	 * taille du bateau
	 */
	Bateau(String name, int taille)
	{
		this.name = name;
		this.taille = taille;
		/**
		 * dans la bataille navale la vie du bateau �quivaut � �a longeur 
		 */
		this.vie=taille;
	}
	
	public String getName()
	{
		return this.name;
	
	}
	public int gettaille() {
		return this.taille;
	}
	public int getsens()
	{
		return sens;
	}
	
	public int getvie()
	{
		return this.vie;
	}
	
	
	public Point getpoint() 
	{
		return p1;
		
	}
	/**
	 * m�thode abstraite permettant de connaitre la vie du bateau
	 * @param attaque
	 * nombre de d�gat subit
	 * @return
	 */
	abstract int VieBateau(int attaque);
	
	/**
	 * permettant de connaitre la zone qui est touch� lors d'un tire de bateau
	 */
	public abstract void Puissancetire() ;
	

	
	/**
	 * demande le sens du bateau souhait�
	 *
	 * @return
	 * le sens choisit
	 */
	protected static int sens()
	{
		sens = 0;
			while(sens == 0 )
			{
				Scanner sc = new Scanner(System.in);
				System.out.printf("taper (%d) droite", DROITE);
				System.out.printf("taper (%d) gauche", GAUCHE);
				System.out.printf("taper (%d) haut", HAUT);
				System.out.printf("taper (%d) bas", BAS);
				System.out.println("que faire ? :");
				
				int choix = sc.nextInt();
				if (choix <0) System.out.println("non-valide");
			
				switch(choix)

				{
				case 1:
					sens = DROITE;
					break;
				case 2 :
					sens = GAUCHE;
					break;
				case 3 :
					sens = HAUT;
					break;
				case 4 : 
					sens = BAS;
					break;
				}
				
			}
			return sens;
		 
	}
	
	/**
	 * calcul le premier point de chaque bateau en fonction des points X et Y rentr�
	 * @return
	 * retourne un point 
	 */
	 Point firstpoint() {
		
		int X = 0;
		while (X > 15 || X < 1) {
			System.out.println(" Coordonn� X pour " +getName()+": ");
			Scanner sc = new Scanner(System.in);
			 X = sc.nextInt();
			if (X <0) System.out.println("non-valide");
		}

				
				int Y = 0;
				while (Y > 15 || Y < 1) {
					System.out.println(" Coordonn� Y pour " +getName()+": ");
					Scanner sc = new Scanner(System.in);
					 Y = sc.nextInt();
					if (Y <0) System.out.println("non-valide");
				}
				Point p1 = new Point (X,Y);
				return p1;
			}
	
}
	
	
	
	
	
	
		
	

