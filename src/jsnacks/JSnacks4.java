package jsnacks;

import java.util.Arrays;
import java.util.Random;

public class JSnacks4 {

	public static void main(String[] args) {
		//Crea un array di numeri interi
		//e fai la somma di tutti gli elementi che sono in posizione dispari
		
		int[] numeri = new int [50];
		int somma = 0;
		
		Random rand = new Random();
		
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = rand.nextInt(101);
		}
		
		System.out.println(Arrays.toString(numeri));
		
		for (int i = 0; i < numeri.length; i++) {
			if ((i % 2) != 0) {
				somma += numeri[i];
			}
		}
				
		System.out.println("La somma degli elementi in posizione dispari é: " + somma);

		
	}

}
