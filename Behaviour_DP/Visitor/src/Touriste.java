
public class Touriste {

	public static void main(String[] args) {
		Ville v1 = new Ville();
		Parc p1 = new Parc();
		Muse m1 = new Muse();
		ZoneTouristique zt1 = new ZoneTouristique();
		ZoneTouristique zt2 = new ZoneTouristique();
		v1.ajouteZone(zt1);
		v1.ajouteZone(zt2);
		AcheterSouvenir ach = new AcheterSouvenir();
		VisiterPourLaPremiereFois vppf = new VisiterPourLaPremiereFois();
		v1.accept(ach);
		v1.accept(vppf);
		p1.accept(ach);
		p1.accept(vppf);
		m1.accept(ach);
		m1.accept(vppf);
		
	}

}
