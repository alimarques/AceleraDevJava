
public class Elevador {
	// Classe Elevador armazena dados de um elevador
	
	private int andarAtual;		// andar atual inicializado no terreo 0
	private int totalAndar;		// total de andares no predio
	private int capacidade;		// capacidade de pessoas no elevador
	private int quantPessoas;	// quantidade atual de pessoas
	
	public Elevador(int capacidade, int totalAndar) {
		// Inicializa o elevador
		this.capacidade = capacidade;
		this.totalAndar = totalAndar;
		this.andarAtual = 0;
		this.quantPessoas = 0;
	}
	
	public void entrar() {
		// Entra uma pessoa
		if((this.quantPessoas+1) <= this.capacidade) {
			this.quantPessoas ++;
		} else {
			System.out.println("Quantidade superior a suportada");
		}
	}
	
	public void entrar(int quantidade) {
		// Entra quantidade de pessoas
		if((this.quantPessoas+quantidade) <= this.capacidade) {
			this.quantPessoas += quantidade;
		} else {
			System.out.println("Quantidade superior a suportada");
		}
	}
	
	public void sair() {
		// Sai uma pessoa
		if(this.quantPessoas>0) {
			this.quantPessoas --;
		} else {
			System.out.println("Quantidade superior a existente");
		}
	}
	
	public void sair(int quantidade) {
		// Sai quantidade de pessoas
		if((this.quantPessoas-quantidade)>=0) {
			this.quantPessoas -= quantidade;
		} else {
			System.out.println("Quantidade superior a existente");
		}
	}
	
	public void subir(int andar) {
		// Subir andares
		if((this.andarAtual+andar)<= this.totalAndar) {
			this.andarAtual += andar;
		} else {
			System.out.println("Andar superior ao existente");
		}
	}
	
	public void descer(int andar) {
		// Descer andares
		if((this.andarAtual-andar)>= 0) {
			this.andarAtual -= andar;
		} else {
			System.out.println("Andar inferior ao existente");
		}
	}
	
	
	// gets and sets
	public final int getAndarAtual() {
		return andarAtual;
	}
	public final void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public final int getTotalAndar() {
		return totalAndar;
	}
	public final void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}
	public final int getCapacidade() {
		return capacidade;
	}
	public final void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public final int getQuantPessoas() {
		return quantPessoas;
	}
	public final void setQuantPessoas(int quantidadePessoas) {
		this.quantPessoas = quantidadePessoas;
	}
	
	
}
