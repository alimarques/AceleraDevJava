package desafio3;

import java.util.Map;

public class Main {

	
	public static void main(String[] args) {

		Desafio desafio = new Desafio();
		
		// Ler CSV
		//reader.lerCabecalho();
		//List<String> colunaClube = reader.lerCSV(3);
		// System.out.println(colunaNome.contains("Cristiano Ronaldo"));
		//System.out.println("Tamanho do database: " + colunaClube.size());
		
		//System.out.println(jogadores.get(0).getBirthDate());
		
		// Questao 1
		System.out.println("Questao 1: Numero de nacionalidades distintas");
		System.out.println(desafio.q1());
		
		// Questao 2
		System.out.println("Questao 2: Numero de clubes distintos");
		System.out.println(desafio.q2());
		
		// Questao 3
		System.out.println("Questao 3: Nome dos 20 primeiros");
		System.out.println(desafio.q3());
		
		// Questao 4
		System.out.println("Questao 4: Nome dos 10 com maior eur");
		System.out.println(desafio.q4());
		
		// Questao 5
		System.out.println("Questao 5: Nome dos 10 mais velhos");
		System.out.println(desafio.q5());
		
		// Questao 6
		Map<Integer, Integer> example = desafio.q6();
		for (Integer key : example.keySet()) {    
            Integer value = example.get(key);
            System.out.println(key + " = " + value);
		}

	}

}
