package aula3;

import java.util.Map;
import java.util.function.Function;

public class AulaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Interfaces
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Ali");
		pessoa.setSobrenome("Marques");
		pessoa.setIdade(21);
		
		Map<String, Object> atributos = ReflectionMapper.getAttributesMap(pessoa);
 
		for(String key : atributos.keySet()) {
			System.out.println(key + ": " + atributos.get(key));
		}
		
		
		// Funcoes Lambda
		Function<Integer, Integer> function = (x) -> x*3 + 2;
		Integer resultado = function.apply(1);
		System.out.print(resultado);
		
		
	}

}
