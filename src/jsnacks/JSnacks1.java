package jsnacks;

import java.util.Scanner;

public class JSnacks1 {

	public static void main(String[] args) {
		//Il software deve chiedere per 5 volte all’utente di inserire un numero.
		//Il programma stampa la somma di tutti i numeri inseriti.
		//Esegui questo programma in due versioni, con il for e con il while.

		Scanner scan = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;
		boolean valido1 = false;
		boolean valido2 = false;
		boolean valido3 = false;
		boolean valido4 = false;
		boolean valido5 = false;
		
		
		
		while (valido1 == false) {
			
			System.out.println("Digita un numero da 1 a 100:");
			numero1 = scan.nextInt();
			
			if (numero1 > 0 && numero1 < 101) {
				System.out.println("Hai inserito il numero: " + numero1);
				valido1 = true;
			} else {
				System.out.println("Numero non valido");
			} 
		}
		
		while (valido2 == false) {
			
			System.out.println("Digita un numero da 1 a 100:");
			numero2 = scan.nextInt();
			
			if (numero2 > 0 && numero2 < 101) {
				System.out.println("Hai inserito il numero: " + numero2);
				valido2 = true;
			} else {
				System.out.println("Numero non valido");
			} 
		}
		
		while (valido3 == false) {
			
			System.out.println("Digita un numero da 1 a 100:");
			numero3 = scan.nextInt();
			
			if (numero3 > 0 && numero3 < 101) {
				System.out.println("Hai inserito il numero: " + numero3);
				valido3 = true;
			} else {
				System.out.println("Numero non valido");
			} 
		}
		
		while (valido4 == false) {
			
			System.out.println("Digita un numero da 1 a 100:");
			numero4 = scan.nextInt();
			
			if (numero4 > 0 && numero4 < 101) {
				System.out.println("Hai inserito il numero: " + numero4);
				valido4 = true;
			} else {
				System.out.println("Numero non valido");
			} 
		}
		
		while (valido5 == false) {
			
			System.out.println("Digita un numero da 1 a 100:");
			numero5 = scan.nextInt();
			
			if (numero5 > 0 && numero5 < 101) {
				System.out.println("Hai inserito il numero: " + numero5);
				valido5 = true;
			} else {
				System.out.println("Numero non valido");
			} 
		}
		
		int somma = numero1 + numero2 + numero3 + numero4 + numero5;
		
		System.out.println("La somma dei numeri inseriti é: " + somma);
		
		scan.close();
	}

}
