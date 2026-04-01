class Producto {
 String nombre;
 double precio;

 Producto(String nombre, double precio) {
   this.nombre = nombre;
   this.precio = precio;
 }

 void mostrar() {
   System.out.println("Producto: " + nombre + ", Precio: " + precio);
 }
}

public class Main {
 public static void main(String[] args) {
   Producto p1 = new Producto("Cuaderno", 8500);
   Producto p2 = new Producto("Lapicero", 1500);
   Producto p3 = new Producto("Borrador", 500);
   p1.mostrar();
   p2.mostrar();
   p3.mostrar();
 }
}
