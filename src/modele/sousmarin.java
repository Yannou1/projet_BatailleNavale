package modele;

import java.awt.Point;

public class sousmarin extends Bateau{

	public int sense;
	public int coordX;
	public int coordY;
	public Point[] coord;
	public int nbattaque =0;
	public Point[] attaque;
	private final static int taille = 1;

	public sousmarin(String name) {
		super(name, taille);
		this.coord = new Point [1];
		this.vie = VieBateau(0);
		Point p1 = firstpoint();
		this.coordX = (int) p1.getX();
		this.coordY = (int) p1.getY();	
		sens();
		this.sense = getsens();
		coord=ClcPts.coordpts(sense, p1, taille);	
		this.nbattaque =nbattaque;
		
	}


	@Override
	int VieBateau(int tt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public
	Point[] Puissancetire() {
		// TODO Auto-generated method stub
		return null;
	}

}
