
public class Aluno extends Pessoa {
	// A classe Aluno extende os objetos de PessoaFisica
	
	private String matricula; // Referenciar para encapsulamento
		
	
	// Construtor que passa nome e matricula
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	// Construtor simples
	public Aluno() {
		
	}
	
	public Aluno salvar(Aluno aluno) throws AlunoException {
		try{aluno.getMatricula();
		aluno.setNome(null);
		}catch (Exception error) {
			throw new AlunoException("Erro ao salvar aluno");
		}
		return null;
	}

	public final String getMatricula() {
		return matricula;
	}

	public final void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
