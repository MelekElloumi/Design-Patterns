
public class OptionVehicule {
   protected String nom;
   
   public void afficher(double prix, int pos) {
	   System.out.println("-Option "+pos+":\n  *Nom: "+nom+"\n  *Prix: "+prix);
   }
   public OptionVehicule(String nom) {
	   this.nom=nom;

   }

}
