import java.util.ArrayList;
import java.util.List;

public class TripleChocolat extends CoupeGlacee {

	    public static final TripleChocolat SINGLETON = new TripleChocolat();
	    public List<Parfum> parfums = new ArrayList<>();
	    private TripleChocolat() {
	        this.parfums.add(Parfum.CHOCOLAIT);
	        this.parfums.add(Parfum.CHOCONOIR);
	        this.parfums.add(Parfum.CHOCOBLANC);
	    }

	    @Override
	    public String description() {
	        return "Coupe chocolat blanc chocolat au lait chocolat noir";
	    }

	    @Override
	    public float cout() {
	        return 6;
	    }
	}