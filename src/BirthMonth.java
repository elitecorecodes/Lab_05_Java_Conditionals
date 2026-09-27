import java.util.Scanner;
public class BirthMonth {
    public static void main(String [] args) {

        //Declare variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        //Get the birth month from the user
        System.out.print("Enter your birth month (1-12): ");
        birthMonth = in.nextInt();

        //Determine if the birth month is valid
        if (birthMonth >=1 && birthMonth <=12) {
        System.out.println("Your birth month is: " + birthMonth);

        }else {
            System.out.println("You entered an incorrect month value: " + birthMonth);

        }
    }
}
