public class contador {
    static int total = 0;

    public contador() {
        contador.total++;
    }

    static void mostrar_total() {
        System.out.println("Total de visitantes creados: " + contador.total);
    }

    public static void main(String[] args) {
        contador v1 = new contador();
        contador v2 = new contador();
        contador v3 = new contador();
        contador v4 = new contador();
        contador.mostrar_total();
    }
}
