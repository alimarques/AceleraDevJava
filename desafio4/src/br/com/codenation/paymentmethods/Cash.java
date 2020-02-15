package br.com.codenation.paymentmethods;

public class Cash implements PriceStrategy {

	final static private Double percentage = 0.9;
	
	@Override
	public Double calculate(Double price) {
		return price * percentage;
	}

}
