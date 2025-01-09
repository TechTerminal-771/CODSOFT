//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount userAccount = new BankAccount(1000.00); // Initial balance: $1000

        // Create an ATM and connect it to the bank account
        ATM atm = new ATM(userAccount);

        // Display the ATM interface
        atm.displayMenu();
    }
}