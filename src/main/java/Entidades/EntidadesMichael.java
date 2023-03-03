package Entidades;

public class EntidadesMichael {

    private String NombreMas;
    private int DocumentoMas;
    private String Fecha;

    public EntidadesMichael(String nombreMas, int documentoMas, String fecha) {
        NombreMas = nombreMas;
        DocumentoMas = documentoMas;
        Fecha = fecha;
    }

    public EntidadesMichael() {
    }

    public String getNombreMas() {
        return NombreMas;
    }

    public void setNombreMas(String nombreMas) {
        NombreMas = nombreMas;
    }

    public int getDocumentoMas() {
        return DocumentoMas;
    }

    public void setDocumentoMas(int documentoMas) {
        DocumentoMas = documentoMas;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}
