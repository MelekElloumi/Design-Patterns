
public class PorteDeGarage extends Sujet{
	private EtatPorte etat;
	protected String message;
	public PorteDeGarage(){
		message="Ferm�";
		etat= new EtatFerme(this);
		System.out.println("Porte Ferm�e au d�but");
		notifie();
	}
	
	public void fermerPorte() {
		System.out.print("Demande de fermer:   ");
		etat.fermer();
	}
	public void ouvrirPorte() {
		System.out.print("Demande d'ouvrir:   ");
		etat.ouvrir();
	}
	public void setEtat(EtatPorte e, String mes){
		message=mes;
		etat=e;
		notifie();
	}
}
