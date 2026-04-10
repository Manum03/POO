package seccion_7.modelo_java;
public class Persona {
 private String nombre;
 public Persona(String nombre) {
 this.nombre = nombre;
 }
 public void saludar() {
 System.out.println("Hola, soy " + nombre);
 }
}