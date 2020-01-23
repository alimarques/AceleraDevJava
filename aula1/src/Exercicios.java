
public class Exercicios {
	
	public void trocarValor(int a, int b) {
		// Trocar o valor de a e b sem criar uma nova variavel
		b = b+a;
		a = b-a;
		b = b-a;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de A:", "Valor de B:", a, b);
	}
	
	public void exercicio2A(int a, int b) {
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de B:",b);
		b = 5;
		imprime.imprimir("Valor de A:", "Valor de B:", a, b);
	}
	
	public void exercicio2B(int a, int b) {
		int c;
		c = a+b;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de C:",c);
		b = 10;
		imprime.imprimir("Valor de B:", "Valor de C:", b, c);
		c = a+b;
		imprime.imprimir("Valor de A:", "Valor de B:","Valor de C:", a, b,c);
	}
	
	public void exercicio2C(int a, int b) {
		int c;
		c = a;
		b = c;
		a = b;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de A:", "Valor de B:","Valor de C:", a, b,c);
	}
	
	public void exercicio2D(int a) {
		int b;
		b = a+1;
		a = b+1;
		b = a+1;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de A:", a);
		a = b+1;
		imprime.imprimir("Valor de A:", "Valor de B:", a, b);
	}
	
	public void exercicio2E(int a, int b) {
		int c;
		c = a+b;
		b = 20;
		a = 10;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de A:", "Valor de B:", "Valor de C:", a, b,c);
	}
	
	public void exercicio2F(int x, int y) {
		int z;
		z = y - x;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("Valor de Z:", z);
		x = 5;
		y = x+z;
		imprime.imprimir("Valor de X:", "Valor de Y:","Valor de Z:", x, y, z);
	}
	
}
