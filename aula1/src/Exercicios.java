
public class Exercicios {
	
	public void exercicio1(int a, int b) {
		b = b+a;
		a = b-a;
		b = b-a;
		System.out.println("a: "+a+" b: "+b);
	}
	
	public void exercicio2A(int a, int b) {
		System.out.println("b: "+b);
		b = 5;
		System.out.println("a:"+a+" b: "+b);
	}
	
	public void exercicio2B(int a, int b) {
		int c;
		c = a+b;
		System.out.println("c: "+c);
		b = 10;
		System.out.println("b: "+b+" c: "+c);
		c = a+b;
		System.out.println("a: "+a+" b: "+b+" c: "+c);
	}
	
	public void exercicio2C(int a, int b) {
		int c;
		c = a;
		b = c;
		a = b;
		System.out.println("a: "+a+" b: "+b+" c: "+c);
	}
	
	public void exercicio2D(int a, int b) {
		b = a+1;
		a = b+1;
		b = a+1;
		Imprimir imprime = new Imprimir();
		imprime.imprimir("a: ", a);
		a = b+1;
		System.out.println("a: "+a+" b: "+b);
	}
	
	public void exercicio2E(int a, int b) {
		int c;
		c = a+b;
		b = 20;
		a = 10;
		System.out.println("a: "+a+" b: "+b+" c: "+c);
	}
	
	public void exercicio2F() {
		int x, y, z;
		x = 1;
		y = 2;
		z = y - x;
		System.out.println("z: "+z);
		x = 5;
		y = x+z;
		System.out.println("x: "+x+" y: "+y+" z: "+z);
	}
	
}
