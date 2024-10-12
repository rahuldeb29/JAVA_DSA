import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = n.nextInt();
        System.out.print("Enter the number to be checked: ");
        int check = n.nextInt();
        System.out.print("Enter another number to be checked :");
        int another = n.nextInt();

        int firstCount = 0;
        int secondCount = 0;
        System.out.println("You entered the number " + number);

        while (number>0) {

            int rem = number % 10;
            if (rem == check) {
                firstCount++;
            } else if (rem==another) {
                secondCount++;
            }
            number = number / 10;


        }

        System.out.println("We found  " + check +" " + firstCount + " number of times"+ " and " + another + " " + secondCount + " number of times" );
    }

}
