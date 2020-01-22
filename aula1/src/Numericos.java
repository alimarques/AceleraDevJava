import java.util.Scanner;

public class Numericos {
	
	Scanner leitura = new Scanner(System.in);
	
	public void ler() {
		int teclado = leitura.nextInt();
		Imprimir imprime = new Imprimir();
		imprime.imprimir("antecessor:",(teclado-1));
	}
	
	public void area() {
		int base = leitura.nextInt();
		int altura = leitura.nextInt();
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Area:", base*altura);
	}
	
	public void idade() {
		int anos = leitura.nextInt();
		int meses = leitura.nextInt();
		int dias = leitura.nextInt();
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Idade em dias:", dias+meses*30+anos*365);		
	}
	
}
