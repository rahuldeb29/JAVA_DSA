import java.util.Scanner;
public class myFirstBankTransfer {

    public static void main(String[] args) {
        
        Account mathewsAccount = new Account("Matthew's Account", 1000.0);
        Account myAccount = new Account("My Account", 0.0);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double transferAmount = scanner.nextDouble();

        
        if (mathewsAccount.balance() >= transferAmount) {
            mathewsAccount.withdrawal(transferAmount); 
            myAccount.deposit(transferAmount);           
        } else {
            System.out.println("Insufficient funds in Matthew's account for the transfer.");
        }

        
        System.out.println(mathewsAccount);
        System.out.println(myAccount);
    }
}
