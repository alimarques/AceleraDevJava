
public class Agenda extends Pessoa {
	// Classe agenda armazena 10 pessoas
	
	private Pessoa[] agenda = new Pessoa[10];
	
	
	public void armazenarPessoa(Pessoa pessoa) {
		// armazenar pessoa em posicao livre
		int i = 0;
		while(i<10) {
			if (agenda[i] == null){
				this.agenda[i] = pessoa;
				break;
			}
			i++;
		}
		if (i == 10) {
			System.out.println("Sem posições disponíveis no momento");
		}
	}
	
	public void imprimirAgenda() {
		// Imprimir agenda
		for(Pessoa registro: agenda) {
			if(registro != null) {
				System.out.println(registro.getNome()); // Usar o metodo de imprimir de Pessoa
			}
		}
	}
	
	public void imprimirPosicao(int index) {
		// Imprimir pessoa pela posicao
		agenda[index].imprimir();
	}
	
	public void imprimirPessoa(String nome) {
		// Imprimir pessoa pelo nome
		int i = 0;
		while(i<10) {
			if(agenda[i] != null) {
				if(agenda[i].getNome() == nome) {
					agenda[i].imprimir(); // Usar o metodo de imprimir de Pessoa
					break;
				}
			}
			i++;
		}
		if (i == 10) {
			System.out.println("Registro nao encontrado");
		}
	}
	
	public void removerPessoa(String nome) {
		// Imprimir pessoa pelo nome
		int i = 0;
		while(i<10) {
			if(agenda[i].getNome() == nome) {
				agenda[i] = null; // Usar o metodo de imprimir de Pessoa
				break;
			}
			i++;
		}
		if (i == 10) {
			System.out.println("Registro nao encontrado");
		}
	}
	
	public void consultarVagas() {
		int contadora = 0;
		for(int i=0;i<10;i++) {
			if(agenda[i] == null) {
				contadora++;
			}
		}
		if(contadora==0) {
			System.out.println("Sem espaco disponivel");
		} else {
			System.out.println("Espacos disponiveis: "+contadora);
		}
	}
	

	public final Pessoa[] getAgenda() {
		return agenda;
	}

	public final void setAgenda(Pessoa[] agenda) {
		this.agenda = agenda;
	}
	
	
}
