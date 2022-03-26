import java.util.*;
public class FabriqueOption {
	Map<String, OptionVehicule> options = new HashMap<String, OptionVehicule>();
	
	public OptionVehicule getOption(String nom){
		if ( options.get(nom) !=null)
			return options.get(nom);
		else {
			OptionVehicule nouvelleOption=new OptionVehicule(nom);
			options.put(nom, nouvelleOption);
			return nouvelleOption;
		}
	}
}
