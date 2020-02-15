package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

	final static private Double percentage = 0.95;
	
	@Override
	public Double calculate(Double price) {
		return price * percentage;
	}

}
