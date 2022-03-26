import java.util.*;

public class SocieteMere extends Societe{
	protected List<Societe> filiales = new ArrayList<>();
	  public double calculeCo�tEntretien() {
		  double cout=nbrV�hicules*co�tUnitV�hicule;
	        for(Iterator<Societe> it = filiales.iterator(); it.hasNext();) {
	        	cout+=it.next().calculeCo�tEntretien();
	        }
	        return cout;
	  }

	  public boolean ajouteFiliale(Societe filiale) {
		  this.filiales.add(filiale);
		  return true;
	  }
}
