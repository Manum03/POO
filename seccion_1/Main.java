class Estudiante {
 String nombre;
 int edad;
 void mostrar() {
 System.out.println("Nombre: " + nombre + ", Edad: " + edad);
 }
}


class Mascota {
 String nombre;
 String especie;
 void mostrar() {
 System.out.println("Nombre: " + nombre + ", Especie: " + especie);
 }
}


public class Main {
 public static void main(String[] args) {
 Estudiante e1 = new Estudiante();
 e1.nombre = "Alejandro";
 e1.edad = 20;
 e1.mostrar();
 
 Estudiante e2 = new Estudiante();
 e2.nombre = "Valentina";
 e2.edad = 24;
 e2.mostrar();
 
 Mascota m1 = new Mascota();
 m1.nombre = "Firulais";
 m1.especie = "Perro";
 m1.mostrar();
 }
}