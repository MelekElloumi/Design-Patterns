
public class Chantilly extends ToppingDecorator{

	public Chantilly (IProduit prod){
		super(prod);
	}
	public float cout() {
		return this.decoratedProduit.cout() + 0.5F;
	}
	public String description() {
		return this.decoratedProduit.description() + " chantilly";
	}
}
