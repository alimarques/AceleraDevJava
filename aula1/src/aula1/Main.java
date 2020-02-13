package aula1;

public class Main {
	
	public String nome; // variavel global
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primeiro Hello World em Java
		System.out.println("Hello World!");
		
		// Exercicios de atribuicao de valores
		//executarExercicios();
			
		// Exercicios numericos sobre leitura e atribuicao de valores
		ExerciciosNumericos exercicioTeste = new ExerciciosNumericos();
		exercicioTeste.precificarCarro();
		exercicioTeste.calcularSalarioVendedor(3, 100000, 1200, 0.01);
			
	}
	
	public static void executarExercicios() {
		Exercicios teste = new Exercicios();
		System.out.println("Exercicio 2A");
		teste.exercicio2A(10, 20);
		System.out.println("Exercicio 2B");
		teste.exercicio2B(30, 20);
		System.out.println("Exercicio 2C");
		teste.exercicio2C(10, 20);
		System.out.println("Exercicio 2D");
		teste.exercicio2D(10);
		System.out.println("Exercicio 2E");
		teste.exercicio2E(10, 5);
		System.out.println("Exercicio 2F");
		teste.exercicio2F(1, 2);
		
	}
	
}
