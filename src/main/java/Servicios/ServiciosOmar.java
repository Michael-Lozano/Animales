package Servicios;

import Entidades.EntidadesOmar;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosOmar {

    private ArrayList<EntidadesOmar> EntidadesOmar;
    Scanner sc = new Scanner(System.in);

    public void Agregar_Enfermedad(String nombre_Mascota, String tipo_Enfermedad, String mortalidad, int Codigo_Dueño){
        System.out.println("Nombre de la masctota: ");
        nombre_Mascota = sc.next();

        System.out.println("Tipo enfermedad: ");
        tipo_Enfermedad = sc.next();

        System.out.println("Mortalidad de la enfermedad: ");
        mortalidad = sc.next();

        System.out.println("Codigo de dueño: ");
        Codigo_Dueño = sc.nextInt();

        EntidadesOmar info = new EntidadesOmar(nombre_Mascota, tipo_Enfermedad, mortalidad, Codigo_Dueño);
        EntidadesOmar.add(info);

        System.out.println("<--------------------------------------->");
        System.out.println("DATOS REGISTRADOS CORRECTAMENTE");
    }

    public void Buscar_Enfermedad_ID(int codigo_Dueño){

        System.out.println("Digite codigo del dueño: ");
        int cod_Due = sc.nextInt();

        for (int i = 0; i < EntidadesOmar.size(); i++){

            if (cod_Due == EntidadesOmar.get(i).getCodigo_Dueño()){

                if (cod_Due > 0){
                    System.out.println("-- ESTOS SON LOS DATOS SEGUN ID ENFERMEDAD --\n");
                    System.out.println("Nombre de la enfermedad:" + EntidadesOmar.get(i).getNombre_Mascota()+ "\n");
                    System.out.println("Tipo de enfermedad:" + EntidadesOmar.get(i).getTipo_Enfermedad()+ "\n");
                    System.out.println("Mortalidad:" + EntidadesOmar.get(i).getMortalidad()+ "\n");
                    System.out.println("Codigo dueño:" + EntidadesOmar.get(i).getCodigo_Dueño()+ "\n");

                }else {
                    System.out.println("ENFERMEDAD NO ENCONTRADA");
                }

            }else{
                System.out.println("ENFERMEDAD NO ENCONTRADA");
            }
        }
    }


    public void Modificar_Enfermedad(String Nom_Enfe, String Tip_Enfe, String Mort_Enfe, int Cod_Due){
        System.out.println("Nueva enfermedad: ");
        Nom_Enfe = sc.next();

        System.out.println("Nuevo tipo de enfermedad: ");
        Tip_Enfe = sc.next();

        System.out.println("Nueva mortalidad de la enfermedad: ");
        Mort_Enfe = sc.next();

        System.out.println("Nuevo codigo del dueño: ");
        Cod_Due = sc.nextInt();

        Entidades.EntidadesOmar info_Nue = new EntidadesOmar(Nom_Enfe, Tip_Enfe, Mort_Enfe, Cod_Due);
        EntidadesOmar.set(Cod_Due, info_Nue);
    }

    public void Eliminar_Enfermedad(int Id_Due){

        System.out.println("Codigo del dueño: ");
        int Id_Due_Supr = sc.nextInt();

        for (int i = 0; i < EntidadesOmar.size(); i++){

            if (Id_Due_Supr == EntidadesOmar.get(i).getCodigo_Dueño()){

                EntidadesOmar.remove(i);

            }
        }
    }

    public void Mostrar_Todas_las_Enfermemdades(){
        for (int i = 0; i < EntidadesOmar.size(); i++) {
            System.out.println("<----------------------------------------------------------->");
            System.out.println("Nombre Dueño:" + EntidadesOmar.get(i).getCodigo_Dueño()+ "\n");
            System.out.println("Nombre Mascota:" + EntidadesOmar.get(i).getNombre_Mascota()+ "\n");
            System.out.println("Enfermedad:" + EntidadesOmar.get(i).getTipo_Enfermedad()+ "\n");
            System.out.println("Mortalidad de la enfermedad:" + EntidadesOmar.get(i).getMortalidad()+ "\n");
            System.out.println("<----------------------------------------------------------->");

        }
    }


}
