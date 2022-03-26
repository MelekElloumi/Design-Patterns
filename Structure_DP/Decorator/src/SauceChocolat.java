
public class SauceChocolat extends ToppingDecorator{

	public SauceChocolat (IProduit prod){
		super(prod);
	}
	public float cout() {
		return this.decoratedProduit.cout() + 0.7F;
	}
	public String description() {
		return this.decoratedProduit.description() + " et sa délicieuse sauce chocolat";
	}
}
