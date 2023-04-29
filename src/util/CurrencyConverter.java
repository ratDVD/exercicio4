package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double calculo(double price, double dollars) {
		return price * dollars + (IOF * price * dollars);
	}

}
