import java.util.ArrayList;
import java.util.List;

public class FruitsRouges extends CoupeGlacee {

	    public static final FruitsRouges SINGLETON = new FruitsRouges();
	    public List<Parfum> parfums = new ArrayList<>();
	    private FruitsRouges() {
	        this.parfums.add(Parfum.CHOCOLAIT);
	        this.parfums.add(Parfum.CHOCONOIR);
	        this.parfums.add(Parfum.CHOCOBLANC);
	    }

	    @Override
	    public String description() {
	        return "Coupe fraise framboise cassis";
	    }

	    @Override
	    public float cout() {
	        return 5.5F;
	    }
	}