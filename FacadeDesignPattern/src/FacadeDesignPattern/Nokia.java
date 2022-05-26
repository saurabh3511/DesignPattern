package FacadeDesignPattern;

public class Nokia implements MobileShop{

    @Override
    public void Model() {
        System.out.println(" Model : Nokia 8 Amc9812");
    }

    @Override
    public void price() {
        System.out.println("Price : 27,000");
    }
}
