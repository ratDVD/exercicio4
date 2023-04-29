package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price;
		double dollars;
		
		System.out.println("What is the dollar price?");
		price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		dollars = sc.nextDouble();
		System.out.printf("Ammount to be paid in reais = %.2f", CurrencyConverter.calculo(price, dollars));
		
		sc.close();
	}

}
