
public class SocieteSansFiliale extends Societe {
	
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}
	
	public double calculeCo�tEntretien() {
		return nbrV�hicules*co�tUnitV�hicule;
	}
}
