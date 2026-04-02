class procesador {
 void instalar() {
 System.out.println("procesador instalado");
 }
}
class computador {
 procesador procesador = new procesador();
 void instalar() {
 procesador.instalar();
 System.out.println("Computador listo para usar");
 }
}
public class ej {
 public static void main(String[] args) {
 computador c = new computador();
 c.instalar();
 }
}