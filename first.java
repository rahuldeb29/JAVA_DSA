
import java.util.Scanner;
public class first {
    //public static void main(String[] args){
    //Scanner input = new Scanner(System.in);
    //  System.out.print("Enter the first number: ");
    //int num1 = input.nextInt();
    //System.out.print("Enter the second number: ");
    //int num2 = input.nextInt();
    //var num3=num1+num2;
    //System.out.println("total is: " +num3);


    //}
    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = calculate.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = calculate.nextDouble();
        System.out.println("enter the operator( +, -, *, /): ");
        char operator = calculate.next().charAt(0);

        switch (operator) {
            case '+':
                double result = num1 + num2;
                System.out.println("The result after adding two numbers is: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result after substracting is: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result after multiplying two numbers is: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result after dividing two numbers is: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cant divide by ZERO");
                }
                break;
            default:
                System.out.println("Invalid oprator");
                break;
        }
    }
}