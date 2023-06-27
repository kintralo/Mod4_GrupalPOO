package models;
//Importaciones
import java.util.Date;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */

public class Profesional extends Usuario {
    //Definición de los atributos
    private String titulo;
    private Date fechaIngreso;

    public Profesional() {
    }
    /**
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String titulo, Date fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @param run
     * @param nombres
     * @param apellidos
     * @param fechaNacimiento
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String run, String nombres, String apellidos, Date fechaNacimiento, String titulo, Date fechaIngreso) {
        super(run, nombres, apellidos, fechaNacimiento);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    /**
     * @return run, nombres, apellidos, fechaNacimiento, titulo, fechaIngreso
     */

    @Override
    public String toString() {
        return "Profesional{" +
                "run='" + getRun()  + '\'' +
                ", nombres='" + getNombres() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                "  titulo=" + titulo +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    /**
     * imprime todos los valores de la clase Usuario
     */
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(this.toString());
    }
}
