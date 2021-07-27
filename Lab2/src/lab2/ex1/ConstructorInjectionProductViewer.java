package lab2.ex1;

public class ConstructorInjectionProductViewer implements ProductViewer {

	private Product product1;
	private Product product2;
	
	
    public ConstructorInjectionProductViewer(Product product1, Product product2) {
		super();
		this.product1 = product1;
		this.product2 = product2;
	}



	public void showProduct(){
        System.out.println(product1);
        System.out.println(product2);
    }

}
