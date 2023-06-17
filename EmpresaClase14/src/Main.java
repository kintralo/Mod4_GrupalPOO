import models.Capacitacion;
import models.Cliente;
import models.Usuario;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("12345678", "Juan", "Pérez", "912345678", "AFP Modelo", 1, "Calle 123", "Santiago", 30);
        Usuario usuario = new Usuario("María", "01-01-1990", "87654321");
        Capacitacion capacitacion = new Capacitacion(1, "12345678", "01-01-2023", "09:00", "Centro de Convencionesss", 3, 50);

        System.out.println("Datos del cliente:");
        System.out.println(cliente.toString());
        System.out.println();

        System.out.println("Datos del usuario:");
        System.out.println(usuario.toString());
        System.out.println();

        System.out.println("Datos de la capacitación:");
        System.out.println(capacitacion.toString());
        System.out.println();
    }
}
}