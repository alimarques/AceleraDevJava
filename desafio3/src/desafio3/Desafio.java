package desafio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Desafio {
	
	CSVReader reader = new CSVReader("/home/ali/codenation/java-3/src/main/resources/data.csv");
	List<Jogador> jogadores = reader.lerCSV();
	
	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		Set<String> uniqueNationality = jogadores.stream()
				.map(x->x.getNationality())
				.collect(Collectors.toSet());
		return uniqueNationality.size();
	}
	
	
	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		Set<String> uniqueClube = jogadores.stream()
				.map(x-> x.getClub())
				.collect(Collectors.toSet());
		if(uniqueClube.contains("")) {
			uniqueClube.remove("");
		}
		return uniqueClube.size();
	}
	
	
	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		List<String> nome20 = jogadores.stream()
				.map(x-> x.getFullName())
				.collect(Collectors.toList());
		return nome20.subList(0, 20);
	}
	
	
	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		List<Jogador> jogadoresOrdenados = jogadores.stream()
			.sorted(Comparator.comparing((Jogador jogador) -> jogador.getEur()).reversed())
			.collect(Collectors.toList());
	
		List<String> nomesJogadores = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			nomesJogadores.add(jogadoresOrdenados.get(i).getFullName());
		}
		
		return nomesJogadores;
	}
	
	
	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		List<Jogador> jogadoresOrdenados = jogadores.stream()
				.sorted(Comparator.comparing((Jogador jogador) -> jogador.getBirthDate()))
				.collect(Collectors.toList());
			
		List<String> nomesJogadores = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			nomesJogadores.add(jogadoresOrdenados.get(i).getFullName());
		}
			
		return nomesJogadores;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		List<Integer> jogadoresIdades = jogadores.stream()
				.map(x-> x.getAge())
				.collect(Collectors.toList());
		
		Map<Integer, Long> mapaIdades = jogadoresIdades.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<Integer, Integer> mapaIdadesAtualizada = mapaIdades.entrySet().stream()
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue().intValue()));
		
		return mapaIdadesAtualizada;
	}

}
