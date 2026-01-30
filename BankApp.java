import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount : ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception Caught : " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input : " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error : " + e);

        } finally {
            System.out.println("Transaction attempt completed...!");
            System.out.println("\nThank You!!!");
            sc.close();
        }
    }
}
