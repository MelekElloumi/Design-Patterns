
public class Cafe extends Boisson {
	    private String variet�;

	    public Cafe(String vari) {
	        variet� = vari;
	    }

	    public float cout() {
	        return 1.5F;
	    }

	    public String description() {
	        return "Caf� "+ variet�;
	    }
}
