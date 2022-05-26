package FacadeDesignPattern;

public class Apple implements MobileShop {
    @Override
    public void Model() {
        System.out.println(" Model : Iphone 13");
    }

    @Override
    public void price() {
        System.out.println("Price : 95,000");
    }
}
