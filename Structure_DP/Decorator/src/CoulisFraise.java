
public class CoulisFraise extends ToppingDecorator{

	public CoulisFraise (IProduit prod){
		super(prod);
	}
	public float cout() {
		return this.decoratedProduit.cout() + 1F;
	}
	public String description() {
		return this.decoratedProduit.description() + " au coulis de fraises fraiches";
	}
}