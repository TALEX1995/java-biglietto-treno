package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Ask age to user
		System.out.println("Inserisci la tua età");
		String age = in.nextLine();
		
//		Ask distance to user
		System.out.println("Inserisci i km della tratta che vuoi percorrere");
		String distanceKm = in.nextLine();
		
		in.close();
	}

}
