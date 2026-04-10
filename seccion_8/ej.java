class Prueba {
 String nombre;
 Prueba(String nombre) {
 this.nombre = nombre;
 }
}
public class ej {
 public static void main(String[] args) {
 Prueba p1 = new Prueba("Objeto1");
 Prueba p2 = new Prueba("Objeto2");
 Prueba p3 = new Prueba("Objeto3");
 p2 = null;
 p3 = null;
 System.gc();
 System.out.println("Fin del programa");
 }
}
