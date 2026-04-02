class profesor {
    String nombre;
    profesor(String nombre) {
        this.nombre = nombre;
    }
    void saludar() {
        System.out.println("Hola, soy el profesor " + this.nombre);
    }
}

public class reto {
    public static void main(String[] args) {
        profesor p = new profesor("Alejandro");
        p.saludar();
    }
}
