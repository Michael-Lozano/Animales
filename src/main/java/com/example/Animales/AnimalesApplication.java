package com.example.Animales;

import Controlador.ControladorAna;
import Controlador.ControladorMichael;
import Controlador.ControladorOmar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class AnimalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalesApplication.class, args);
		System.out.println("\n --- BIENVENIDO A LA REGISTRADURIA PARA MASCOTAS ---");
		Scanner op = new Scanner(System.in);

		ControladorAna conAna = new ControladorAna();
		ControladorMichael conMi = new ControladorMichael();
		ControladorOmar conOm = new ControladorOmar();

		int opcion = 0;



		do{
			System.out.println("\n MENU DE OPCIONES");
			System.out.println("\n[1] REGISTRO MASCOTAS");
			System.out.println("\n[2] CITAS MASCOTAS");
			System.out.println("\n[3] ENFERMEDADES MASCOTAS");
			System.out.println("\n[4] SALIR");
			System.out.println("\nIngresar opcion: ");
			opcion = op.nextInt();

			switch(opcion){
				case 1:
					conAna.getOpcion();
					break;

				case 2:
					break;

				case 3:
					break;

			}

		}while(opcion !=4);}
	}
