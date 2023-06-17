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

    public Integer getRUT() {
        System.out.println(this.RUT);
        return null;
    }

    public void setRUT(Integer RUT) {
        this.RUT = RUT;
    }

    public String getNombres() {
        System.out.println(this.nombres);
        return null;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        System.out.println(this.apellidos);
        return null;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getTelefono() {
        System.out.println(this.telefono);
        return null;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        System.out.println(this.AFP);
        return null;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public void getSistemaDeSalud() {
        System.out.println(sistemaDeSalud);
    }

    public void setSistemaDeSalud(int sistemaDeSalud) {
        this.sistemaDeSalud = sistemaDeSalud;
    }

    public String getDireccion() {
        System.out.println(this.Direccion);
        return null;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getComuna() {
        System.out.println(this.Comuna);
        return null;
    }

    public void setComuna(String comuna) {
        Comuna = comuna;
    }

    public String getEdad() {
        System.out.println(this.Edad);
        return null;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }
    public void obtenerNombre(int RUT) {
        System.out.println(this.nombres+" "+this.apellidos);
    }
    public void obtenerSistemaSalud() {
        String respuesta="";
        if(this.sistemaDeSalud==1){
            respuesta="Fonasa";
        }
        if(this.sistemaDeSalud==2){
            respuesta="Isapre";
        }
        System.out.println("Sistema de salud: "+respuesta);
    }
}
