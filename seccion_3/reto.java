class Curso {
    private String nombre;
    private int creditos;

    public Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void mostrar() {
        System.out.println("Curso: " + nombre + " Créditos: " + creditos);
    }

    public static void main(String[] args) {
        Curso c1 = new Curso("Programación", 4);
        c1.mostrar();
    }
}