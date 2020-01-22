
public class AulaApplication {
	
	public String nome; // variavel global
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			
			//Exercicios teste = new Exercicios();
			//teste.exercicio2A(10,20);
			
			// Exercicios numericos
			//Numericos testeNumerico = new Numericos();
			//testeNumerico.ler();
			//testeNumerico.area();
			//testeNumerico.idade();
			
			// Desafio 1
			Calculadora calcula = new Calculadora();
			System.out.println(calcula.calcularSalarioLiquido(1500));
			
			
	}
	
}
