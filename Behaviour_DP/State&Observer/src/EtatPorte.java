
public abstract class EtatPorte {
	PorteDeGarage porte;
	
	public EtatPorte(PorteDeGarage p) {
		porte=p;
	}
	abstract public void fermer();
	abstract public void ouvrir();
	
}
