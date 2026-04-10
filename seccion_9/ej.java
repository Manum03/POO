package seccion_9;

class Cuenta {
 private double saldo = 1000;
}
public class ej {
 public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
 Cuenta c = new Cuenta();
 System.out.println(c.getClass().getDeclaredField("saldo").get(c));
 }
}