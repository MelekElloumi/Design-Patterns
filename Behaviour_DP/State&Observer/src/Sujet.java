import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sujet {
	protected List<Observateur> obs = new ArrayList<>();
	
	public void ajouteObservateur(Observateur o){
		this.obs.add(o);
	}
	
	public void notifie() {
        for(Iterator<Observateur> it = obs.iterator(); it.hasNext();) {
        	it.next().actualiser();
        }
	}
	
	public void retireObservateur(Observateur o){
		this.obs.remove(o);
	}
}
