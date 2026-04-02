class Persona {
 String nombre;
 Persona(String nombre) {
 this.nombre = nombre;
 }
 void saludar() {
 System.out.println("Hola, soy " + this.nombre);
 }
}
public class main {
 public static void main(String[] args) {
 Persona p = new Persona("Alejandro");
 p.saludar();
 Persona q = new Persona("Maria");
 q.saludar();
 }
 
}