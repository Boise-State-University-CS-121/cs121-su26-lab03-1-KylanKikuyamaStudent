import java.util.Scanner;

public class SphereCalculator 
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        //Input Processing
        System.out.print("Enter the sphere's radius: ");
        double radius = kbd.nextDouble();

        //Math Processing
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2.0);

        //Output Processing
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface area: %.4f\n" , surfaceArea);


    }   
}
