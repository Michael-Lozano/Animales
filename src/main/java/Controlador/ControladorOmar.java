package Controlador;

import Entidades.EntidadesOmar;
import Servicios.ServiciosOmar;

import java.util.Scanner;

public class ControladorOmar {
    ServiciosOmar Servi_Omar = new ServiciosOmar();
    EntidadesOmar Enti_Omar = new EntidadesOmar();

    public void Menu_Omar(){
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        while (numero == 0){
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("\n[1] AGREGAR DATOS MASCOTAS");
            System.out.println("\n[2] BUSCAR MASCOTA ID");
            System.out.println("\n[3] MODIFICAR MASCOTA");
            System.out.println("\n[4] ELIMINAR MASCOTA");
            System.out.println("\n[5] MOSTRAR MASCOTA");
            System.out.println("\n[6] SALIR");
            System.out.println("\nIngresar opcion: ");
            int pregunta = sc.nextInt();

            switch (pregunta){

                case 1:
                    Servi_Omar.Agregar_Enfermedad(Enti_Omar.getNombre_Mascota(), Enti_Omar.getTipo_Enfermedad(), Enti_Omar.getMortalidad(), Enti_Omar.getCodigo_Dueño());
                    break;

                case 2:
                    Servi_Omar.Buscar_Enfermedad_ID(Enti_Omar.getCodigo_Dueño());
                    break;

                case 3:
                    Servi_Omar.Modificar_Enfermedad(Enti_Omar.getNombre_Mascota(), Enti_Omar.getTipo_Enfermedad(), Enti_Omar.getMortalidad(), Enti_Omar.getCodigo_Dueño());
                    break;

                case 4:
                    Servi_Omar.Eliminar_Enfermedad(Enti_Omar.getCodigo_Dueño());
                    break;

                case 5:
                    Servi_Omar.Mostrar_Todas_las_Enfermemdades();
                    break;

                case 6:
                    break;

            }
        }
    }
}
