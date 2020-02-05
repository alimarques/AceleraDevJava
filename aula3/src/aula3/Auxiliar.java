package aula3;

public class Auxiliar extends Funcionario {
	
	protected double extra;
	
	@Override
	public double getSalarioTotal(double bonus) {
		return this.salario + this.extra + bonus;
	}
	
}
