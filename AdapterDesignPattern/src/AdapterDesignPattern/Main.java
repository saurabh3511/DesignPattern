package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        //Chrome Driver
        ChromeDriver a =new ChromeDriver();
        a.getElement();
        a.selectElement();

        //internet explorer driver
        IEDriver e=new IEDriver();
        e.clickElement();
        e.findElement();

        //Adapter driver
        WebDriver wID=new WebDriverAdapter(e);
        wID.getElement();
        wID.selectElement();
    }
}
