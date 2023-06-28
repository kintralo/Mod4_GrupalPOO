package models;
//Importaciones
import java.util.Date;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */
//Clase Cliente
public class Cliente extends Usuario {
    //Definición de los atributos
    private Integer telefono;
    private String afp;
    private int sistemaDeSalud;
    private String direccion;
    private String comuna;
    private Integer edad;

    /**
     *
     */
    public Cliente() {
    }

    /**
     * @param telefono
     * @param afp
     * @param sistemaDeSalud
     * @param direccion
     * @param comuna
     * @param edad
     */

    public Cliente(Integer telefono, String afp, int sistemaDeSalud, String direccion, String comuna, Integer edad) {
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * @param run
     * @param nombres
     * @param apellidos
     * @param fechaNacimiento
     * @param telefono
     * @param afp
     * @param sistemaDeSalud
     * @param direccion
     * @param comuna
     * @param edad
     */
    public Cliente(String run, String nombres, String apellidos, Date fechaNacimiento, Integer telefono, String afp, int sistemaDeSalud, String direccion, String comuna, Integer edad) {
        super(run, nombres, apellidos, fechaNacimiento);
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the afp
     */
    public String getAfp() {
        return afp;
    }

    /**
     * @param afp the afp to set
     */
    public void setAfp(String afp) {
        this.afp = afp;
    }

    /**
     * @return the sistemaDeSalud
     */
    public int getSistemaDeSalud() {
        return sistemaDeSalud;
    }

    /**
     * @param sistemaDeSalud the sistemaDeSalud to set
     */
    public void setSistemaDeSalud(int sistemaDeSalud) {
        this.sistemaDeSalud = sistemaDeSalud;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * @param comuna the comuna to set
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @param RUT
     * @return nombres;
     */
    public String obtenerNombre(int RUT) {
        String var10000 = this.getNombres();
        String nombres = var10000 + " " + this.getApellidos();
        return nombres;
    }

    /**
     * @return respuesta
     */
    public String obtenerSistemaSalud() {
        String respuesta = "";
        if (this.sistemaDeSalud == 1) {
            respuesta = "Fonasa";
        }

        if (this.sistemaDeSalud == 2) {
            respuesta = "Isapre";
        }

        return respuesta;
    }

    /**
     * @return run, nombres, apellidos, fechaNacimiento, telefono, afp, sistemaDeSalud, direccion, comuna, edad,
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "run='" + getRun()  + '\'' +
                ", nombres='" + getNombres() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                "  telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistemaDeSalud=" + sistemaDeSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
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
