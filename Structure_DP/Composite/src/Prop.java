import java.io.File;

public class Prop {

	public static void main(String[] args) {
		File directory = new File("./");
		   System.out.println(directory.getAbsolutePath());
		System.out.println("societe mère a 1 societe sans filiale avec 2 voitures et une societe avec filiales");
		System.out.println("societe avec filiales a 2 societe sans filiale avec 1 voiture chacun");
		SocieteSansFiliale s1= new SocieteSansFiliale();
		s1.ajouteVéhicule();
		s1.ajouteVéhicule();
		SocieteSansFiliale s2= new SocieteSansFiliale();
		s2.ajouteVéhicule();
		SocieteSansFiliale s3= new SocieteSansFiliale();
		s3.ajouteVéhicule();
		SocieteMere sm2 = new SocieteMere();
		sm2.ajouteFiliale(s2);
		sm2.ajouteFiliale(s3);
		SocieteMere sm1 = new SocieteMere();
		sm1.ajouteFiliale(sm2);
		sm1.ajouteFiliale(s1);
		System.out.println("Cout des voitures total de la société est: "+sm1.calculeCoûtEntretien());
	}

}
