package aula2;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	// classe Pessoa que recebe atributos basicos de uma pessoa fisica
	
	protected String nome;
	private double altura;
	private String dataNascimento;
	// Dados de identificacao
	private String cpf;
	private String tituloDeEleitor;
	// Uso de objeto de outra classe
	public Data data;
	
	
	public void imprimir() {
		// Imprime os atributos basicos
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Titulo de eleitor: " + this.tituloDeEleitor);
		System.out.println("Altura: " + this.altura);
	}
	
	public void calcularIdade() {
		// Calcula a idade da pessoa
		data = new Data();	// instanciar objeto data para usar metodos
		LocalDate startDate = data.transformarStringtoDate(getDataNascimento());
		LocalDate hoje = LocalDate.now();
		Period periodo = data.calcularIdade(startDate, hoje);
		System.out.println("Idade: " + periodo.getYears()+" anos");
	}	
	
	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final double getAltura() {
		return altura;
	}

	public final void setAltura(double altura) {
		this.altura = altura;
	}

	public final String getDataNascimento() {
		return dataNascimento;
	}

	public final void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public final String getCpf() {
		return cpf;
	}
	
	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public final String getTituloDeEleitor() {
		return tituloDeEleitor;
	}
	
	public final void setTituloDeEleitor(String tituloDeEleitor) {
		this.tituloDeEleitor = tituloDeEleitor;
	}
	
}
