import java.time.LocalTime;

public class Capacitacion {
    private int id;
    private String rut;
    private int dia;
    private LocalTime hora;
    private String lugar;
    private Integer duracion;
    private int asistentes;

    public Capacitacion() {

    }

    public Capacitacion(int id, String rut, int dia, LocalTime hora, String lugar, Integer duracion, int asistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", asistentes=" + asistentes +
                '}';
    }

    public int getId() {
        System.out.println(this.id);
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        System.out.println(this.rut);

        return null;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getDia() {
        System.out.println(this.dia);
        return 0;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        System.out.println(this.hora);

        return null;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        System.out.println(this.lugar);

        return null;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getDuracion() {
        System.out.println(this.duracion);
        return 0;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public int getAsistentes() {
        System.out.println(this.asistentes);
        return 0;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public void mostrarDetalle() {
        System.out.println("La capacitación será en "+this.lugar+" a las "+this.hora+" del día" +this.dia+ ", y durará "+this.duracion+" minutos.");

    }
}
