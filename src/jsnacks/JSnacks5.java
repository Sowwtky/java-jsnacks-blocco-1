package jsnacks;

import java.util.Scanner;

public class JSnacks5 {

	public static void main(String[] args) {
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
		di posizioni nelle quali i caratteri corrispondenti sono diversi.
 		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.
		 */
		
		Scanner scan = new Scanner (System.in);
		String parola1 = null;
		String parola2 = null;
		
		
		do {
			System.out.println("Inserisci due parole di uguale lunghezza:");
			System.out.print("Parola 1: ");
			parola1 = scan.nextLine();
			System.out.print("Parola 2: ");
			parola2 = scan.nextLine();
		} while (parola1.length() != parola2.length());
		
		
		if (parola1.length() == parola2.length()) {
			
			int distanzaHamming = 0;
			
			char[] parola1Array = parola1.toCharArray();
			char[] parola2array = parola2.toCharArray();
			
			for (int i = 0; i < parola1Array.length; i++) {
				if (parola1Array[i] != parola2array[i]) {
					distanzaHamming++;
				}
			}
			
		System.out.println("La distanza di Hamming tra le due parole é: " + distanzaHamming);
		} else {
			System.out.println("Le parole sono di lunghezze diverse");
		}
		
		scan.close();
	}

}
