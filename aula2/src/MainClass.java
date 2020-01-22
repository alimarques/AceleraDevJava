import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construtores
		Aluno aluno = new Aluno("Ali");
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = null;

		// Heranca
		aluno2.setCpf("45184880836");

		// Polimorfismo
		aluno2.salvar();

		// Excecoes
		//aluno2.salvar(aluno3);
		
		// Pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento("06/11/1998");
		pessoa.setAltura(1.59);
		pessoa.setNome("Ali");
		pessoa.imprimir();
		pessoa.calcularIdade();
		
		// Agenda
		Agenda agenda = new Agenda();
		agenda.armazenarPessoa(0, pessoa);
		agenda.imprimirAgenda();
		
	}

}
