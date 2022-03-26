import java.util.*;
public class Client {

	public static void main(String[] args) {
		VueCatalogue cUn = new UneLigneCatalogue();
		VueCatalogue cTrois = new TroisLigneCatalogue();
		Presentation presentation = new Presentation();
		List<VueVehicule> voitures = new ArrayList();
		voitures.add(new VueVehicule("Voiture1"));
		voitures.add(new VueVehicule("Voiture2"));
		voitures.add(new VueVehicule("Voiture3"));
		voitures.add(new VueVehicule("Voiture4"));
		voitures.add(new VueVehicule("Voiture5"));
		voitures.add(new VueVehicule("Voiture6"));
		voitures.add(new VueVehicule("Voiture7"));
		
		System.out.println("Dessiner une voiture par ligne:");
		presentation.setMethode(cUn);
		presentation.presenter(voitures);
		System.out.println("Dessiner trois voiture par ligne:");
		presentation.setMethode(cTrois);
		presentation.presenter(voitures);
	}

}
