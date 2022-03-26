
public class Muse extends ZoneTouristique {
	public void accept(ZoneVisitor zv) {
		zv.visiter(this);
	}
}