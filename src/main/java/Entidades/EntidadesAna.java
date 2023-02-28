package Entidades;

import Servicios.ServiciosAna;

public class EntidadesAna {
    ServiciosAna opcio = new ServiciosAna();

    int nuevoValor;
    private String nombre;
    private int documentoMas;
    private String dueño;
    private String raza;
    private String color;

    public EntidadesAna(String nombre, int documentoMas, String dueño, String raza, String color) {
        this.nombre = nombre;
        this.documentoMas = documentoMas;
        this.dueño = dueño;
        this.raza = raza;
        this.color = color;
    }

    public EntidadesAna() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoMas() {
        return documentoMas;
    }

    public void setDocumentoMas(int documentoMas) {
        this.documentoMas = documentoMas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
