
public class Agenda extends Pessoa {
	
	private Pessoa[] array = new Pessoa[10];
	
	
	public void armazenarPessoa(int posicao, Pessoa pessoa) { // while
		array[posicao] = pessoa;
	}
	
	public void imprimirAgenda() {
		for(int i = 0; i<10;i++) {
			System.out.println(this.array[i]); // Usar o metodo de imprimir de Pessoa
		}
	}
	

	public final Pessoa[] getAgenda() {
		return array;
	}

	public final void setAgenda(Pessoa[] agenda) {
		this.array = array;
	}
	
	
}
