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
    public void setId(int id) {
        this.id = id;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
    public int getId() {
        return id;
    }
    public String getRut() {
        return rut;
    }
    public int getDia() {
        return dia;
    }
    public LocalTime getHora() {
        return hora;
    }
    public String getLugar() {
        return lugar;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public int getAsistentes() {
        return asistentes;
    }

}
