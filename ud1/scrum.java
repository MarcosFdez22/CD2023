package scrum;

import java.util.Scanner;

public class scrum {

	public static void main(String[] args) {
	

		/*Calcula la IMC de una persona cuyo peso y altura los tenemos almacenados 
		en sus respectivas variables. Debes investigar cuál es la fórmula del IMC.
		Recoger los dos datos por teclado. */
		
		
		//Se declara una variable sc de tipo Scanner para leer una entrada de teclado
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Indique su peso (kg):");
		double peso = sc.nextDouble();
		
		System.out.println("Indique su altura (m):");
		double altura = sc.nextDouble();
	
		//Recordatorio: cerrar el Scanner cuando ya no se necesite
		sc.close();
		
		System.out.println("=================================");
		System.out.println("Peso: " + peso + "kg");
		System.out.println("Altura: " + altura + "m");
		
		//Fórmula del IMC
		System.out.println("IMC calculado: " + (peso/(altura*altura)));
		System.out.println("=================================");
		System.out.println("\n TABLA DE VALORES IMC");
		System.out.println("Delgado: <18.5");
		System.out.println("Normal: entre 18.5 y 24.9");
		System.out.println("Sobrepeso: entre 25 y 29.9");
		System.out.println("Obeso:30 o más");
	}

}
