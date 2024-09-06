
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
       
        int non = 0;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                non = non+1;
               
                
            }else if(number==0){
            break;
                
                
            }else{
                System.out.println("OOPS!");
            }
            
            
        }
        System.out.println("You gave the number "+ non + " many times");


    }
}
