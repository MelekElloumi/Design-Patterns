
public class Utilisateur {
	public static void main(String[] args) {
		PorteDeGarage p = new PorteDeGarage();
		Ecran e = new Ecran(p);
		p.ajouteObservateur(e);
		p.fermerPorte();
		p.ouvrirPorte();
		p.fermerPorte();
		p.ouvrirPorte();
		
		p.ouvrirPorte();
		p.fermerPorte();
		p.ouvrirPorte();
		p.fermerPorte();
		
		
	}
}
