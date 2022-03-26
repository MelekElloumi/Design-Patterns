
public class Cafe extends Boisson {
	    private String varieté;

	    public Cafe(String vari) {
	        varieté = vari;
	    }

	    public float cout() {
	        return 1.5F;
	    }

	    public String description() {
	        return "Café "+ varieté;
	    }
}
