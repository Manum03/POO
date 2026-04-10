public class Main {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount("12345", 1000.0);
        cuenta1.addTransaction(new Transaction("2023-01-01", 500.0));
        cuenta1.addTransaction(new Transaction("2023-01-02", -200.0));

        BankAccount cuenta2 = new BankAccount("67890", 2000.0);
        cuenta2.addTransaction(new Transaction("2023-01-01", 1000.0));

        cuenta1.display();
        cuenta2.display();
        System.out.println("Total cuentas: " + BankAccount.totalCuentas);
    }
}