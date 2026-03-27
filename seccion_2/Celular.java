public class Celular {
    private String marca;
    private String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular("Apple", "iPhone 13");
        celular1.mostrarInformacion();
    }
}

