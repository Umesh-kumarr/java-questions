import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 50000.00; // Initial balance

        while (true) {
            System.out.println("Welcome to ATM!");
            System.out.println("1.Press 1 to Check Balance");
            System.out.println("2.Press 2 for Deposit");
            System.out.println("3.Press 3 for Withdraw");
            System.out.println("4.Press 4 for Exit");
            System.out.print("Enter your choice: ");

            int c = scanner.nextInt();

            if (c == 1) {
                System.out.println("Your current balance is : $" + balance);
            } 
            else if (c == 2) {
                System.out.print("Enter amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                balance = balance+ depositAmount;
                System.out.println("Deposit successful! New balance is : $" + balance);
            } 
            else if (c == 3) {
                System.out.print("Enter amount which you want to withdraw: $");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount > balance) {
                    System.out.println("Oops! Insufficient funds!");
                } 
                else {
                    balance = balance-withdrawAmount;
                    System.out.println("Withdrawal successful! New balance is : $" + balance);
                }
            } 
            else if (c == 4) {
                System.out.println("Thank you for using ATM!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
