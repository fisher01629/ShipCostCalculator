import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double SHIPPING_TAX = .02;
        double shippingPrice = 0;
        String trash = "";
        System.out.print("What is the item price? $");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
            if(itemPrice >= 100)
            {
                shippingPrice = 0;
                System.out.println( "The shipping price is $" + shippingPrice + " and the total price is $" + (itemPrice + shippingPrice) );
            }
            else
            {
                shippingPrice = itemPrice * SHIPPING_TAX;
                itemPrice += shippingPrice;
                System.out.println( "The shipping price is " + shippingPrice + " and the total price is " + itemPrice );
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println( "You did not enter a valid number: "  + trash);
            System.out.println("Run the program agian and enter a valid number.");
        }
    }
}