import java.io.*;

public class Glacier {

	public static void main(String[] args) {
		Commande cmd = new Commande() ;
		Cafe caf=new Cafe("Arabica");
		cmd.addProd(new Chantilly(caf));	
		cmd.addProd(new Chantilly(new CoulisFraise(FruitsRouges.SINGLETON)));
		cmd.addProd(TripleChocolat.SINGLETON);
		Cafe caf2=new Cafe("Robusta");
		cmd.addProd(caf2);	
		cmd.addProd(new Chantilly(ChocolatChaud.SINGLETON));
		PrintWriter writer = new PrintWriter(System.out);
		cmd.publieFacture(writer);
		writer.flush();
	}

}
