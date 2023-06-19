import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(19, "Juan Andres", "Peres Gonzalez", 123456, "Capital",  1, "La calle de su casa 88", "La Pintana", "22" );
        cliente1.toString();
        cliente2.toString();
        cliente2.setSistemaDeSalud(2);
        System.out.println("***************************************************************");
        System.out.println("RUT: "+cliente1.getRUT());
        System.out.println("Nombres: "+cliente1.getNombres());
        System.out.println("Apellidos: "+cliente1.getApellidos());
        System.out.println("Edad: "+cliente1.getEdad());
        System.out.println("AFP: "+cliente1.getAFP());
        System.out.println("Sistema de salud: "+cliente1.getSistemaDeSalud());
        System.out.println("Dirección: "+cliente1.getDireccion());
        System.out.println("Comuna: "+cliente1.getComuna());
        System.out.println("Telefono: "+cliente1.getTelefono());
        System.out.println("***************************************************************");
        System.out.println("RUT: "+cliente2.getRUT());
        System.out.println("Nombres: "+cliente2.getNombres());
        System.out.println("Apellidos: "+cliente2.getApellidos());
        System.out.println("Edad: "+cliente2.getEdad());
        System.out.println("AFP: "+cliente2.getAFP());
        System.out.println("Sistema de salud: "+cliente2.getSistemaDeSalud());
        System.out.println("Dirección: "+cliente2.getDireccion());
        System.out.println("Comuna: "+cliente2.getComuna());
        System.out.println("Telefono: "+cliente2.getTelefono());
        System.out.println("***************************************************************");
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario( "Roberto Carlos", LocalDate.of(1990,2,5), "1-9");
        System.out.println("***************************************************************");
        usuario1.toString();
        System.out.println("***************************************************************");
        usuario2.toString();
        usuario2.setNombres("Julio Ramon");
        System.out.println("***************************************************************");
        System.out.println("Nombres: "+usuario1.getNombres());
        System.out.println("RUN: "+usuario1.getRun());
        System.out.println("Fecha de nacimiento: "+usuario1.getFechaNacimiento());
        System.out.println("***************************************************************");
        System.out.println("Nombres: "+usuario2.getNombres());
        System.out.println("RUN: "+usuario2.getRun());
        System.out.println("Fecha de nacimiento: "+usuario2.getFechaNacimiento());

        Capacitacion capacitacion1 = new Capacitacion();
        Capacitacion capacitacion2 = new Capacitacion(1, "1-9", 18, LocalTime.of(15,0),  "Online Zoom", 180, 15);
        System.out.println("***************************************************************");
        capacitacion1.toString();
        System.out.println("***************************************************************");
        capacitacion2.toString();
        capacitacion2.setLugar("Online vía Meet");
        System.out.println("***************************************************************");
        System.out.println("ID: "+capacitacion1.getId());
        System.out.println("RUT: "+capacitacion1.getRut());
        System.out.println("Día: "+capacitacion1.getDia());
        System.out.println("Hora: "+capacitacion1.getHora());
        System.out.println("Lugar: "+capacitacion1.getLugar());
        System.out.println("Duración: "+capacitacion1.getDuracion());
        System.out.println("Asistentes: "+capacitacion1.getAsistentes());
        System.out.println("***************************************************************");
        System.out.println("ID: "+capacitacion2.getId());
        System.out.println("RUT: "+capacitacion2.getRut());
        System.out.println("Día: "+capacitacion2.getDia());
        System.out.println("Hora: "+capacitacion2.getHora());
        System.out.println("Lugar: "+capacitacion2.getLugar());
        System.out.println("Duración: "+capacitacion2.getDuracion());
        System.out.println("Asistentes: "+capacitacion2.getAsistentes());

    }
}

