
public class Calculadora {

	public long calcularSalarioLiquido(double salarioBase) {
		
		double salarioLiquido;
		
		if (salarioBase < 1039) {
			salarioLiquido = 0.0;
		} else {
			// Calcula INSS
			salarioLiquido = calcularInss(salarioBase);
			// Calcula IRRF
			salarioLiquido = calcularIrrf(salarioLiquido);
		}
		
		return Math.round(salarioLiquido);
	}
	
	private double calcularInss(double salarioBase) {
		float desconto;
		double salarioNovo;
		
		// Acha faixa salarial
		if (salarioBase <= 1500) {
			desconto = 8;
		} else if (salarioBase <= 4000) {
			desconto = 9;
		} else {
			desconto = 11;
		}
		
		salarioNovo = salarioBase * (1.0 - desconto/100);
		
		// Calcula desconto
		System.out.println(desconto);
		System.out.println(salarioNovo);
		return (salarioNovo);
		
	}
	
	private double calcularIrrf(double salarioBase) {
		double desconto;
		double salarioNovo;
		
		// Acha faixa salarial
		if (salarioBase <= 3000) {
			desconto = 0;
		} else if (salarioBase <= 6000) {
			desconto = 7.5;
		} else {
			desconto = 15;
		}
		
		salarioNovo = salarioBase * (1.0 - desconto/100);
		
		// Calcula desconto
		System.out.println(desconto);
		System.out.println(salarioNovo);
		return (salarioNovo);
		
	}

}

