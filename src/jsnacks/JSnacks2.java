package jsnacks;

import java.util.Scanner;

public class JSnacks2 {

	public static void main(String[] args) {
		//Chiedi all'utente di inserire un numero, se è pari stampa il numero,
		//se è dispari stampa il numero successivo

		int numeroInserito;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Inserisci un numero intero:");
		numeroInserito = scan.nextInt();
		
		if ((numeroInserito % 2) == 0) {
			System.out.println(numeroInserito);
		} else {
			System.out.println(numeroInserito + 1);
		}
		
		
		
		
		scan.close();
	}

}
