import java.util.Random;
import java.util.Scanner;

public class AccountGenerator 
{
 
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Random myGen = new Random();

        //Input Processing
        System.out.print("Enter your first name: ");
        String userFirstName = kbd.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = kbd.nextLine();

        //Convert user inputs to lowercase
        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();

        //Grab characters from user input
        char firstLetter = userFirstName.charAt(0);
        String firstFiveLast = userLastName.substring(0,5);

        //Random number generator
        int randomInteger = myGen.nextInt(90) + 10;

        //Output Processing
        String username = firstLetter + firstFiveLast + randomInteger;
        System.out.println("Username: " + username);

        kbd.close();
    }
}
