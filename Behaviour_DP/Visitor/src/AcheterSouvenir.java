
public class AcheterSouvenir implements ZoneVisitor {
	public void visiter(Ville v) {
		System.out.println("La ville a accepté votre visite");
	 }
	public void visiter(ZoneTouristique zt) {
		System.out.println("La ZoneTouristique a accepté votre visite"); 
	 }
	public void visiter(Parc p) {
		 System.out.println("Le parc a accepté votre visite");
	 }
	public void visiter(Muse m) {
		System.out.println("Le Musé a accepté votre visite");
	}
}
