
public class VisiterPourLaPremiereFois implements ZoneVisitor {
	public void visiter(Ville v) {
		System.out.println("Je visite la premi�re fois la ville !");		
	 }
	public void visiter(ZoneTouristique zt) {
		System.out.println("Je visite la premi�re fois la zone touristique !"); 
	 }
	public void visiter(Parc p) {
		 System.out.println("Je visite la premi�re fois le parc !");
	 }
	public void visiter(Muse m) {
		System.out.println("Je visite la premi�re fois le mus� !");
	}
}
