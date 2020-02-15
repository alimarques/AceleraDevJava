package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {
	
	final static private Double percentage = 0.98;

	@Override
	public Double calculate(Double price) {
		return price * percentage;
	}

}
