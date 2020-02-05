package aula3;

import java.util.*;

public class Funcionario {
	protected double salario;
	
	public double getSalarioTotal(double bonus) {
		return this.salario + bonus;
	}
	
	@Deprecated public double getTotalSalario(float bonus) {
		return this.salario + bonus;
	}
	
	@SuppressWarnings(value={"unchecked", "rawtypes"})
	public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("dado");
    }
	
	/**
	 * Anotação marcadora para indicar que um método ou classe
	 * está ainda em desenvolvimento
	 */
	public @interface InProgress {
	 
	}
	
	@InProgress
    public double getTotalSalario(double bonus) {
        // Necessita ser implementado mais tarde
        return 0;
    }
     
    /**
     * Tipo anotação para indicar que uma
     * tarefa precisa ser concluída
     */
    public @interface TODO {
        String value();
    }
    
    @TODO(value="O salário total do funcionário = salário + bonus")
    public double getBonusSalario(double bonus) {
    	return 0;
    }
	
}
