package aula1;

public class Impressao {
	
	public void imprimir(String nome, int a) {
		System.out.println(nome+" "+a);
	}
	
	public void imprimir(String nome, float a) {
		System.out.println(nome+" "+a);
	}
	
	public void imprimir(String nome, double a) {
		System.out.println(nome+" "+a);
	}
	
	public void imprimir(String nomeA, String nomeB, int a, int b) {
		System.out.println(nomeA +" "+ a + "\n" + nomeB +" "+ b);
	}
	
	public void imprimir(String nomeA, String nomeB, String nomeC, int a, int b, int c) {
		System.out.println(nomeA +" "+ a + "\n" + nomeB +" "+ b + "\n" + nomeC +" "+ c);
	}
}
