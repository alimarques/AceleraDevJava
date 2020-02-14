package tdd.calculadora.teste;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {

	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int subtrai = calculadora.subtrai(valorA, valorB);
		
		assertEquals(-1, subtrai);
	}
	
}
