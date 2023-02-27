package Controlador;

import Servicios.ServiciosMichael;

import java.util.Scanner;

public class ControladorMichael {

    Scanner sc = new Scanner(System.in);

    ServiciosMichael servicio = new ServiciosMichael();


    private int Menu;

    public void MenuMichael(){

        while (Menu != 4){

            System.out.println("");

            System.out.println("MENU CITAS MASCOTAS");
            System.out.println("[1] AGREGAR UNA CITA");
            System.out.println("[2] ELIMINAR UNA CITA");
            System.out.println("[3] BUSCAR CITAS");
            System.out.println("[4] EXIT");

            Menu = sc.nextInt();

            switch (Menu){

                case 1:

                    System.out.println(" DATOS PARA AGREGAR CITA ");
                    System.out.println(" ");
                    System.out.println(" Nombre del animal ");
                    String Nombre = sc.next();
                    System.out.println(" ");

                    System.out.println(" Documento del animal");
                    int Documento = sc.nextInt();
                    System.out.println(" ");
                    sc.nextLine();
                    System.out.println(" Fecha de cita");
                    String Fecha = sc.nextLine();


                    servicio.AgregarMichael(Nombre,Documento,Fecha);

                    break;

                case 2:

                    System.out.println("ELIMINAR CITA ");
                    System.out.println(" ");
                    System.out.println(" INGRESA EL DOCUMENTO ");
                    int DocumentoElimnacion = sc.nextInt();


                    servicio.EliminarMichael(DocumentoElimnacion);

                    break;


                case 3:

                    servicio.Buscar();

                    break;


                case 4:

                    break;

            }

        }




    }

}

