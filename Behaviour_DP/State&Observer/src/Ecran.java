
public class Ecran implements Observateur{
	
	private PorteDeGarage pg;
	
	public Ecran(PorteDeGarage pg) {
		this.pg=pg;
		afficher();
	}
	public void actualiser() {	
		afficher();
	}
	public void afficher() {
		System.out.println("Ecran: Porte à l'état: "+pg.message);
	}
}
