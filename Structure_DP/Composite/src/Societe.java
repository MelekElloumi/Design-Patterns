
public abstract class Societe{
  protected static double co�tUnitV�hicule= 5.0;
  protected int nbrV�hicules;

  public void ajouteV�hicule(){
    nbrV�hicules=nbrV�hicules + 1 ;
  }

  public abstract double calculeCo�tEntretien() ;

  public abstract boolean ajouteFiliale(Societe filiale) ;
}
