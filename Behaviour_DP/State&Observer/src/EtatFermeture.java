
public class EtatFermeture extends EtatPorte{
	public EtatFermeture(PorteDeGarage p) {
		super(p);
	}
	public void fermer() {
		
		
		System.out.println("Porte s'est ferm�");
		porte.setEtat(new EtatFerme(porte),"Ferm�");
	}
	
	public void ouvrir() {

		System.out.println("Attendez, porte en cours de fermeture");
	}
}
