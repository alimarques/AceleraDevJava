
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construtores
		Aluno aluno = new Aluno("Ali", "183462");
		Aluno aluno2 = new Aluno();

		// Heranca
		aluno.setCpf("54867923104");
		aluno2.setNome("Julia");
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
		Pessoa[] pessoas = {pessoa2,pessoa3};
		agenda.armazenarPessoa(pessoa1);
		agenda.armazenarPessoa(pessoas);
		
		if(false) {
			TesteAgenda(agenda);
		}
		
		// Classe Elevador
		Elevador elevador = new Elevador(8,10);
		
		if(false) {
			TesteElevador(elevador);
		}

	}
	
	public static void TesteAgenda(Agenda agenda) {
		// Teste com Classe Agenda
		agenda.imprimirAgenda();
		
		agenda.imprimirPessoa("Ali");
		
		System.out.println();
		agenda.imprimirPessoa("Fabio");
				
		agenda.removerPessoa("Jose");
				
		System.out.println();
		agenda.imprimirAgenda();
			
		System.out.println();
		agenda.consultarVagas();
	}
	
	public static void TesteElevador(Elevador elevador) {
		// Teste com Classe Elevador
		elevador.entrar(5);
		System.out.println(elevador.getQuantPessoas());
		elevador.sair(7);
		System.out.println(elevador.getQuantPessoas());
		elevador.subir(1);
		System.out.println(elevador.getAndarAtual());
	}

}


