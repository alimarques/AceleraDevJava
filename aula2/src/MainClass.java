
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construtores
		Aluno aluno = new Aluno("Ali", "183462");
		Aluno aluno2 = new Aluno();

		// Heranca
		aluno.setCpf("54867923104");
		//System.out.println(aluno.getCpf());

		// Excecoes
		//aluno2.salvar(aluno);
		
		// Classe Pessoa
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDataNascimento("06/11/1998");
		pessoa1.setAltura(1.59);
		pessoa1.setNome("Ali");
		//pessoa1.imprimir();
		//pessoa1.calcularIdade();
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setDataNascimento("13/12/1965");
		pessoa2.setAltura(1.64);
		pessoa2.setNome("Jose");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setDataNascimento("13/12/2003");
		pessoa3.setAltura(1.80);
		pessoa3.setNome("Laura");
		
		// Classe Agenda
		Agenda agenda = new Agenda();
		agenda.armazenarPessoa(pessoa1);
		agenda.armazenarPessoa(pessoa2);
		agenda.armazenarPessoa(pessoa3);
		//agenda.imprimirAgenda();
		
		agenda.imprimirPessoa("Ali");
		
		System.out.println();
		agenda.imprimirPessoa("Fabio");
		
		agenda.removerPessoa("Jose");
		
		System.out.println();
		agenda.imprimirAgenda();
		
		System.out.println();
		agenda.consultarVagas();
		
	}

}
