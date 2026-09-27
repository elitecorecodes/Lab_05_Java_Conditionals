import java.util.Scanner;
public class ShipCostCalculator {

    public static void main(String[] args) {

        //Declare variables
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;

        //Get the item price from the user
        System.out.print("Enter the price of the item: $");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

        } else {
            String trash = in.nextLine();
            System.out.println("You entered an invalid price: " + trash);
            System.out.println("Run the program again and enter a valid amount.");
            return;

        }
        //Determine the shipping cost
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

         //Calculate the total price
        totalPrice = itemPrice + shippingCost;

        //Display the shipping cost
        System.out.printf("Shipping Cost: $%.2f%n" , shippingCost);



        //Display the total price
        System.out.printf("Total Price: $%.2f%n" , totalPrice);









    }
}
