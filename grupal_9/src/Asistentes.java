public class Asistentes {
    private String nombre;
    private int edad;
    public Asistentes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int grupoEdad(int edad){
        int retorno = 0;
        if(edad<=25){
            retorno=0;
        }
        if(edad>25 && edad<36){
            retorno=1;
        }
        if(edad>36){
            retorno=2;
        }
        return retorno;
    }

}
