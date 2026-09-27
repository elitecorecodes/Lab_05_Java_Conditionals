import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String [] args) {

        // Declare variables
        Scanner in=new Scanner(System.in);
        int age = 0;


        // Get the age from the user
        System.out.print("Enter your age: ");
         age = in.nextInt();


        // Determine if the user gets a wrist band
        if (age >= 21) {
            System.out.println("You get a wrist band.");

        }



    }
}
