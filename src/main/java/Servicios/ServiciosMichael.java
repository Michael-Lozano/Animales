package Servicios;

import Entidades.EntidadesMichael;

import java.util.ArrayList;

public class ServiciosMichael {

    EntidadesMichael EntMichael = new EntidadesMichael();

    private ArrayList<EntidadesMichael> Entidades;

    public ServiciosMichael() {

        Entidades = new ArrayList<>();

    }

    public void AgregarMichael(String NombreMas, int DocumentoMas, String Fecha) {

        EntidadesMichael nuevo = new EntidadesMichael(NombreMas, DocumentoMas, Fecha);

        Entidades.add(nuevo);

        System.out.println(" DATOS GUARDADOS ");

    }

    public void EliminarMichael(int Documentos) {

        for (int i = 0; i < Entidades.size(); i++) {

            Entidades.remove(i);

            System.out.println(" ELIMINO ");

        }

    }

    public void Buscar() {

        for (int i = 0; i < Entidades.size(); i++) {

            System.out.println("--------------------------");
            System.out.println("Nombre: " + Entidades.get(i).getNombreMas()+  "\n");
            System.out.println("Documento: " + Entidades.get(i).getDocumentoMas()+  "\n");
            System.out.println("Fecha: " + Entidades.get(i).getFecha()+  "\n");

        }
    }

}
