import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ville extends ZoneTouristique {
	
	protected List<ZoneTouristique> zones = new ArrayList<>();
	
	public void accept(ZoneVisitor zv) {
		zv.visiter(this);
        for(Iterator<ZoneTouristique> it = zones.iterator(); it.hasNext();) {
        	it.next().accept(zv);
        }
	}
	
	  public boolean ajouteZone(ZoneTouristique zone) {
		  this.zones.add(zone);
		  return true;
	  }
}
