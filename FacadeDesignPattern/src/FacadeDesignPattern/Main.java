package FacadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    private static int  choice;

    public static void main(String[] args)throws NumberFormatException, IOException {


        do{
            System.out.println( "========= MobileShop============           \n");
            System.out.print("            1. Apple.              \n");
            System.out.print("            2. Nokia.              \n");
            System.out.print("            3. Samsung.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    shopKeeper.appleSale();
                }
                break;
                case 2:
                {
                    shopKeeper.nokiaSale();
                }
                break;
                case 3:
                {
                    shopKeeper.samsungSale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
    }
}
