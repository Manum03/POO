import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String numeroCuenta;
    private double saldo;
    private List<Transaction> transactions;
    public static int totalCuentas = 0;

    public BankAccount(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.transactions = new ArrayList<>();
        totalCuentas++;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
        saldo += t.getMonto();
    }

    public void display() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
        System.out.println("Transacciones:");
        for (Transaction t : transactions) {
            t.display();
        }
    }
}