class Estudiante {
 String nombre;
 int edad;
 void mostrar() {
 System.out.println("Nombre: " + nombre + ", Edad: " + edad);
 }
}
public class Main {
 public static void main(String[] args) {
 Estudiante e1 = new Estudiante();
 e1.nombre = "Alejandro";
 e1.edad = 20;
 e1.mostrar();
 }
}