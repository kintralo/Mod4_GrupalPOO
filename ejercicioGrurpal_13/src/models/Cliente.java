package models;

/***
 * @author Juan Pablo Vásquez
 */
// Clase Cliente
public class Cliente {
    // Declaración de Atributos
    private String rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    /**
     *
     */
    public Cliente() {
    }


    /**
     * @param rut
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     * @param edad
     */
    public Cliente(String rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud,
                   String direccion, String comuna, int edad) {
        super();
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
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
     * @return the sistemaSalud
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }

    /**
     * @param sistemaSalud the sistemaSalud to set
     */
    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
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
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return run, nombres, apellidos, telefono, sistemaSalud, direccion, comuna, edad
     */

    @Override
    public String toString() {
        return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono="
                + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion
                + ", comuna=" + comuna + ", edad=" + edad + "]";
    }

}
