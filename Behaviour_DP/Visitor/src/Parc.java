
public class Parc extends ZoneTouristique {
	public void accept(ZoneVisitor zv) {
		zv.visiter(this);
	}
}
