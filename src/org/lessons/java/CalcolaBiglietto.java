package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Ask age to user
		System.out.println("Inserisci la tua età");
		String age = in.nextLine();
		int intAge = Integer.parseInt(age);
		
//		Ask distance to user
		System.out.println("Inserisci i km della tratta che vuoi percorrere");
		String distanceKm = in.nextLine();
		int intDistanceKm = Integer.parseInt(distanceKm);
		
		in.close();
		
//		Price for km
		float priceForKm = 0.21F;
		
//		Discount under 18
		int percentageUnder = 20;
		
//		Discount over 65
		int percentageOver = 40;
		
		float priceTicket = intDistanceKm * priceForKm;
		
		if(intAge < 18) {
			float discount = priceTicket * percentageUnder / 100;
			priceTicket -= discount;
		} else if (intAge > 65){
			float discount = priceTicket * percentageOver / 100;
			priceTicket -= discount;
		}
		
		System.out.println("Il tuo biglietto costa: " + String.format("%.2f", priceTicket) + " euro");
	}

}
