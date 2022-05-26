package FacadeDesignPattern;

public class Samsung implements MobileShop{

    @Override
    public void Model() {
        System.out.println(" Model : Samsung Galaxy S20 FE");
    }

    @Override
    public void price() {
        System.out.println("Price : 37,000");
    }
}
