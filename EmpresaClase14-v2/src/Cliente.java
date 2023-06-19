public class Cliente {
    private Integer RUT; //corresponde a un número menor a 99.999.999
    private String nombres;
    private String apellidos;
    private Integer telefono;
    private String AFP;
    private int sistemaDeSalud; //1 (Fonasa) o 2 (Isapre)
    private String Direccion;
    private String Comuna;
    private String Edad;

    public Cliente(){

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

    @Override
    public String toString() {
        return "Cliente{" +
                "RUT=" + RUT +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", AFP='" + AFP + '\'' +
                ", sistemaDeSalud=" + sistemaDeSalud +
                ", Dirección='" + Direccion + '\'' +
                ", Comuna='" + Comuna + '\'' +
                ", Edad='" + Edad + '\'' +
                '}';
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
        Direccion = direccion;
    }
    public void setComuna(String comuna) {
        Comuna = comuna;
    }
    public void setEdad(String edad) {
        Edad = edad;
    }

    public Integer getRUT() {
        return RUT;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public int getSistemaDeSalud() {
        return sistemaDeSalud;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getComuna() {
        return Comuna;
    }

    public String getEdad() {
        return Edad;
    }

    public String obtenerNombre(int RUT) {
        String nombres = getNombres()+" "+getApellidos();
        return nombres;
    }
    public String obtenerSistemaSalud() {
        String respuesta="";
        if(this.sistemaDeSalud==1){
            respuesta="Fonasa";
        }
        if(this.sistemaDeSalud==2){
            respuesta="Isapre";
        }
        return respuesta;
    }
}
