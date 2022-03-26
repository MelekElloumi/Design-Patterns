
public class Client {
	public static void main(String[] args) {
		FabriqueOption fb=new FabriqueOption();
		VehiculeCommande v1= new VehiculeCommande();
		v1.ajouteOption(fb, 50, "Roue" );
		v1.ajouteOption(fb, 10, "Bluetooth");
		v1.ajouteOption(fb, 20, "Vitesse");		
		VehiculeCommande v2= new VehiculeCommande();
		v2.ajouteOption(fb, 40, "Roue");
		v2.ajouteOption(fb, 30, "Bluetooth");
		v2.ajouteOption(fb, 40, "Chaise cuir");
		System.out.println("Options de voiture 1:");
		v1.afficheOption();
		System.out.println("\nOptions de voiture 2:");
		v2.afficheOption();
		
	}
}
