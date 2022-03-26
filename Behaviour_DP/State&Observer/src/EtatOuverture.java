
public class EtatOuverture extends EtatPorte{
	public EtatOuverture (PorteDeGarage p) {
		super(p);
	}
	
	public void fermer() {
		System.out.println("Attendez, porte en cours d'ouverture");
	}
	
	public void ouvrir() {
		
		System.out.println("Porte s'est ouvert");
		porte.setEtat(new EtatOuvert(porte),"Ouvert");
		
	}
}
