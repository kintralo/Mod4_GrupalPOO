package models;

/***
 * @author Juan Pablo Vásquez
 */

// Clase Capacitacion
public class Capacitacion {

    // Declaración de Atributos
    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    /**
     *
     */
    public Capacitacion() {

    }

    /**
     * @param identificador
     * @param rutCliente
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantidadAsistentes
     */
    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, int duracion,
                         int cantidadAsistentes) {
        super();
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the rutCliente
     */
    public String getRutCliente() {
        return rutCliente;
    }

    /**
     * @param rutCliente the rutCliente to set
     */
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the cantidadAsistentes
     */
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    /**
     * @param cantidadAsistentes the cantidadAsistentes to set
     */
    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
                + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
                + cantidadAsistentes + "]";
    }


}
