package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06f;
	
	public static double dollarPrice(double dollarValue, double dollarAmount){
		double dollarPriceWhitoutIOF = dollarAmount * dollarValue;
		double tax = dollarPriceWhitoutIOF * IOF;
		return dollarPriceWhitoutIOF + tax;
	}
	
	
}
