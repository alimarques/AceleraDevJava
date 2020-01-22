
public class Aluno extends PessoaFisica {

	private String nome; 		// Referenciar para encapsulamento
	private String matricula; 	
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno() {
		
	}
	
	public Aluno salvar(Aluno aluno) throws AlunoException {
		try{aluno.setMatricula("183462");
		aluno.setNome(null);
		}catch (Exception e) {
			throw new AlunoException("Erro ao salvar aluno");
		}
		return null;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getMatricula() {
		return matricula;
	}

	public final void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
