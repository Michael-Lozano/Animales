package Controlador;

import Entidades.EntidadesAna;
import Servicios.ServiciosAna;
import java.util.Scanner;

public class ControladorAna {
    ServiciosAna SerAna = new ServiciosAna();
    EntidadesAna EntAna = new EntidadesAna();
    public void getOpcion() {
        Scanner op = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("\n[1] AGREGAR DATOS MASCOTAS");
            System.out.println("\n[2] BUSCAR MASCOTA ID");
            System.out.println("\n[3] MODIFICAR MASCOTA");
            System.out.println("\n[4] ELIMINAR MASCOTA");
            System.out.println("\n[5] MOSTRAR MASCOTA");
            System.out.println("\n[6] SALIR");
            System.out.println("\nIngresar opcion: ");
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    SerAna.getAgregar(EntAna.getNombre(),EntAna.getDocumentoMas(), EntAna.getDueño(), EntAna.getRaza(), EntAna.getColor());
                    break;

                case 2:
                    SerAna.getBuscar(EntAna.getDocumentoMas());
                    break;

                case 3:
                    SerAna.modificar(EntAna.getNombre(),EntAna.getDocumentoMas(), EntAna.getDueño(), EntAna.getRaza(), EntAna.getColor());

                    break;

                case 4:
                    SerAna.EliminarDatos(EntAna.getDocumentoMas());
                    break;

                case 5:
                    SerAna.Buscar();
                    break;
            }

        } while (opcion != 7);
    }
}
