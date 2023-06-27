package models;

import java.util.Date;

/***
 * @author Juan Pablo Vásquez
 */
// Clase Usuario
public class Usuario {
    // Declaración de Atributos
    private String Nombre;
    private Date fecha_de_nacimiento;
    private String run;

    /**
     *
     */
    public Usuario() {
    }

    /**
     * @param nombre
     * @param fecha_de_nacimiento
     * @param run
     */
    public Usuario(String nombre, Date fecha_de_nacimiento, String run) {
        Nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.run = run;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     * @return the fecha_de_nacimiento
     */
    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    /**
     * @param fecha_de_nacimiento the fecha_de_nacimiento to set
     */
    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
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
     * @return run, nombres, fecha_de_nacimiento
     */
    @Override
    public String toString() {
        return "Usuario= Nombre: " + Nombre + ", fecha_de_nacimiento: " + fecha_de_nacimiento + ", run: " + run;
    }

}
