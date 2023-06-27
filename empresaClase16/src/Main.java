//Importaciones
import models.Usuario;
import models.Cliente;
import models.Listado;
import models.Administrativo;
import models.Profesional;
import java.util.Date;

//Clase  para mostrar datos
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Creación de instancias de clase Listado
        Listado lista = new Listado();

        //Creación de instancias de clase Profesional
       // Profesional profesional = new Profesional("12.123.123-3","Juan","Perez", new Date(2021,10,12),"",new Date(2021,10,12));
        Profesional profesional= new Profesional();
        profesional.setRun("16.782.345-3");
        profesional.setNombres("Juan ");
        profesional.setApellidos("Pérez");
        Date fechaNacimientoPorfesional= new Date(88,1,1);
        profesional.setFechaNacimiento(fechaNacimientoPorfesional);
        profesional.setTitulo("Ingeniería en Informática");
        Date fechaIngresoProfesional = new Date(23,6,23);
        profesional.setFechaIngreso(fechaIngresoProfesional);
        lista.agregarUsuario(profesional);


        //Creación de instancias de clase Administrativo
        Administrativo administrativo = new Administrativo();
        administrativo.setRun("12.212.643-2");
        administrativo.setNombres("Pedro ");
        administrativo.setApellidos("Martinez");
        Date fechaAdministrativo = new Date(89,12,23);
        administrativo.setFechaNacimiento(fechaAdministrativo);
        administrativo.setArea("Q.A");
        administrativo.setExperienciaPrevia("Director de Recursos Humanos");
        lista.agregarUsuario(administrativo);


        //Creación de instancias de clase Cliente
        Cliente cliente = new Cliente();
        cliente.setRun("12.345.645-4");
        cliente.setNombres("María Rodriguez");
        cliente.setApellidos("Miranda");
        Date fechaCliente = new Date(86, 11, 8); // Año, mes, día
        cliente.setFechaNacimiento(fechaCliente);
        cliente.setTelefono(982345212);
        cliente.setAfp("PROVIDA");
        cliente.setSistemaDeSalud(1);
        cliente.setDireccion("Los notros 7383");
        cliente.setComuna("Temuco");
        cliente.setEdad(33);
        lista.agregarUsuario(cliente);


        //Creación de instancias de clase Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setRun("22.432.564-3");
        usuario1.setNombres("Sofía");
        usuario1.setApellidos("Sánchez");
        Date fecha = new Date(93, 5, 22); // Año, mes, día
        usuario1.setFechaNacimiento(fecha);
        lista.agregarUsuario(usuario1);


        //Creación de instancias de clase Usuario
        Usuario usuario2 = new Usuario();
        usuario2.setRun("19.234.345-5");
        usuario2.setNombres("Luis Gutiérrez");
        usuario2.setApellidos("Contreras");
        Date fecha2 = new Date(93, 5, 22); // Año, mes, día
        usuario2.setFechaNacimiento(fecha2);
        lista.agregarUsuario(usuario2);
        lista.analizarUsuarios();
    }
}
