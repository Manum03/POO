class Contador {
 static int total = 0;
 Contador() {
 total++;
 }
 static void mostrarTotal() {
 System.out.println("Total de objetos: " + total);
 }
}
public class ej {
 public static void main(String[] args) {
 new Contador();
 new Contador();
 new Contador();
 new Contador(); 
 new Contador();
 Contador.mostrarTotal();
 }
}