package Servicios;
import Entidades.EntidadesAna;

import java.util.Scanner;

import java.util.ArrayList;
public class ServiciosAna {
    private ArrayList<EntidadesAna> EntidadesAna;
    Scanner op = new Scanner(System.in);

    public ServiciosAna() {

        EntidadesAna = new ArrayList<>();

    }

    //Buscar------------------------------------------------------------------------------------------
    public void Buscar(){
        System.out.println("MOSTRAR TODAS TUS MASCOTAS");
        // For mejorado para imprimir
        for (int i = 0; i < EntidadesAna.size(); i++) {
            System.out.println("<----------------------------------------------------------->");
            System.out.println("Nombre:" + EntidadesAna.get(i).getNombre()+ "\n");
            System.out.println("Documento:" + EntidadesAna.get(i).getDocumentoMas()+ "\n");
            System.out.println("Dueño:" + EntidadesAna.get(i).getDueño()+ "\n");
            System.out.println("Raza:" + EntidadesAna.get(i).getRaza()+ "\n");
            System.out.println("Color" + EntidadesAna.get(i).getColor()+ "\n");
            System.out.println("<----------------------------------------------------------->");

        }
    }


    //agregar-----------------------------------------------------------------------------------------
    public void getAgregar(String nombre, int documentoMas, String dueño, String raza, String color) {

        System.out.print("\nIngresar nombre Mascota: ");
        nombre = op.next();

        System.out.print("\n ingresar N.I: ");
        documentoMas = op.nextInt();

        System.out.print("\nIngresar nombre del dueño o encargado: ");
        dueño = op.next();

        System.out.print("\n ingresar raza: ");
        raza = op.next();

        System.out.print("\n ingresar Color: ");
        color = op.next();

        EntidadesAna nueva = new EntidadesAna(nombre, documentoMas, dueño, raza, color);
        EntidadesAna.add(nueva);

        System.out.println("Los datos se guardaron exitosamente!!! ");

    }

    public void getVisualizar_mas(){
        for(int i =0; i<EntidadesAna.size(); i++){
            System.out.println(EntidadesAna.size());
        }
    }

    //buscar---------------------------------------------------------------------------------------

    public void getBuscar(int documentoMas) {
        System.out.println("Ingresa el codigo de identificacion de la mascota: ");
        documentoMas = op.nextInt();

        for (int i = 0; i < EntidadesAna.size(); i++)
        {
            if (documentoMas == EntidadesAna.get(i).getDocumentoMas())
            {

                if (documentoMas >= 0)
                {

                    System.out.println("Este dato si se ajusta a la busqueda");
                    System.out.println("-- ESTOS SON LOS DATOS SEGUN ID MASCOTA --\n");
                    System.out.println("Nombre:" + EntidadesAna.get(i).getNombre()+ "\n");
                    System.out.println("Documento:" + EntidadesAna.get(i).getDocumentoMas()+ "\n");
                    System.out.println("Dueño:" + EntidadesAna.get(i).getDueño()+ "\n");
                    System.out.println("Raza:" + EntidadesAna.get(i).getRaza()+ "\n");
                    System.out.println("Color" + EntidadesAna.get(i).getColor()+ "\n");

                } else
                {

                    System.out.println("Dato no se encuentra");}
            } } }


    //modificar----------------------------------------------------------------------------------
    public void modificar(String nombre, int documentoMas, String dueño, String raza, String color) {

        System.out.print("\n Ingresar nombre Mascota: ");
        nombre = op.next();

        System.out.print("\n ingresar N.I: ");
        documentoMas = op.nextInt();

        System.out.print("\n Ingresar nombre del dueño o encargado: ");
        dueño = op.next();

        System.out.print("\n ingresar raza: ");
        raza = op.next();

        System.out.print("\n ingresar Color: ");
        color = op.next();

        EntidadesAna elementoNuevo = new EntidadesAna(nombre, documentoMas, dueño, raza, color);
        EntidadesAna.set(documentoMas, elementoNuevo);

    }
    //Eliminar---------------------------------------------------------------------------
    public void EliminarDatos(int documentoMas) {
        System.out.println("Ingresa el dato que quiere eliminar: : ");
        documentoMas = op.nextInt();

        for (int i = 0; i < EntidadesAna.size(); i++)
        {
            if (documentoMas == EntidadesAna.get(i).getDocumentoMas())
            {

                EntidadesAna.remove(i);

            }

        }}
}
