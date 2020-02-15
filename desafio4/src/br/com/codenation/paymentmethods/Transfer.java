package br.com.codenation.paymentmethods;

public class Transfer implements PriceStrategy {

	final static private Double percentage = 0.92;
	
	@Override
	public Double calculate(Double price) {
		return price * percentage;
	}

}