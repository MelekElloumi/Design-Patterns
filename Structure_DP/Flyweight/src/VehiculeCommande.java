import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehiculeCommande {
	protected List<OptionVehicule> options = new ArrayList<>();
	protected List< Double > prixDeVenteOptions = new ArrayList<>();
	
	public void afficheOption(){
        Iterator<OptionVehicule> it1 = options.iterator(); 
        Iterator<Double> it2 = prixDeVenteOptions.iterator() ; 
        int i=1;
        	
        while(it1.hasNext() && it2.hasNext()) {
        	it1.next().afficher(it2.next(),i);
        	i++;
        }
	}
	
	public void ajouteOption(FabriqueOption fb, double prixDeVente, String nom) {
		options.add(fb.getOption(nom));
		prixDeVenteOptions.add(prixDeVente);
	}
}
