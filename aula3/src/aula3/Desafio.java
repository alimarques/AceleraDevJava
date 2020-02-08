package aula3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Desafio {
// Desafio 3 - leitura de CSV
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler CSV
		CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
		reader.lerCabecalho();
		List<String> colunaClube = reader.lerCSV(3);
		// System.out.println(colunaNome.contains("Cristiano Ronaldo"));
		System.out.println("Tamanho do database: " + colunaClube.size());
		
		// Questao 1
		System.out.println("Questao 1: Numero de nacionalidades distintas");
		System.out.println(q1());
		
		// Questao 2
		System.out.println("Questao 2: Numero de clubes distintos");
		System.out.println(q2());
		
		// Questao 3
		System.out.println("Questao 3: Nome dos 20 primeiros");
		System.out.println(q3());
		
		// Questao 4
		System.out.println("Questao 4: Nome dos 10 com maior eur");
		System.out.println(q4());
		
	}
	
	
	
	
	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public static int q1() {
		CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
		List<String> nacionalidade = reader.lerCSV(14);
		Set<String> uniqueNacionalidade = new HashSet<String>(nacionalidade);
		
		return uniqueNacionalidade.size();
	}
	
	
	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public static int q2() {
		CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
		List<String> clube = reader.lerCSV(3);
		Set<String> uniqueClube = new HashSet<String>(clube);
		if(uniqueClube.contains("")) {
			uniqueClube.remove("");
		}
		return uniqueClube.size();
	}
	
	
	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public static List<String> q3() {
		CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
		List<String> nome20 = reader.lerCSV(2);
		return nome20.subList(0, 20);
	}
	
	
	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public static List<String> q4() {
		CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
		List<String> eur = reader.lerCSV(18);
		return eur.subList(0, 10);
	}
	
	
	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		return null;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return null;
	}

}
