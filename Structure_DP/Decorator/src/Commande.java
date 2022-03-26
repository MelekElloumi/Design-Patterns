import java.io.*;
import java.util.*;

public class Commande {
     protected List<IProduit> lesProd= new ArrayList<>();
     public void addProd(IProduit prod) {
    	 lesProd.add(prod);
     }
	 public void publieFacture(PrintWriter writer) {
		float total = 0;
		for (Iterator<IProduit> it = this.lesProd.iterator(); it.hasNext();) {
			IProduit prod = (IProduit) it.next();
		writer.println(prod.description()+" + "+prod.cout());
		total = total + prod.cout();
		}
		writer.println(" TOTAL : "+total);
		}

}
