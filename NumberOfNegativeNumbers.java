
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        int negative = 0;
        int positive = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n<0) {
                negative = negative + 1;
                
            }else if(n==0){
                break;
            }else if(n>0){
                positive = positive + 1;
            }else{
                System.out.println(" ");
            }
    
            
        }
        System.out.println("Number of negative numbers:  " + negative);
        System.out.println("Number of positive numbers:  " + positive);
       

    }
}
