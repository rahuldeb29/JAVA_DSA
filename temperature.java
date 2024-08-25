
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Farheinheit: ");
        double farhenheit = input.nextDouble();
        double celcius = (farhenheit - 32) * 5 / 9;
        System.out.println("the temperature in celcius is: " + celcius);
    }
}