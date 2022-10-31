package vue;


public class grille {
	String c = "";
	private String [] [] grille;
	int coordXdepl = 0;
	int coordYdepl = 0;
	
	
public grille()	{
	
grille = new String [16] [16];

for (int i= 1; i< 16; i++) {	
	for (int j= 1; j< 16; j++) {
		grille [i] [j] = null ;
		
}
}

} 


public void placement (int coordX, int coordY, String lettre, int taille, int sens) {
	if (sens==1)
	{
	
grille [coordX] [coordY] = lettre;		

for (int longu =0; longu< taille-1; longu++) {
	taille --;
	coordYdepl ++;
	placement (coordX,  coordY+1,  lettre,  taille,  sens);
}
}
	if (sens==2)
	{
	
grille [coordX] [coordY] = lettre;		

for (int longu =0; longu< taille-1; longu++) {
	taille --;
	coordYdepl ++;
	placement (coordX,  coordY-1,  lettre,  taille,  sens);
}
}
	if (sens==3)
	{
	
grille [coordX] [coordY] = lettre;		

for (int longu =0; longu< taille-1; longu++) {
	taille --;
	coordXdepl ++;
	placement (coordX-1,  coordY,  lettre,  taille,  sens);
}
}
	if (sens==4)
	{
	
grille [coordX] [coordY] = lettre;		

for (int longu =0; longu< taille-1; longu++) {
	coordXdepl ++;
	taille --;
	
	placement (coordX+1,  coordY,  lettre,  taille,  sens);
}
}
		
	
}



public void affiche() {
	
	System.out.println();
	for (int i= 1; i< 16; i++) {
		for (int j= 1; j< 16; j++) {
			if (grille [i] [j] == null ) {
				grille [i] [j] = "";
			System.out.print("_|_"+ grille [i] [j]);
		
			}
			else 
				System.out.print( grille [i] [j] + "|");
			
		}
		System.out.println("_|");

	}
	System.out.println();

}




}
