import java.util.Iterator;
import java.util.List;

public class TroisLigneCatalogue implements VueCatalogue {

	public void dessine(List<VueVehicule> voitures) {
		int compteur=0;
        for(Iterator<VueVehicule> it = voitures.iterator(); it.hasNext();) {
        	it.next().dessine(); 
        	System.out.print(" "); 
        	compteur++;
        	if(compteur==3) {
        		System.out.println(); 
        		compteur=0;
        	}
        }
		System.out.println(); 		   
	}
}
