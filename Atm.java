import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 50000.00; // Initial balance

        while (true) {
            System.out.println("Welcome to ATM!");
            System.out.println("1.Press 1 to Check Balance");
            System.out.println("2.Press 2 for Deposit");
            System.out.println("3.Press 3 for Withdraw");
            System.out.println("4.Press 4 for Exit");
            System.out.print("Enter your choice: ");

            int c = scanner.nextInt();

            if (c == 1) {
                System.out.println("Your current balance is : $" + amount);
            } 
            else if (c == 2) {
                System.out.print("Enter amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                amount = amount+ depositAmount;
                System.out.println("Deposit successful! New balance is : $" + amount);
            } 
            else if (c == 3) {
                System.out.print("Enter amount which you want to withdraw: $");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount > amount) {
                    System.out.println("Oops! Insufficient funds!");
                } 
                else {
                    amount = amount-withdrawAmount;
                    System.out.println("Withdrawal successful! New balance is : $" + amount);
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
