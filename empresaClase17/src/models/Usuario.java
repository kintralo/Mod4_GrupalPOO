package models;
//Importaciones
import interfaces.IAsesoria;
import java.util.Date;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */

// Clase Usuario
public class Usuario implements IAsesoria {
    //Definición de los atributos
    private String run;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

    /**
     *
     */
    public Usuario() {
    }

    /**
     * @param run
     * @param nombres
     * @param apellidos
     * @param fechaNacimiento
     */
    public Usuario(String run, String nombres, String apellidos, Date fechaNacimiento) {
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the run
     */
    public String getRun() {
        return run;
    }

    /**
     * @param run the run to set
     */
    public void setRun(String run) {
        this.run = run;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return run, nombres, apellidos, fechaNacimiento.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "run='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    /**
     * imprime todos los valores de la clase Usuario
     */
    @Override
    public void analizarUsuario() {
      //  System.out.println(this.toString());
    }
}
