package secao8_exercicioFixacao;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double amountReais (double dollarPrice, double amountDollar) {
		return (amountDollar * IOF + amountDollar) * dollarPrice;

	}
	
}
