import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(19, "Juan Andres", "Peres Gonzalez", 123456, "Capital",  1, "La calle de su casa 88", "La Pintana", "22" );
        cliente1.toString();
        cliente2.toString();
        cliente2.setSistemaDeSalud(2);
        cliente1.getRUT();
        cliente1.getNombres();
        cliente1.getApellidos();
        cliente1.getEdad();
        cliente1.getAFP();
        cliente1.getSistemaDeSalud();
        cliente1.getDireccion();
        cliente1.getComuna();
        cliente1.getTelefono();

        cliente2.getRUT();
        cliente2.getNombres();
        cliente2.getApellidos();
        cliente2.getEdad();
        cliente2.getAFP();
        cliente2.getSistemaDeSalud();
        cliente2.getDireccion();
        cliente2.getComuna();
        cliente2.getTelefono();

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario( "Roberto Carlos", LocalDate.of(1990,2,5), "1-9");
        usuario2.mostrarEdad();

        usuario1.toString();
        usuario2.toString();

        usuario2.setNombres("Julio Ramon");
        usuario1.getNombres();
        usuario1.getRun();
        usuario1.getFechaNacimiento();
        usuario2.getNombres();
        usuario2.getRun();
        usuario2.getFechaNacimiento();

        Capacitacion capacitacion1 = new Capacitacion();
        Capacitacion capacitacion2 = new Capacitacion(1, "1-9", 18, LocalTime.of(15,0),  "Online Zoom", 180, 15);
        capacitacion1.toString();
        capacitacion2.toString();
        capacitacion2.setLugar("Online vía Meet");

        capacitacion1.getId();
        capacitacion1.getRut();
        capacitacion1.getDia();
        capacitacion1.getHora();
        capacitacion1.getLugar();
        capacitacion1.getDuracion();
        capacitacion1.getAsistentes();

        capacitacion2.getId();
        capacitacion2.getRut();
        capacitacion2.getDia();
        capacitacion2.getHora();
        capacitacion2.getLugar();
        capacitacion2.getDuracion();
        capacitacion2.getAsistentes();


    }
}

