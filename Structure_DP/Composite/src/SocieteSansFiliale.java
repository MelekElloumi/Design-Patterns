
public class SocieteSansFiliale extends Societe {
	
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}
	
	public double calculeCoûtEntretien() {
		return nbrVéhicules*coûtUnitVéhicule;
	}
}
