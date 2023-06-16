import models.Usuario;
public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("María", '01-01-1990', "87654321");

        System.out.println("Datos del usuario:");
        System.out.println(usuario.toString());
        System.out.println();
    }
}