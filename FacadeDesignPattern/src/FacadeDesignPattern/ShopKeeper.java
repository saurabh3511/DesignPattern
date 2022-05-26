package FacadeDesignPattern;

public class ShopKeeper  {

    private MobileShop apple;
    private MobileShop  nokia;
    private MobileShop samsung;

    public ShopKeeper() {
        apple = new Apple();
        nokia = new Nokia();
        samsung = new Samsung();
    }

    public void appleSale() {
        apple.Model();
        apple.price();
    }

    public void nokiaSale() {
        nokia.Model();
        nokia.price();
    }

    public void samsungSale() {
        samsung.Model();
        samsung.price();
    }
}