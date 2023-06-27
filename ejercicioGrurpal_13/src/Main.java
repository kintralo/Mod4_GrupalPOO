import models.Usuario;
import models.Cliente;
import models.Capacitacion;

import java.time.LocalDate;
import java.util.Date;

//Clase  para mostrar datos
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Creación de instancias de clase Trabajador
        Cliente cliente = new Cliente("12345678", "Juan", "Pérez", "912345678", "AFP Modelo", 1, "Calle 123", "Santiago", 30);
        Usuario usuario = new Usuario("María", new Date(2021,10,12), "87654321");
        Capacitacion capacitacion = new Capacitacion(1, "12345678", "01-01-2023", "09:00", "Centro de Convencionesss", 3, 50);

        //Mostrar resultados
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
