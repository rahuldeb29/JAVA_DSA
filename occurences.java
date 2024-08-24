import java.util.Scanner;
public class occurences {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int c = n.nextInt();
        System.out.print("Check or which number?: ");
        int check = n.nextInt();
        int count = 0;
        while (c>0){
            int rem = c%10;
            if (rem==check) {
                count++;
            }
            c = c/10;
        }
        System.out.println("The number 5 occurred " + count + " times");
    }
}