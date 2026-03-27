class Libro {
 String titulo;
 String autor;

 void mostrarInfo() {
 System.out.println("Título: " + titulo);
 System.out.println("Autor: " + autor);
 }
}


public class EJ {
 public static void main(String[] args) {
 Libro libro1 = new Libro();
 libro1.titulo = "Cien años de soledad";
 libro1.autor = "Gabriel García Márquez";
 libro1.mostrarInfo();

 Libro libro2 = new Libro();
 libro2.titulo = "Don Quijote de la Mancha";
 libro2.autor = "Miguel de Cervantes";
 libro2.mostrarInfo();
 }
}