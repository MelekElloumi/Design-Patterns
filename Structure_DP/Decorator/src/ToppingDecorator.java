
public abstract class ToppingDecorator extends CoupeGlacee {
	 public IProduit decoratedProduit;
	 public ToppingDecorator (IProduit decoratedProduit) {
		 this.decoratedProduit = decoratedProduit;
	 }
	 abstract public float cout();
	 abstract public String description();
}
