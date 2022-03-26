import java.util.Iterator;
import java.util.List;

public class UneLigneCatalogue implements VueCatalogue {

	public void dessine(List<VueVehicule> voitures) { 
        for(Iterator<VueVehicule> it = voitures.iterator(); it.hasNext();) {
        	it.next().dessine(); 
        	System.out.println(); 
        }
		System.out.println(); 		   
	}
}
