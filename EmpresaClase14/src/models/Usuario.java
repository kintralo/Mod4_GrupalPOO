package models;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */
import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private String nombres;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombres, LocalDate fechaNacimiento, String run) {
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String toString() {
        String var10000 = this.nombres;
        return "Usuario{nombres='" + var10000 + "', fechaNacimiento=" + String.valueOf(this.fechaNacimiento) + ", run='" + this.run + "'}";
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombres() {
        return this.nombres;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getRun() {
        return this.run;
    }

    public void mostrarEdad() {
        Period period = Period.between(this.fechaNacimiento, LocalDate.now());
        System.out.println("El usuario tiene " + period.getYears() + " años");
    }
}
