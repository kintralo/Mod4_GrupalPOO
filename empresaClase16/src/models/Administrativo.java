package models;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */

//Clase Administrativo
public class Administrativo extends Usuario {
    // Declaración de Atributos
    private String area;
    private String experienciaPrevia;

    /**
     *
     */
    public Administrativo() {
    }

    /**
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String area, String experienciaPrevia) {
        super();
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the experienciaPrevia
     */
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    /**
     * @param experienciaPrevia the experienciaPrevia to set
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @return run, nombres, apellidos, fechaNacimiento, area, experienciaPrevia.
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "run='" + getRun()  + '\'' +
                ", nombres='" + getNombres() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                " area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    /**
     * imprime todos los valores de la clase Administrativo
     */
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(this.toString());
    }
}

