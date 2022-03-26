
public interface ZoneVisitor {
	abstract public void visiter(Ville v);
	abstract public void visiter(ZoneTouristique zt);
	abstract public void visiter(Parc p);
	abstract public void visiter(Muse m);
}
