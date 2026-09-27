import java.util.Scanner;

public class RSVPMenu {
    public static void main(String[] args) {

    //Declare variables
    Scanner in= new Scanner(System.in);
    String mealChoice;


    //Display menu and get user's selection
    System.out.println("C - Chicken");
    System.out.println("F - Fish");
    System.out.println("V - Vegetarian");
    System.out.print("Enter your meal selection (C,F,or V): ");
    mealChoice = in.nextLine();

    //Determine meal based on selection
    if (mealChoice.equals ("C")) {
        System.out.println("You get the Chicken Parmesan.");

    } else if (mealChoice.equals("F")) {
        System.out.println("You get the Roast Salmon.");

    } else if (mealChoice.equals("V")) {
        System.out.println("You get the Butternut Squash.");

    } else {
        System.out.println("You entered an invalid meal selection: "+ mealChoice);

    }




    }
}