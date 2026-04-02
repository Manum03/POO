class Facultad {
    void fundar() {
        System.out.println("La facultad de Informatica fue fundada en el año 2000");
    }
}

class Universidad {
    private Facultad facultad;

    Universidad() {
        this.facultad = new Facultad();
    }

    void fundar() {
        facultad.fundar();
        System.out.println("La universidad fue fundada en el año 1990");
    }
}

public class reto {
    public static void main(String[] args) {
        Universidad u = new Universidad();
        u.fundar();
    }
}