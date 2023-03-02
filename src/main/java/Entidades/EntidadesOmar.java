package Entidades;

import Servicios.ServiciosOmar;

public class EntidadesOmar {

    ServiciosOmar info_Puente = new ServiciosOmar();
    String nombre_Mascota;
    String tipo_Enfermedad;
    String mortalidad;
    int Codigo_Dueño;

    public EntidadesOmar(String nombre_Mascota, String tipo_Enfermedad, String mortalidad, int codigo_Dueño) {
        this.nombre_Mascota = nombre_Mascota;
        this.tipo_Enfermedad = tipo_Enfermedad;
        this.mortalidad = mortalidad;
        Codigo_Dueño = codigo_Dueño;
    }

    public EntidadesOmar() {
    }

    public String getNombre_Mascota() {
        return nombre_Mascota;
    }

    public void setNombre_Mascota(String nombre_Mascota) {
        this.nombre_Mascota = nombre_Mascota;
    }

    public String getTipo_Enfermedad() {
        return tipo_Enfermedad;
    }

    public void setTipo_Enfermedad(String tipo_Enfermedad) {
        this.tipo_Enfermedad = tipo_Enfermedad;
    }

    public String getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(String mortalidad) {
        this.mortalidad = mortalidad;
    }

    public int getCodigo_Dueño() {
        return Codigo_Dueño;
    }

    public void setCodigo_Dueño(int codigo_Dueño) {
        Codigo_Dueño = codigo_Dueño;
    }
}
