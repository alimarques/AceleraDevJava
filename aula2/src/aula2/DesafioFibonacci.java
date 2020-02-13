package aula2;

import java.util.ArrayList;
import java.util.List;

public class DesafioFibonacci {

	public List<Integer> fibonacci() {
		// Constroi array com sequencia de Fibonacci
		List<Integer> fibonacci = new ArrayList<Integer>();
		// A sequencia de fibonacci sempre comeca com 0 e 1
		// Os termos seguintes são a soma dos dois anteriores
		fibonacci.add(0);
		fibonacci.add(1);
		
		int elemento = 1;
		while(elemento <= 350) {
			fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
			elemento = fibonacci.get(fibonacci.size() - 1);
		}
		
		return fibonacci;
	}

	public Boolean isFibonacci(Integer a) {
		List<Integer> fibonacci = fibonacci();
		for(Integer element: fibonacci) {
			if(a.equals(element)) {
				return true;
			}
		}
		return false;
	}
}
