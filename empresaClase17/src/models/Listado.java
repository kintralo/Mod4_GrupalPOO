package models;
//Importaciones
import interfaces.IAsesoria;
import java.util.ArrayList;
/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */
//Clase Listado
public class Listado {
    /**
     *
     */
    ArrayList<IAsesoria> listaUsuarios;

    /**
     *
     */
    public Listado() {
        listaUsuarios = new ArrayList<IAsesoria>();
    }

    /**
     *
     * @param usuario
     */
    public void agregarUsuario(IAsesoria usuario) {

        this.listaUsuarios.add(usuario);
    }

    /**
     *
     */
    public void analizarUsuarios() {
        for (IAsesoria iAsesoria : listaUsuarios) {
          iAsesoria.analizarUsuario();
        }
    }
}
