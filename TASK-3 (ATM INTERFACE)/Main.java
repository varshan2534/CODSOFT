import java.util.Scanner;
class BankAccount {
    Double balance;
    BankAccount() {
        this.balance = 10000.00;
    }
    Double getBalance() {
        return balance;
    }
    void withdrawal(Double amt) {
        balance -= amt;
    }
    void deposit(Double amt) {
        balance += amt;
    }
}
public class Main {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int userpin = 4867;
        System.out.print("Enter PIN: ");
        int userinp = scanner.nextInt();

        if (userpin == userinp) {
            interfaceMenu();
        } else {
            System.out.println("You have entered the Wrong Pin, Try again!");
        }
    }
    private static void interfaceMenu() {
        BankAccount ba = new BankAccount();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    ba.withdrawal(withdrawalAmount);
                    System.out.println("Withdrawal successful. Remaining balance: " + ba.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    ba.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: " + ba.getBalance());
                    break;
                case 3:
                    System.out.println("Current balance: " + ba.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
