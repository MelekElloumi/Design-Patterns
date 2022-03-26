
public abstract class Societe{
  protected static double coûtUnitVéhicule= 5.0;
  protected int nbrVéhicules;

  public void ajouteVéhicule(){
    nbrVéhicules=nbrVéhicules + 1 ;
  }

  public abstract double calculeCoûtEntretien() ;

  public abstract boolean ajouteFiliale(Societe filiale) ;
}
