
public class ChocolatChaud extends Boisson  {
    public static final ChocolatChaud SINGLETON = new ChocolatChaud();

    public float cout() {
        return 2F;
    }

    public String description() {
        return "Chocolat chaud";
    }
}
