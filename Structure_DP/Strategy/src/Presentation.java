import java.util.List;

public class Presentation {
	VueCatalogue methode;
	public void presenter(List<VueVehicule> voitures) {
		methode.dessine(voitures);
	}
	public void setMethode (VueCatalogue methode) {
		this.methode=methode;
	}
}
