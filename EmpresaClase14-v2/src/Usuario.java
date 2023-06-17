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

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }

    public void getNombres() {
        System.out.println(this.nombres);
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void getFechaNacimiento() {
        System.out.println(this.fechaNacimiento);
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void getRun() {
        System.out.println(this.run);
    }

    public void setRun(String run) {
        this.run = run;
        return;
    }
    public void mostrarEdad() {
        Period period = Period.between(this.fechaNacimiento, LocalDate.now());
        System.out.println("El usuario tiene " + period.getYears()+" años");
    }
}
