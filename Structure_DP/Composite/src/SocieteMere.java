import java.util.*;

public class SocieteMere extends Societe{
	protected List<Societe> filiales = new ArrayList<>();
	  public double calculeCoûtEntretien() {
		  double cout=nbrVéhicules*coûtUnitVéhicule;
	        for(Iterator<Societe> it = filiales.iterator(); it.hasNext();) {
	        	cout+=it.next().calculeCoûtEntretien();
	        }
	        return cout;
	  }

	  public boolean ajouteFiliale(Societe filiale) {
		  this.filiales.add(filiale);
		  return true;
	  }
}
