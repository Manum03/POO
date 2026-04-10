public class Transaction {
    private String fecha;
    private double monto;

    public Transaction(String fecha, double monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void display() {
        System.out.println("Fecha: " + fecha + ", Monto: " + monto);
    }
}