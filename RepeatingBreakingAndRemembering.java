import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        System.out.print("Write numbers:");
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            
            sum += number;
            count++;
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (count > 0 ? (double) sum / count : 0));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
        scanner.close();
    }
}
