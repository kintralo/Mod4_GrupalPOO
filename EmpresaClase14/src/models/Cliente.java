package models;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */

public class Cliente {
    private Integer RUT;
    private String nombres;
    private String apellidos;
    private Integer telefono;
    private String AFP;
    private int sistemaDeSalud;
    private String Direccion;
    private String Comuna;
    private String Edad;

    public Cliente() {
    }

    public Cliente(Integer RUT, String nombres, String apellidos, Integer telefono, String AFP, int sistemaDeSalud, String direccion, String comuna, String edad) {
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaDeSalud = sistemaDeSalud;
        this.Direccion = direccion;
        this.Comuna = comuna;
        this.Edad = edad;
    }

    public String toString() {
        return "Cliente{RUT=" + this.RUT + ", nombres='" + this.nombres + "', apellidos='" + this.apellidos + "', telefono=" + this.telefono + ", AFP='" + this.AFP + "', sistemaDeSalud=" + this.sistemaDeSalud + ", Dirección='" + this.Direccion + "', Comuna='" + this.Comuna + "', Edad='" + this.Edad + "'}";
    }

    public void setRUT(Integer RUT) {
        this.RUT = RUT;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public void setSistemaDeSalud(int sistemaDeSalud) {
        this.sistemaDeSalud = sistemaDeSalud;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.Comuna = comuna;
    }

    public void setEdad(String edad) {
        this.Edad = edad;
    }

    public Integer getRUT() {
        return this.RUT;
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public String getAFP() {
        return this.AFP;
    }

    public int getSistemaDeSalud() {
        return this.sistemaDeSalud;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public String getComuna() {
        return this.Comuna;
    }

    public String getEdad() {
        return this.Edad;
    }

    public String obtenerNombre(int RUT) {
        String var10000 = this.getNombres();
        String nombres = var10000 + " " + this.getApellidos();
        return nombres;
    }

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
}
