package models;

import java.time.LocalTime;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebatián Araya
 */
public class Capacitacion {
    private int id;
    private String rut;
    private int dia;
    private LocalTime hora;
    private String lugar;
    private Integer duracion;
    private int asistentes;

    public Capacitacion() {
    }

    public Capacitacion(int id, String rut, int dia, LocalTime hora, String lugar, Integer duracion, int asistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }

    public String toString() {
        int var10000 = this.id;
        return "Capacitacion{id=" + var10000 + ", rut='" + this.rut + "', dia=" + this.dia + ", hora=" + String.valueOf(this.hora) + ", lugar='" + this.lugar + "', duracion=" + this.duracion + ", asistentes=" + this.asistentes + "}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public int getId() {
        return this.id;
    }

    public String getRut() {
        return this.rut;
    }

    public int getDia() {
        return this.dia;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public String getLugar() {
        return this.lugar;
    }

    public Integer getDuracion() {
        return this.duracion;
    }

    public int getAsistentes() {
        return this.asistentes;
    }
}

