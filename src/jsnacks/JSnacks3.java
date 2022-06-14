package jsnacks;

import java.util.Random;

public class JSnacks3 {

	public static void main(String[] args) {
		//Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		//lista di cognomi, genera una falsa lista di 3 invitati.
		
		String[] nomi = {"Alessia", "Alex", "Valentina"};
		String[] cognomi = {"Biagi", "Panichi", "Di Raco"};
		String nomeCasuale;
		String cognomeCasuale;
		int i;
		
		Random ran = new Random();
		
		for(i = 0; i <= 2; i++) {
			nomeCasuale = nomi[ran.nextInt(nomi.length)];
			cognomeCasuale = cognomi[ran.nextInt(cognomi.length)];
			System.out.println(nomeCasuale + " " + cognomeCasuale);
		}
		
		
		}
	}


