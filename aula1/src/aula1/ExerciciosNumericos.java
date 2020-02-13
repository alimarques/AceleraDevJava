package aula1;

import java.util.Scanner;

public class ExerciciosNumericos {
	
	// Cria objeto da classe scan para ler input do usuario
	Scanner leitura = new Scanner(System.in);
	
	public void calcularAntecessor() {
		int teclado = leitura.nextInt();
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Antecessor:",(teclado-1));
	}
	
	public void calcularArea() {
		System.out.println("Base: ");
		int base = leitura.nextInt();
		System.out.println("Altura: ");
		int altura = leitura.nextInt();
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Area:", base*altura);
	}
	
	public void calcularIdade() {
		System.out.println("Anos: ");
		int anos = leitura.nextInt();
		System.out.println("Meses: ");
		int meses = leitura.nextInt();
		System.out.println("Dias: ");
		int dias = leitura.nextInt();
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Idade em dias:", dias+meses*30+anos*365);		
	}
	
	public void calcularVotos() {
		System.out.println("Numero total de eleitores: ");
		int eleitores = leitura.nextInt();
		int branco = leitura.nextInt();
		System.out.println("Votos em brancos: ");
		System.out.println("Votos nulos: ");
		int nulo = leitura.nextInt();
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Percentual de votos validos:", "Percentual de votos nulos:","Percentual de votos em branco:", (eleitores-(branco+nulo))*100/eleitores, nulo*100/eleitores, branco*100/eleitores);		
	}
	
	public void calcularSalario() {
		System.out.println("Salario atual: ");
		float salario = leitura.nextFloat();
		System.out.println("Reajuste (em porcentagem): ");
		float reajuste = leitura.nextFloat();
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Novo salario:", salario-salario*reajuste/100);		
	}
	
	public void precificarCarro() {
		double distribuidor = 0.28;
		double impostos = 0.45;
		System.out.println("Custo de fabrica: ");
		float fabrica = leitura.nextFloat();

		Impressao imprime = new Impressao();
		imprime.imprimir("Novo preco:", Math.floor(fabrica*(1+distribuidor+impostos)));		
	}
	
	public void calcularSalarioVendedor(int carros, double vendas, double salario, double comissao) {
		double salarioNovo = salario + comissao*carros + 0.05*vendas;
		
		Impressao imprime = new Impressao();
		imprime.imprimir("Salario reajustado:", Math.floor(salarioNovo));		
	}
	
}