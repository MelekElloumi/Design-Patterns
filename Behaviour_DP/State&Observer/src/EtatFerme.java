
public class EtatFerme extends EtatPorte{
	public EtatFerme(PorteDeGarage p) {
		super(p);
	}
	public void fermer() {
		System.out.println("Porte d�j� ferm�");
	}
	
	public void ouvrir() {
		System.out.println("Porte en cours d'ouverture");
		porte.setEtat(new EtatOuverture(porte),"Ouverture");
	}
}
