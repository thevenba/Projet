package fr.iutvalence.java.tp.rushhour;

/**
 * Un plateau de niveau 1
 * 
 * @author thevenba
 * @version 1.1.0
 */
public class Niveau1 extends Plateau {
	
	/**
	 * 
	 */
	public Niveau1()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creerVehicules()
	{
		this.nbVehicules = 8;
        this.vehicules = new Vehicule[this.nbVehicules];
		this.vehicules[0] = new Vehicule(Vehicule.HORIZONTALE, 2, Couleur.ROUGE, new Position(2,2));
		this.vehicules[1] = new Vehicule(Vehicule.HORIZONTALE, 2, Couleur.BLEU_CLAIR, new Position(4,5));
		this.vehicules[2] = new Vehicule(Vehicule.VERTICALE, 3, Couleur.BLEU_FONCE, new Position(3,3));
		this.vehicules[3] = new Vehicule(Vehicule.VERTICALE, 3, Couleur.JAUNE, new Position(2,5));
		this.vehicules[4] = new Vehicule(Vehicule.VERTICALE, 2, Couleur.ORANGE, new Position(5,0));
		this.vehicules[5] = new Vehicule(Vehicule.HORIZONTALE, 2, Couleur.VERT_CLAIR, new Position(0,1));
		this.vehicules[6] = new Vehicule(Vehicule.HORIZONTALE, 3, Couleur.VERT_FONCE, new Position(5,4));
		this.vehicules[7] = new Vehicule(Vehicule.VERTICALE, 3, Couleur.VIOLET, new Position(3,0));
	}
}
