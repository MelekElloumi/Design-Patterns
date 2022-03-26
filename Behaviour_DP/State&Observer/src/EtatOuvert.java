
public class EtatOuvert extends EtatPorte{
	public EtatOuvert(PorteDeGarage p) {
		super(p);
	}
	
	public void fermer() {
		System.out.println("Porte en cours de fermeture");
		porte.setEtat(new EtatFermeture(porte),"Fermeture");
	}
	
	public void ouvrir() {
		System.out.println("Porte déjà ouverte");
	}
}
