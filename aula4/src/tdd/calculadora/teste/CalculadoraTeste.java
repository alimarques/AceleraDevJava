package tdd.calculadora.teste;

import org.junit.jupiter.api.Assertions;
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
		int subtracao = calculadora.subtrai(valorA, valorB);
		
		assertEquals(-1, subtracao);
	}
	
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);
		
		assertEquals(3, divisao);
	}
	
	@Test
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
            throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        
        Assertions.assertThrows(ArithmeticException.class, () -> {
        	calculadora.divide(valorA, valorB);
        });
    }
	
}
