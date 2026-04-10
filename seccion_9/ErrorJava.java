package seccion_9;

public class ErrorJava {
    public static void main(String[] args) {
        String s = null;
        if (s != null) {
            System.out.println(s.length());
        } else {
            System.out.println("La cadena es null");
        }
    }
}