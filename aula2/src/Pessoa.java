import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String nome;
	private double altura;
	private String dataNascimento;
	
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Altura: " + this.altura);
	}
	
	public void calcularIdade() { // Criar uma Classe
		try{
			Date hoje = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse(this.dataNascimento);
			System.out.println("Idade (ao final do ano): " + (hoje.getYear() - date.getYear()));
			}catch (Exception e) {e.printStackTrace();}
		
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
	
}
