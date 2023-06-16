package models;

import java.util.Date;

/***
 * @author Juan Pablo Vásquez
 */
public class Usuario {
    String Nombre;
    Date Fecha_de_nacimiento;
    String RUN;

    public Usuario() {
    }

    public Usuario(String nombre, Date fecha_de_nacimiento, String RUN) {
        Nombre = nombre;
        Fecha_de_nacimiento = fecha_de_nacimiento;
        this.RUN = RUN;
    }

    public Usuario(String maría, String s, String run) {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        Fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Fecha_de_nacimiento=" + Fecha_de_nacimiento +
                ", RUN='" + RUN + '\'' +
                '}';
    }
}
